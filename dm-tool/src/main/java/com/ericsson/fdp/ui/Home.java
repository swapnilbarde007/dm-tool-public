package com.ericsson.fdp.ui;

import com.ericsson.fdp.DmToolApplication;
import com.ericsson.fdp.dao.dto.*;
import com.ericsson.fdp.dao.template.KeyValueEntry;
import com.ericsson.fdp.utilis.MultilineListCell;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;
import javafx.scene.Scene;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Home extends Application {
    private ConfigurableApplicationContext configurableApplicationContext;

    DMSyncDTO dmSyncDTO1Comp;
    DMSyncDTO dmSyncDTO2Comp;

    StringBuffer sbComparison;
    //For Section 1
    //Tree View
    private TreeView<String> treeView1;

    //Step Details
    private ListView<KeyValueEntry> listView1;

    //Constraint Substep Details for condition list
    private TreeView<String> substepListView1;

    //NonConstraint Nodes to hold linear list
    private List<ConstraintNodeDTO> treeItemsList1;

    //Constraint Nodes to hold linear list
    private List<ConstraintNodeDTO> treeItemList3;

    //Result Area for comparison

    private TextArea resultListView;


    //For Section 2
    //Tree View
    private TreeView<String> treeView2;

    //Step Details
    private ListView<KeyValueEntry> listView2;

    //Constraint Substep Details for conditions
    private TreeView<String> substepListView2;

    //NonConstraint Nodes to hold linear list
    private List<ConstraintNodeDTO> treeItemsList2;

    //Constraint Nodes to hold linear list
    private List<ConstraintNodeDTO> treeItemList4;


    //Root Object Section 1
    private DMSyncDTO dmSyncDTOObj1;

    //Root Object Section 2
    private DMSyncDTO dmSyncDTOObj2;


    private List<ConstraintNodeDTO> treeConstraintList1;
    private List<ConstraintNodeDTO> treeConstraintList2;

    @Override
    public void init() {
        configurableApplicationContext = new SpringApplicationBuilder(DmToolApplication.class).run();
    }

    static class StageReadyEvent extends ApplicationEvent {
        public StageReadyEvent(Stage stage) {
            super(stage);
        }

        public Stage getStage() {
            return ((Stage) getSource());
        }
    }

    @Override
    public void stop() {
        configurableApplicationContext.close();
        Platform.exit();
    }

    @Override
    public void start(Stage stage) throws Exception {
        configurableApplicationContext.publishEvent(new StageReadyEvent(stage));
        //Initialization
        stage.setTitle("Spring Boot JavaFX Example");
        ScrollPane scrollPane = new ScrollPane();

        VBox root = new VBox(20);
        root.setPadding(new Insets(10));

        HBox inputArea = new HBox(20);
        inputArea.setPadding(new Insets(10));

        HBox outputArea = new HBox(20);
        outputArea.setPadding(new Insets(0));

        //Section 1
        VBox section1 = new VBox(10);

        Label label1 = new Label("Enter DM Object:");

        TextArea textArea1 = new TextArea();
        textArea1.setWrapText(true);

        HBox buttonArea1 = new HBox(10);
        buttonArea1.setPadding(new Insets(2));

        Button processButton1 = new Button("Process");
        Button clearButton1 = new Button("Clear");

        buttonArea1.getChildren().addAll(processButton1, clearButton1);

        treeView1 = new TreeView<>();
        //TreeItem<String> rootItem1 = new TreeItem<>("Root");
        //treeView1.setRoot(rootItem1);
        treeView1.setOnContextMenuRequested(event -> onContextMenuRequested(event, 0));
        treeView1.setOnMouseClicked(event -> onMouseClicked(event, 0));
        //listView1 = new ListView<>();
        //ObservableList<String> items1 = FXCollections.observableArrayList(
        //    "Item 1", "Item 2", "Item 3", "Item 4", "Item 5"
        //);
        //listView1.setItems(items1);
        listView1 = new ListView<>();


        substepListView1 = new TreeView<>();

        //Button compareButton = new Button("Compare");
        TreeItem<String> rootItem1 = new TreeItem<>("UAE");
        treeView1.setRoot(rootItem1);
        processButton1.setOnAction(event -> processTextArea(textArea1, treeView1, 0));
        clearButton1.setOnAction(event -> textArea1.clear());
        //compareButton.setOnAction(event -> compareSections());
        textArea1.setMaxHeight(100);
        treeView1.setMaxHeight(150);
        listView1.setMaxHeight(100);
        substepListView1.setMaxHeight(150);
        sbComparison = new StringBuffer();
        section1.getChildren().addAll(label1, textArea1, buttonArea1, treeView1, listView1, substepListView1);

        inputArea.getChildren().add(section1);


        //Section 2
        VBox section2 = new VBox(10);

        Label label2 = new Label("Enter DM Object:");

        TextArea textArea2 = new TextArea();
        textArea2.setWrapText(true);

        Button processButton2 = new Button("Process");
        Button clearButton2 = new Button("Clear");

        HBox buttonArea2 = new HBox(10);
        buttonArea2.setPadding(new Insets(2));

        buttonArea2.getChildren().addAll(processButton2, clearButton2);


        treeView2 = new TreeView<>();
        treeView2.setOnContextMenuRequested(event -> onContextMenuRequested(event, 1));
        treeView2.setOnMouseClicked(event -> onMouseClicked(event, 1));
        //TreeItem<String> rootItem2 = new TreeItem<>("Root");
        //treeView2.setRoot(rootItem2);
        substepListView2 = new TreeView<>();
        listView2 = new ListView<>();


        TreeItem<String> rootItem2 = new TreeItem<>("UAE");
        treeView2.setRoot(rootItem2);

        processButton2.setOnAction(event -> processTextArea(textArea2, treeView2, 1));
        clearButton2.setOnAction(event -> textArea2.clear());
        //compareButton.setOnAction(event -> compareSections());

        textArea2.setMaxHeight(100);
        treeView2.setMaxHeight(150);
        listView2.setMaxHeight(100);
        substepListView2.setMaxHeight(150);
        section2.getChildren().addAll(label2, textArea2, buttonArea2, treeView2, listView2, substepListView2);

        inputArea.getChildren().add(section2);

        VBox resultArea = new VBox(20);
        resultArea.setPadding(new Insets(10));
        resultArea.setMaxHeight(200);
        resultArea.setMinWidth(800);


        Button compareButton = new Button("Compare");
        compareButton.setOnAction(event -> compareSections(dmSyncDTOObj1, dmSyncDTOObj2, resultListView));

        resultListView = new TextArea();
        resultListView.setWrapText(true);
        //resultListView.setCellFactory(param -> new MultilineListCell());

        resultArea.getChildren().addAll(compareButton, resultListView);

        outputArea.getChildren().add(resultArea);

        root.getChildren().addAll(inputArea, outputArea);

        scrollPane.setContent(root);

        Scene scene = new Scene(scrollPane, 1050, 600);
        stage.setScene(scene);
        stage.show();


    }


    private void processTextArea(TextArea textArea, TreeView<String> treeView, int idx) {
        // Implement logic to process JSON from textArea and populate the tree view
        // You need to parse the JSON and build the tree structure based on your data
        // For example:
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            DMSyncDTO rootNode = mapper.readValue(textArea.getText(), DMSyncDTO.class);
            if (idx == 0) {
                dmSyncDTOObj1 = rootNode;
                treeItemsList1 = new ArrayList<>();
                treeItemList3 = new ArrayList<>();
                //System.out.println("Root Node: "+dmSyncDTOObj1.getBaseNodeDTO().getChildList().get(0).getStepList());
            } else if (idx == 1) {
                dmSyncDTOObj2 = rootNode;
                treeItemsList2 = new ArrayList<>();
                treeItemList4 = new ArrayList<>();
            }
            ConstraintNodeDTO baseNodeDTO;
            baseNodeDTO = rootNode.getBaseNodeDTO();
            Pattern ptUserCode = Pattern.compile("\\*([0-9]+)#");
            Matcher mtUserCode = ptUserCode.matcher(rootNode.getBaseNodeDTO().getCode());
            TreeItem<String> treeBaseNodeDTO;
            if (mtUserCode.find()) {
                treeBaseNodeDTO = new TreeItem<>(mtUserCode.group(1) + "P" + baseNodeDTO.getPriority() + " [" + baseNodeDTO.getCode() + "] " + baseNodeDTO.getName());
            } else {
                treeBaseNodeDTO = new TreeItem<>(" [" + baseNodeDTO.getCode() + "] " + baseNodeDTO.getName());
            }

            treeView.getRoot().getChildren().add(treeBaseNodeDTO);
            ConstraintNodeDTO cloneItem = baseNodeDTO.clone();
            cloneItem.setChildList(null);

            if (idx == 0) {
                if (cloneItem.getStepList() != null) {
                    //System.out.println("Get Substep DTO: "+cloneItem.getStepList().size());
                    treeItemList3.add(cloneItem);
                } else {
                    treeItemsList1.add(cloneItem);
                }
                getTreeItems(baseNodeDTO, treeView.getRoot(), treeItemsList1, treeItemList3);
            } else {
                if (cloneItem.getStepList() != null) {
                    //System.out.println("Get Substep DTO: "+cloneItem.getStepList().size());
                    treeItemList4.add(cloneItem);
                } else {
                    treeItemsList2.add(cloneItem);
                }
                getTreeItems(baseNodeDTO, treeView.getRoot(), treeItemsList2, treeItemList4);
            }
            //System.out.println("Tree Items List: "+treeItemsList1);


        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }

    }

    private void getTreeItems(ConstraintNodeDTO noConstraintNodeDTO, TreeItem<String> treeItem, List<ConstraintNodeDTO> treeItemsList, List<ConstraintNodeDTO> treeItemsList_a) throws CloneNotSupportedException {
        if (noConstraintNodeDTO.getChildList() != null) {
            TreeItem<String> newItem;
            for (ConstraintNodeDTO item : noConstraintNodeDTO.getChildList()) {
                Pattern ptUserCode = Pattern.compile("\\*([0-9]+)#");
                Matcher mtUserCode = ptUserCode.matcher(item.getCode());
                TreeItem<String> treeBaseNodeDTO;
                if (mtUserCode.find()) {
                    //System.out.println("mt"+mtUserCode.group(1));
                    newItem = new TreeItem<>(mtUserCode.group(1) + "P" + item.getPriority() + " [" + item.getCode() + "] " + item.getName());
                } else {
                    newItem = new TreeItem<>(" [" + item.getCode() + "] " + item.getName());
                }
                // TreeItem<String> newItem = new TreeItem<>("[" + item.getCode() + "] " + item.getName());
                treeItem.getChildren().add(newItem);
                ConstraintNodeDTO cloneItem = item.clone();
                cloneItem.setChildList(null);
                if (cloneItem.getStepList() != null) {
                    //System.out.println("Get Substep DTO: "+cloneItem.getStepList().size());
                    treeItemsList_a.add(cloneItem);
                } else {
                    //System.out.println("No Substep");
                    treeItemsList.add(cloneItem);
                }
                getTreeItems(item, newItem, treeItemsList, treeItemsList_a);
            }
        }


    }

    private void onContextMenuRequested(ContextMenuEvent event, int idx) {
        if (idx == 0) {
            TreeItem<String> item = treeView1.getSelectionModel().getSelectedItem();

            if (item != null) {
                //System.out.println(item.getValue());

                String extractedValue = extractCode(item.getValue());
                //System.out.println("Extracted value: " + getItemByCode(extractedValue,idx));

            }
        } else {
            TreeItem<String> item = treeView2.getSelectionModel().getSelectedItem();

            if (item != null) {
                String extractedValue = extractCode(item.getValue());
                //System.out.println("Extracted value: " + getItemByCode(extractedValue,idx));

            }
        }
    }

    private void onMouseClicked(MouseEvent event, int idx) {

        if (idx == 0) {
            TreeItem<String> item = treeView1.getSelectionModel().getSelectedItem();

            if (item != null) {

                String extractedValue = extractCode(item.getValue());
                System.out.println("Extracted value: " + getItemByCode(extractedValue, idx));
                displayObjectProperties(listView1, getItemByCode(extractedValue, idx), substepListView1);

            }
        } else {
            TreeItem<String> item = treeView2.getSelectionModel().getSelectedItem();

            if (item != null) {
                String extractedValue = extractCode(item.getValue());
                System.out.println("Extracted value: " + getItemByCode(extractedValue, idx));
                displayObjectProperties(listView2, getItemByCode(extractedValue, idx), substepListView2);
            }
        }
    }

    private void displayObjectProperties(ListView<KeyValueEntry> listView, ConstraintNodeDTO constraintNodeDTO, TreeView<String> substepListView) {

        substepListView.setRoot(null);
        TreeItem<String> substepRoot = new TreeItem<>("Constraints");
        if (constraintNodeDTO.getStepList() != null) {
            substepListView.setRoot(substepRoot);
            for (ConstraintStepDTO constraintStepDTO : constraintNodeDTO.getStepList()) {
                TreeItem<String> constraintStep = new TreeItem<>(constraintStepDTO.getOperator());
                substepRoot.getChildren().add(constraintStep);
                if (constraintStepDTO.getSubStepDTOList() != null) {
                    for (SubStepConstraintDTO subStepConstraintDTO : constraintStepDTO.getSubStepDTOList()) {
                        TreeItem<String> subStepItem = new TreeItem<>(
                                "" + subStepConstraintDTO.getCommandName() + '\'' +
                                        " | " + subStepConstraintDTO.getFullyQualifiedPath() + '\'' +
                                        " | " + subStepConstraintDTO.getConditionName() + '\'' +
                                        " | " + Arrays.toString(subStepConstraintDTO.getPossibleValuesList()) + '\'' +
                                        " | " + subStepConstraintDTO.getOperator());
                        constraintStep.getChildren().add(subStepItem);
                    }
                }
            }
        } else {
            substepListView.setRoot(null);
        }

        // Get the fields from the parent class NoConstraintNodeDTO
       /* Class<?> parentClass = constraintNodeDTO.getClass().getSuperclass();
        if (parentClass != null && parentClass.isAssignableFrom(NoConstraintNodeDTO.class)) {
            Field[] parentFields = parentClass.getDeclaredFields();
            for (Field field : parentFields) {
                field.setAccessible(true);
                String fieldName = field.getName();
                Object fieldValue;
                try {
                    fieldValue = field.get(constraintNodeDTO);
                } catch (IllegalAccessException e) {
                    fieldValue = "Error accessing field";
                }
                keyValueList.add(new KeyValueEntry(fieldName, fieldValue != null ? fieldValue.toString() : "null"));
            }
        }*/
        List<KeyValueEntry> keyValueList = new ArrayList<>();
        keyValueList.add(new KeyValueEntry("Name: ", constraintNodeDTO.getName()));
        keyValueList.add(new KeyValueEntry("Code: ", constraintNodeDTO.getCode()));
        keyValueList.add(new KeyValueEntry("Priority: ", String.valueOf(constraintNodeDTO.getPriority())));
        keyValueList.add(new KeyValueEntry("Policy: ", constraintNodeDTO.getPolicy()));
        keyValueList.add(new KeyValueEntry("Action: ", constraintNodeDTO.getAction()));
        keyValueList.add(new KeyValueEntry("Entity Val[Product Id]: ", constraintNodeDTO.getEntityValue()));
        keyValueList.add(new KeyValueEntry("Arabic Disp Name: ", constraintNodeDTO.getAddInfo().getAddInfoMap().get("ARABIC_DISPLAY_NAME")));
        keyValueList.add(new KeyValueEntry("Hindi Disp Name: ", constraintNodeDTO.getAddInfo().getAddInfoMap().get("HINDI_DISPLAY_NAME")));
        keyValueList.add(new KeyValueEntry("Other Disp Name: ", constraintNodeDTO.getAddInfo().getAddInfoMap().get("OTHERLANGUAGE_DISPLAY_NAME")));
        keyValueList.add(new KeyValueEntry("Alias Code Channel: ", constraintNodeDTO.getAliasCodeDTO().getChannelName()));
        keyValueList.add(new KeyValueEntry("Alias Orig Code: ", constraintNodeDTO.getAliasCodeDTO().getCode()));
        keyValueList.add(new KeyValueEntry("Alias Code: ", constraintNodeDTO.getAliasCodeDTO().getAlias()));

        ObservableList<KeyValueEntry> items = FXCollections.observableArrayList(keyValueList);
        listView.setItems(items);
    }


    private String extractCode(String ipString) {
        String patternString = "\\[(.*?)\\]";  // Regular expression pattern

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(ipString);
        String opValue = "";
        if (matcher.find()) {
            opValue = matcher.group(1); // Extracted value within the brackets
        }
        return opValue;
    }

    private ConstraintNodeDTO getItemByCode(String code, int idx) {

        List<ConstraintNodeDTO> treeItemsList, treeItemList_a;
        if (idx == 0) {
            treeItemsList = treeItemsList1;
            treeItemList_a = treeItemList3;
        } else {
            treeItemsList = treeItemsList2;
            treeItemList_a = treeItemList4;
        }
        for (ConstraintNodeDTO node : treeItemsList) {
            if (code.equals(node.getCode())) {
                System.out.println("Class: " + node);
                return node;
            }

        }
        for (ConstraintNodeDTO node : treeItemList_a) {
            if (code.equals(node.getCode())) {
                System.out.println("Class: " + node);
                return node;
            }

        }

        return null;
    }

    private void createTreeView(TreeItem<String> parentItem, String itemName, JsonNode jsonNode) {
        TreeItem<String> currentItem = new TreeItem<>(itemName);
        parentItem.getChildren().add(currentItem);

        if (jsonNode.isObject()) {
            jsonNode.fields().forEachRemaining(entry -> createTreeView(currentItem, entry.getKey(), entry.getValue()));
        } else if (jsonNode.isArray()) {
            int index = 0;
            for (JsonNode arrayElement : jsonNode) {
                createTreeView(currentItem, "[" + index + "]", arrayElement);
                index++;
            }
        } else {
            currentItem.setValue(jsonNode.asText());
        }
    }


    private void compareSections(DMSyncDTO dmSyncDTO1, DMSyncDTO dmSyncDTO2, TextArea resultTextArea) {
        if (dmSyncDTO1 != null && dmSyncDTO2 != null) {
            //Compare Static Params
            compareConstraintNodeDTO(dmSyncDTO1.getBaseNodeDTO(), dmSyncDTO2.getBaseNodeDTO());
        }
        resultTextArea.setText(sbComparison.toString());
        //Check child params
        //Check additional info params
        //Check Constraint params

    }

    private StringBuffer compareConstraintNodeDTO(ConstraintNodeDTO constraintNodeDTO1, ConstraintNodeDTO constraintNodeDTO2) {

        //sbComparison.append("\n" + constraintNodeDTO1.getCode() + " with " + constraintNodeDTO2.getCode());
        //System.out.println("Checking: " + constraintNodeDTO1.getCode() + " with " + constraintNodeDTO2.getCode());
        if (constraintNodeDTO1 != null & constraintNodeDTO2 != null) {

            if (constraintNodeDTO1.getCode().equals(constraintNodeDTO2.getCode())) {
                //Attribute level checks

                if (!(constraintNodeDTO1.getName().equals(constraintNodeDTO2.getName()))) {
                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Name: " + constraintNodeDTO1.getName() + " Obj2 --> Name: " + constraintNodeDTO2.getName());
                }
                if (!(constraintNodeDTO1.getPriority() == constraintNodeDTO2.getPriority())) {
                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Priority: " + constraintNodeDTO1.getPriority() + " Obj2 --> Priority: " + constraintNodeDTO2.getPriority());
                }
                if (!(constraintNodeDTO1.getLevel() == constraintNodeDTO2.getLevel())) {
                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Level: " + constraintNodeDTO1.getLevel() + " Obj2 --> Level: " + constraintNodeDTO2.getLevel());

                }

                //Policy Check with Nulls
                if (constraintNodeDTO1.getPolicy() == null && constraintNodeDTO2.getPolicy() == null) {
                    //Skip
                } else {
                    if (constraintNodeDTO1.getPolicy() == null && constraintNodeDTO2.getPolicy() != null) {
                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Policy: " + constraintNodeDTO1.getPolicy() + " Obj2 --> Policy: " + constraintNodeDTO2.getPolicy());
                    }
                    if (constraintNodeDTO1.getPolicy() != null && constraintNodeDTO2.getPolicy() == null) {
                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Policy: " + constraintNodeDTO1.getPolicy() + " Obj2 --> Policy: " + constraintNodeDTO2.getPolicy());
                    } else if (!(constraintNodeDTO1.getPolicy().equals(constraintNodeDTO2.getPolicy()))) {
                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Policy: " + constraintNodeDTO1.getPolicy() + " Obj2 --> Policy: " + constraintNodeDTO2.getPolicy());
                    }
                }
                //Action Check with Nulls
                if (constraintNodeDTO1.getAction() == null && constraintNodeDTO2.getAction() == null) {
                    //Skip
                } else {
                    if (constraintNodeDTO1.getAction() == null && constraintNodeDTO2.getAction() != null) {
                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Action: " + constraintNodeDTO1.getAction() + " Obj2 --> Action: " + constraintNodeDTO2.getAction());
                    }
                    if (constraintNodeDTO1.getAction() != null && constraintNodeDTO2.getAction() == null) {
                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Action: " + constraintNodeDTO1.getAction() + " Obj2 --> Action: " + constraintNodeDTO2.getAction());
                    } else if (!(constraintNodeDTO1.getAction().equals(constraintNodeDTO2.getAction()))) {
                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Action: " + constraintNodeDTO1.getAction() + " Obj2 --> Action: " + constraintNodeDTO2.getAction());
                    }
                }
                if (!(constraintNodeDTO1.getProductId() == constraintNodeDTO2.getProductId())) {
                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Product ID: " + constraintNodeDTO1.getProductId() + " Obj2 --> Product ID: " + constraintNodeDTO2.getProductId());
                }
                //Entity Value Check with Nulls
                if (constraintNodeDTO1.getEntityValue() == null && constraintNodeDTO2.getEntityValue() == null) {
                    //Skip
                } else {
                    if (constraintNodeDTO1.getEntityValue() == null && constraintNodeDTO2.getEntityValue() != null) {
                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Entity Value: " + constraintNodeDTO1.getEntityValue() + " Obj2 --> Entity Value: " + constraintNodeDTO2.getEntityValue());
                    }
                    if (constraintNodeDTO1.getEntityValue() != null && constraintNodeDTO2.getEntityValue() == null) {
                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Entity Value: " + constraintNodeDTO1.getEntityValue() + " Obj2 --> Entity Value: " + constraintNodeDTO2.getEntityValue());
                    } else if (!(constraintNodeDTO1.getEntityValue().equals(constraintNodeDTO2.getEntityValue()))) {
                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Entity Value: " + constraintNodeDTO1.getEntityValue() + " Obj2 --> Entity Value: " + constraintNodeDTO2.getEntityValue());
                    }
                }
                if (constraintNodeDTO1.getAddInfo().equals(constraintNodeDTO2.getAddInfo())) {
                    //Skip
                } else {
                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Additional Info Map: " + constraintNodeDTO1.getAddInfo() + " Obj2 --> Additional Info Map: " + constraintNodeDTO2.getAddInfo());
                }

                if (constraintNodeDTO1.getStepList() != null && constraintNodeDTO2.getStepList() != null) {
                    //Check No. of Steps are equal
                    if(constraintNodeDTO1.getStepList().size()==constraintNodeDTO2.getStepList().size()){
                        //For each step
                        for (ConstraintStepDTO constraintStepDTO1 : constraintNodeDTO1.getStepList()) {
                            for (ConstraintStepDTO constraintStepDTO2 : constraintNodeDTO2.getStepList()) {
                                    if (!(constraintStepDTO1.getOperator().contentEquals(constraintStepDTO2.getOperator()))) {
                                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " Constaint Step --> " + " obj1 --> Operator: " + constraintStepDTO1.getOperator() + " Obj2 --> Operator: " + constraintStepDTO2.getOperator());
                                    }
                                    if (constraintStepDTO1.getSubStepDTOList() != null && constraintStepDTO2.getSubStepDTOList() != null) {
                                        //For each sub-step
                                        for (SubStepConstraintDTO subStepConstraintDTO1 : constraintStepDTO1.getSubStepDTOList()) {
                                            for (SubStepConstraintDTO subStepConstraintDTO2 : constraintStepDTO2.getSubStepDTOList()) {

                                                if (!(subStepConstraintDTO1.getOperator().contentEquals(subStepConstraintDTO2.getOperator()))) {
                                                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " Constaint Substep --> " + " obj1 --> Operator: " + subStepConstraintDTO1.getOperator() + " Obj2 --> Operator: " + subStepConstraintDTO1.getOperator());
                                                }
                                                if (subStepConstraintDTO1.getCondition() != subStepConstraintDTO2.getCondition()) {
                                                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " Constaint Substep --> " + " obj1 --> Condition: " + subStepConstraintDTO1.getCondition() + " Obj2 --> Condition: " + subStepConstraintDTO1.getCondition());
                                                }
                                                if (!(subStepConstraintDTO1.getPossibleValuesList().equals(subStepConstraintDTO2.getPossibleValuesList()))) {
                                                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " Constaint Substep --> " + " obj1 --> Possible Value List: " + subStepConstraintDTO1.getPossibleValuesList() + " Obj2 --> Possible Value List: " + subStepConstraintDTO1.getPossibleValuesList());
                                                }
                                                if (!(subStepConstraintDTO1.getPossibleValues().contentEquals(subStepConstraintDTO2.getPossibleValues()))) {
                                                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " Constaint Substep --> " + " obj1 --> Possible Value: " + subStepConstraintDTO1.getPossibleValues() + " Obj2 --> Possible Value: " + subStepConstraintDTO1.getPossibleValues());
                                                }
                                                if (!(subStepConstraintDTO1.getDataType().contentEquals(subStepConstraintDTO2.getDataType()))) {
                                                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " Constaint Substep --> " + " obj1 --> Data Type: " + subStepConstraintDTO1.getDataType() + " Obj2 --> Data Type: " + subStepConstraintDTO1.getDataType());
                                                }
                                                if (!(subStepConstraintDTO1.getCommandName().contentEquals(subStepConstraintDTO2.getCommandName()))) {
                                                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " Constaint Substep --> " + " obj1 --> Command Name: " + subStepConstraintDTO1.getCommandName() + " Obj2 --> Command Name: " + subStepConstraintDTO1.getCommandName());
                                                }
                                                if (!(subStepConstraintDTO1.getConditionName().contentEquals(subStepConstraintDTO2.getConditionName()))) {
                                                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " Constaint Substep --> " + " obj1 --> Condition Name: " + subStepConstraintDTO1.getConditionName() + " Obj2 --> Condition Name: " + subStepConstraintDTO1.getConditionName());
                                                }
                                                if (!(subStepConstraintDTO1.getFullyQualifiedPath().contentEquals(subStepConstraintDTO2.getFullyQualifiedPath()))) {
                                                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " Constaint Substep --> " + " obj1 --> Fully Qualified Path: " + subStepConstraintDTO1.getFullyQualifiedPath() + " Obj2 --> Fully Qualified Path: " + subStepConstraintDTO1.getFullyQualifiedPath());
                                                }
                                                if (!(subStepConstraintDTO1.getCommandParameterName().contentEquals(subStepConstraintDTO2.getCommandParameterName()))) {
                                                    sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " Constaint Substep --> " + " obj1 --> Command Param name: " + subStepConstraintDTO1.getCommandParameterName() + " Obj2 --> Command Param Name: " + subStepConstraintDTO1.getCommandParameterName());
                                                }

                                            }
                                        }
                                    } else if (constraintStepDTO1.getSubStepDTOList() == null && constraintStepDTO2.getSubStepDTOList() != null) {
                                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " Constaint Substep --> " + " obj1 --> Substep list is null where as obj2 --> has substeps");
                                    } else if (constraintStepDTO1.getSubStepDTOList() != null && constraintStepDTO2.getSubStepDTOList() == null) {
                                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " Constaint Substep --> " + " obj1 --> Substep list has substeps where as obj2 --> is null");
                                    } else {
                                        //Skip
                                    }


                            }
                        }
                    }else{
                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " Constaint Step Count --> obj1 --> has: " + constraintNodeDTO1.getStepList().size() + " vs Obj2 --> : " + constraintNodeDTO2.getStepList().size());
                    }

                } else if (constraintNodeDTO1.getStepList() != null && constraintNodeDTO2.getStepList() == null) {

                } else if (constraintNodeDTO1.getStepList() == null && constraintNodeDTO2.getStepList() != null) {

                } else {
                    //Skip
                }

                if (constraintNodeDTO1.getChildList() != null && constraintNodeDTO2.getChildList() != null) {
                    if (constraintNodeDTO1.getChildList().size() == constraintNodeDTO2.getChildList().size()) {
                        //Skip
                    } else {
                        sbComparison.append("\nDiff found " + constraintNodeDTO1.getCode() + " obj1 --> Has no. of child: " + constraintNodeDTO1.getChildList().size() + " vs Obj2 --> no. of child: " + constraintNodeDTO1.getChildList().size());
                    }
                }

                //System.out.println(sbComparison);
                if (constraintNodeDTO1.getChildList() != null && constraintNodeDTO2.getChildList() != null) {
                    for (ConstraintNodeDTO node1 : constraintNodeDTO1.getChildList()) {
                        for (ConstraintNodeDTO node2 : constraintNodeDTO2.getChildList()) {
                            if (node1.getCode().equals(node2.getCode()))
                                compareConstraintNodeDTO(node1, node2);
                        }
                    }
                }
            }

        }
        return sbComparison;
    }

}








