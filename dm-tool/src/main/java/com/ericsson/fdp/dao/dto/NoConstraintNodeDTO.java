package com.ericsson.fdp.dao.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.w3c.dom.Node;

import java.util.List;


@ToString
public class NoConstraintNodeDTO implements Cloneable{

    String createdBy;
    String modifiedBy;
    long id;
    String code;
    int visibility;
    String aliasCode;
    String name;
    String defaultOption;
    String channelName;
    boolean isActive;
    int priority;
    int level;
    int status;
    int parentId;
    String circle;
    String shortCode;
    String policy;
    List<ConstraintNodeDTO> childList;
    DynamicMenuAddInfoDTO addInfo;
    FDPAliasCodeDTO aliasCodeDTO;
    long loanSuccessNotificationId;
    long codNotificationId;
    long loanFailureNotificationId;
    long codSuccessNotificationId;
    String rootNodeUSSDCode;
    String rootNodeName;
    int mainMenuPriority;
    String mainMenuHeader;
    int subMenuPriority;
    String subMenuHeader;
    int subSubMenuPriority;
    String subSubMenuHeader;
    String subSubSubMenuHeader;
    int subSubSubMenuPriority;
    String parentCode;
    String productDisplayName;
    String productDispalyNameOnWEB;
    String productDisplayNameOnUSSD;
    String action;
    int productId;
    String dmChannelType;
    String mainMenuUSSDCode;
    String subMenuUSSDCode;
    String subSubMenuUSSDCode;
    String subSubSubMenuUSSDCode;
    String menuType;
    String defaultOptionH;
    String defaultOptionArabic;
    String defaultOptionOtherLanguage;
    boolean directExecutionNodem;
    boolean autoExecute;
    long rootNodeId;
    boolean whitelisted;

