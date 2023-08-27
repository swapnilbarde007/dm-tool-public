package com.ericsson.fdp.ui;

import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StageInitializer implements ApplicationListener<Home.StageReadyEvent> {
    @Override
    public void onApplicationEvent(Home.StageReadyEvent stageReadyEvent) {
        Stage stage =stageReadyEvent.getStage();
    }
}
