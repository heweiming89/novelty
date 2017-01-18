package cn.heweiming.novelty.shiro.model;

import java.util.Date;

public class SysOperationLog {
    private Integer id;

    private String operationType;

    private String operationModule;

    private String operationContent;

    private Integer userId;

    private Date operationTime;

    private String operationIp;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationModule() {
        return operationModule;
    }

    public void setOperationModule(String operationModule) {
        this.operationModule = operationModule;
    }

    public String getOperationContent() {
        return operationContent;
    }

    public void setOperationContent(String operationContent) {
        this.operationContent = operationContent;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public String getOperationIp() {
        return operationIp;
    }

    public void setOperationIp(String operationIp) {
        this.operationIp = operationIp;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}