    public NoConstraintNodeDTO() {
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public String getAliasCode() {
        return aliasCode;
    }

    public void setAliasCode(String aliasCode) {
        this.aliasCode = aliasCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefaultOption() {
        return defaultOption;
    }

    public void setDefaultOption(String defaultOption) {
        this.defaultOption = defaultOption;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public void setChildList(List<ConstraintNodeDTO> childList) {
        this.childList = childList;
    }

    public DynamicMenuAddInfoDTO getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(DynamicMenuAddInfoDTO addInfo) {
        this.addInfo = addInfo;
    }

    public FDPAliasCodeDTO getAliasCodeDTO() {
        return aliasCodeDTO;
    }

    public void setAliasCodeDTO(FDPAliasCodeDTO aliasCodeDTO) {
        this.aliasCodeDTO = aliasCodeDTO;
    }

    public long getLoanSuccessNotificationId() {
        return loanSuccessNotificationId;
    }

    public void setLoanSuccessNotificationId(long loanSuccessNotificationId) {
        this.loanSuccessNotificationId = loanSuccessNotificationId;
    }

    public long getCodNotificationId() {
        return codNotificationId;
    }

    public void setCodNotificationId(long codNotificationId) {
        this.codNotificationId = codNotificationId;
    }

    public long getLoanFailureNotificationId() {
        return loanFailureNotificationId;
    }

    public void setLoanFailureNotificationId(long loanFailureNotificationId) {
        this.loanFailureNotificationId = loanFailureNotificationId;
    }

    public long getCodSuccessNotificationId() {
        return codSuccessNotificationId;
    }

    public void setCodSuccessNotificationId(long codSuccessNotificationId) {
        this.codSuccessNotificationId = codSuccessNotificationId;
    }

    public String getRootNodeUSSDCode() {
        return rootNodeUSSDCode;
    }

    public void setRootNodeUSSDCode(String rootNodeUSSDCode) {
        this.rootNodeUSSDCode = rootNodeUSSDCode;
    }

    public String getRootNodeName() {
        return rootNodeName;
    }

    public void setRootNodeName(String rootNodeName) {
        this.rootNodeName = rootNodeName;
    }

    public int getMainMenuPriority() {
        return mainMenuPriority;
    }

    public void setMainMenuPriority(int mainMenuPriority) {
        this.mainMenuPriority = mainMenuPriority;
    }

    public String getMainMenuHeader() {
        return mainMenuHeader;
    }

    public void setMainMenuHeader(String mainMenuHeader) {
        this.mainMenuHeader = mainMenuHeader;
    }

    public int getSubMenuPriority() {
        return subMenuPriority;
    }

    public void setSubMenuPriority(int subMenuPriority) {
        this.subMenuPriority = subMenuPriority;
    }

    public String getSubMenuHeader() {
        return subMenuHeader;
    }

    public void setSubMenuHeader(String subMenuHeader) {
        this.subMenuHeader = subMenuHeader;
    }

    public int getSubSubMenuPriority() {
        return subSubMenuPriority;
    }

    public void setSubSubMenuPriority(int subSubMenuPriority) {
        this.subSubMenuPriority = subSubMenuPriority;
    }

    public String getSubSubMenuHeader() {
        return subSubMenuHeader;
    }

    public void setSubSubMenuHeader(String subSubMenuHeader) {
        this.subSubMenuHeader = subSubMenuHeader;
    }

    public String getSubSubSubMenuHeader() {
        return subSubSubMenuHeader;
    }

    public void setSubSubSubMenuHeader(String subSubSubMenuHeader) {
        this.subSubSubMenuHeader = subSubSubMenuHeader;
    }

    public int getSubSubSubMenuPriority() {
        return subSubSubMenuPriority;
    }

    public void setSubSubSubMenuPriority(int subSubSubMenuPriority) {
        this.subSubSubMenuPriority = subSubSubMenuPriority;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getProductDisplayName() {
        return productDisplayName;
    }

    public void setProductDisplayName(String productDisplayName) {
        this.productDisplayName = productDisplayName;
    }

    public String getProductDispalyNameOnWEB() {
        return productDispalyNameOnWEB;
    }

    public void setProductDispalyNameOnWEB(String productDispalyNameOnWEB) {
        this.productDispalyNameOnWEB = productDispalyNameOnWEB;
    }

    public String getProductDisplayNameOnUSSD() {
        return productDisplayNameOnUSSD;
    }

    public void setProductDisplayNameOnUSSD(String productDisplayNameOnUSSD) {
        this.productDisplayNameOnUSSD = productDisplayNameOnUSSD;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDmChannelType() {
        return dmChannelType;
    }

    public void setDmChannelType(String dmChannelType) {
        this.dmChannelType = dmChannelType;
    }

    public String getMainMenuUSSDCode() {
        return mainMenuUSSDCode;
    }

    public void setMainMenuUSSDCode(String mainMenuUSSDCode) {
        this.mainMenuUSSDCode = mainMenuUSSDCode;
    }

    public String getSubMenuUSSDCode() {
        return subMenuUSSDCode;
    }

    public void setSubMenuUSSDCode(String subMenuUSSDCode) {
        this.subMenuUSSDCode = subMenuUSSDCode;
    }

    public String getSubSubMenuUSSDCode() {
        return subSubMenuUSSDCode;
    }

    public void setSubSubMenuUSSDCode(String subSubMenuUSSDCode) {
        this.subSubMenuUSSDCode = subSubMenuUSSDCode;
    }

    public String getSubSubSubMenuUSSDCode() {
        return subSubSubMenuUSSDCode;
    }

    public void setSubSubSubMenuUSSDCode(String subSubSubMenuUSSDCode) {
        this.subSubSubMenuUSSDCode = subSubSubMenuUSSDCode;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getDefaultOptionH() {
        return defaultOptionH;
    }

    public void setDefaultOptionH(String defaultOptionH) {
        this.defaultOptionH = defaultOptionH;
    }

    public String getDefaultOptionArabic() {
        return defaultOptionArabic;
    }

    public void setDefaultOptionArabic(String defaultOptionArabic) {
        this.defaultOptionArabic = defaultOptionArabic;
    }

    public String getDefaultOptionOtherLanguage() {
        return defaultOptionOtherLanguage;
    }

    public void setDefaultOptionOtherLanguage(String defaultOptionOtherLanguage) {
        this.defaultOptionOtherLanguage = defaultOptionOtherLanguage;
    }

    public boolean isDirectExecutionNodem() {
        return directExecutionNodem;
    }

    public void setDirectExecutionNodem(boolean directExecutionNodem) {
        this.directExecutionNodem = directExecutionNodem;
    }

    public boolean isAutoExecute() {
        return autoExecute;
    }

    public void setAutoExecute(boolean autoExecute) {
        this.autoExecute = autoExecute;
    }

    public long getRootNodeId() {
        return rootNodeId;
    }

    public void setRootNodeId(long rootNodeId) {
        this.rootNodeId = rootNodeId;
    }

    public boolean isWhitelisted() {
        return whitelisted;
    }

    public void setWhitelisted(boolean whitelisted) {
        this.whitelisted = whitelisted;
    }



    public List<ConstraintNodeDTO> getChildList() {
        return this.childList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NoConstraintNodeDTO)) return false;

        NoConstraintNodeDTO that = (NoConstraintNodeDTO) o;

        if (getVisibility() != that.getVisibility()) return false;
        if (isActive() != that.isActive()) return false;
        if (getPriority() != that.getPriority()) return false;
        if (getLevel() != that.getLevel()) return false;
        if (getStatus() != that.getStatus()) return false;
        if (getMainMenuPriority() != that.getMainMenuPriority()) return false;
        if (getSubMenuPriority() != that.getSubMenuPriority()) return false;
        if (getSubSubMenuPriority() != that.getSubSubMenuPriority()) return false;
        if (getSubSubSubMenuPriority() != that.getSubSubSubMenuPriority()) return false;
        if (getProductId() != that.getProductId()) return false;
        if (isDirectExecutionNodem() != that.isDirectExecutionNodem()) return false;
        if (isAutoExecute() != that.isAutoExecute()) return false;
        if (getRootNodeId() != that.getRootNodeId()) return false;
        if (isWhitelisted() != that.isWhitelisted()) return false;
        if (getCreatedBy() != null ? !getCreatedBy().equals(that.getCreatedBy()) : that.getCreatedBy() != null)
            return false;
        if (getModifiedBy() != null ? !getModifiedBy().equals(that.getModifiedBy()) : that.getModifiedBy() != null)
            return false;
        if (getCode() != null ? !getCode().equals(that.getCode()) : that.getCode() != null) return false;
        if (getAliasCode() != null ? !getAliasCode().equals(that.getAliasCode()) : that.getAliasCode() != null)
            return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getDefaultOption() != null ? !getDefaultOption().equals(that.getDefaultOption()) : that.getDefaultOption() != null)
            return false;
        if (getChannelName() != null ? !getChannelName().equals(that.getChannelName()) : that.getChannelName() != null)
            return false;
        if (getCircle() != null ? !getCircle().equals(that.getCircle()) : that.getCircle() != null) return false;
        if (getShortCode() != null ? !getShortCode().equals(that.getShortCode()) : that.getShortCode() != null)
            return false;
        if (getPolicy() != null ? !getPolicy().equals(that.getPolicy()) : that.getPolicy() != null) return false;
        if (getChildList() != null ? !getChildList().equals(that.getChildList()) : that.getChildList() != null)
            return false;
        if (getAddInfo() != null ? !getAddInfo().equals(that.getAddInfo()) : that.getAddInfo() != null) return false;
        if (getAliasCodeDTO() != null ? !getAliasCodeDTO().equals(that.getAliasCodeDTO()) : that.getAliasCodeDTO() != null)
            return false;
        if (getRootNodeUSSDCode() != null ? !getRootNodeUSSDCode().equals(that.getRootNodeUSSDCode()) : that.getRootNodeUSSDCode() != null)
            return false;
        if (getRootNodeName() != null ? !getRootNodeName().equals(that.getRootNodeName()) : that.getRootNodeName() != null)
            return false;
        if (getMainMenuHeader() != null ? !getMainMenuHeader().equals(that.getMainMenuHeader()) : that.getMainMenuHeader() != null)
            return false;
        if (getSubMenuHeader() != null ? !getSubMenuHeader().equals(that.getSubMenuHeader()) : that.getSubMenuHeader() != null)
            return false;
        if (getSubSubMenuHeader() != null ? !getSubSubMenuHeader().equals(that.getSubSubMenuHeader()) : that.getSubSubMenuHeader() != null)
            return false;
        if (getSubSubSubMenuHeader() != null ? !getSubSubSubMenuHeader().equals(that.getSubSubSubMenuHeader()) : that.getSubSubSubMenuHeader() != null)
            return false;
        if (getParentCode() != null ? !getParentCode().equals(that.getParentCode()) : that.getParentCode() != null)
            return false;
        if (getProductDisplayName() != null ? !getProductDisplayName().equals(that.getProductDisplayName()) : that.getProductDisplayName() != null)
            return false;
        if (getProductDispalyNameOnWEB() != null ? !getProductDispalyNameOnWEB().equals(that.getProductDispalyNameOnWEB()) : that.getProductDispalyNameOnWEB() != null)
            return false;
        if (getProductDisplayNameOnUSSD() != null ? !getProductDisplayNameOnUSSD().equals(that.getProductDisplayNameOnUSSD()) : that.getProductDisplayNameOnUSSD() != null)
            return false;
        if (getAction() != null ? !getAction().equals(that.getAction()) : that.getAction() != null) return false;
        if (getDmChannelType() != null ? !getDmChannelType().equals(that.getDmChannelType()) : that.getDmChannelType() != null)
            return false;
        if (getMainMenuUSSDCode() != null ? !getMainMenuUSSDCode().equals(that.getMainMenuUSSDCode()) : that.getMainMenuUSSDCode() != null)
            return false;
        if (getSubMenuUSSDCode() != null ? !getSubMenuUSSDCode().equals(that.getSubMenuUSSDCode()) : that.getSubMenuUSSDCode() != null)
            return false;
        if (getSubSubMenuUSSDCode() != null ? !getSubSubMenuUSSDCode().equals(that.getSubSubMenuUSSDCode()) : that.getSubSubMenuUSSDCode() != null)
            return false;
        if (getSubSubSubMenuUSSDCode() != null ? !getSubSubSubMenuUSSDCode().equals(that.getSubSubSubMenuUSSDCode()) : that.getSubSubSubMenuUSSDCode() != null)
            return false;
        if (getMenuType() != null ? !getMenuType().equals(that.getMenuType()) : that.getMenuType() != null)
            return false;
        if (getDefaultOptionH() != null ? !getDefaultOptionH().equals(that.getDefaultOptionH()) : that.getDefaultOptionH() != null)
            return false;
        if (getDefaultOptionArabic() != null ? !getDefaultOptionArabic().equals(that.getDefaultOptionArabic()) : that.getDefaultOptionArabic() != null)
            return false;
        return getDefaultOptionOtherLanguage() != null ? getDefaultOptionOtherLanguage().equals(that.getDefaultOptionOtherLanguage()) : that.getDefaultOptionOtherLanguage() == null;
    }

    @Override
    public int hashCode() {
        int result = getCreatedBy() != null ? getCreatedBy().hashCode() : 0;
        result = 31 * result + (getModifiedBy() != null ? getModifiedBy().hashCode() : 0);
        result = 31 * result + (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getCode() != null ? getCode().hashCode() : 0);
        result = 31 * result + getVisibility();
        result = 31 * result + (getAliasCode() != null ? getAliasCode().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getDefaultOption() != null ? getDefaultOption().hashCode() : 0);
        result = 31 * result + (getChannelName() != null ? getChannelName().hashCode() : 0);
        result = 31 * result + (isActive() ? 1 : 0);
        result = 31 * result + getPriority();
        result = 31 * result + getLevel();
        result = 31 * result + getStatus();
        result = 31 * result + getParentId();
        result = 31 * result + (getCircle() != null ? getCircle().hashCode() : 0);
        result = 31 * result + (getShortCode() != null ? getShortCode().hashCode() : 0);
        result = 31 * result + (getPolicy() != null ? getPolicy().hashCode() : 0);
        result = 31 * result + (getChildList() != null ? getChildList().hashCode() : 0);
        result = 31 * result + (getAddInfo() != null ? getAddInfo().hashCode() : 0);
        result = 31 * result + (getAliasCodeDTO() != null ? getAliasCodeDTO().hashCode() : 0);
        result = 31 * result + (int) (getLoanSuccessNotificationId() ^ (getLoanSuccessNotificationId() >>> 32));
        result = 31 * result + (int) (getCodNotificationId() ^ (getCodNotificationId() >>> 32));
        result = 31 * result + (int) (getLoanFailureNotificationId() ^ (getLoanFailureNotificationId() >>> 32));
        result = 31 * result + (int) (getCodSuccessNotificationId() ^ (getCodSuccessNotificationId() >>> 32));
        result = 31 * result + (getRootNodeUSSDCode() != null ? getRootNodeUSSDCode().hashCode() : 0);
        result = 31 * result + (getRootNodeName() != null ? getRootNodeName().hashCode() : 0);
        result = 31 * result + getMainMenuPriority();
        result = 31 * result + (getMainMenuHeader() != null ? getMainMenuHeader().hashCode() : 0);
        result = 31 * result + getSubMenuPriority();
        result = 31 * result + (getSubMenuHeader() != null ? getSubMenuHeader().hashCode() : 0);
        result = 31 * result + getSubSubMenuPriority();
        result = 31 * result + (getSubSubMenuHeader() != null ? getSubSubMenuHeader().hashCode() : 0);
        result = 31 * result + (getSubSubSubMenuHeader() != null ? getSubSubSubMenuHeader().hashCode() : 0);
        result = 31 * result + getSubSubSubMenuPriority();
        result = 31 * result + (getParentCode() != null ? getParentCode().hashCode() : 0);
        result = 31 * result + (getProductDisplayName() != null ? getProductDisplayName().hashCode() : 0);
        result = 31 * result + (getProductDispalyNameOnWEB() != null ? getProductDispalyNameOnWEB().hashCode() : 0);
        result = 31 * result + (getProductDisplayNameOnUSSD() != null ? getProductDisplayNameOnUSSD().hashCode() : 0);
        result = 31 * result + (getAction() != null ? getAction().hashCode() : 0);
        result = 31 * result + getProductId();
        result = 31 * result + (getDmChannelType() != null ? getDmChannelType().hashCode() : 0);
        result = 31 * result + (getMainMenuUSSDCode() != null ? getMainMenuUSSDCode().hashCode() : 0);
        result = 31 * result + (getSubMenuUSSDCode() != null ? getSubMenuUSSDCode().hashCode() : 0);
        result = 31 * result + (getSubSubMenuUSSDCode() != null ? getSubSubMenuUSSDCode().hashCode() : 0);
        result = 31 * result + (getSubSubSubMenuUSSDCode() != null ? getSubSubSubMenuUSSDCode().hashCode() : 0);
        result = 31 * result + (getMenuType() != null ? getMenuType().hashCode() : 0);
        result = 31 * result + (getDefaultOptionH() != null ? getDefaultOptionH().hashCode() : 0);
        result = 31 * result + (getDefaultOptionArabic() != null ? getDefaultOptionArabic().hashCode() : 0);
        result = 31 * result + (getDefaultOptionOtherLanguage() != null ? getDefaultOptionOtherLanguage().hashCode() : 0);
        result = 31 * result + (isDirectExecutionNodem() ? 1 : 0);
        result = 31 * result + (isAutoExecute() ? 1 : 0);
        result = 31 * result + (int) (getRootNodeId() ^ (getRootNodeId() >>> 32));
        result = 31 * result + (isWhitelisted() ? 1 : 0);
        return result;
    }
}
