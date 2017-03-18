package cn.heweiming.project.novelty.model;

import java.util.Date;

public class SysRole {
    private Integer id;

    private String roleNo;

    private String name;

    private String description;

    private String state;

    private Boolean activity;

    private Date createTime;

    private Integer createrId;

    private Date modifyTime;

    private Integer modifierId;

    private String remark;

    public Integer getId() {
        return id;
    }

    public SysRole withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleNo() {
        return roleNo;
    }

    public SysRole withRoleNo(String roleNo) {
        this.setRoleNo(roleNo);
        return this;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getName() {
        return name;
    }

    public SysRole withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public SysRole withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public SysRole withState(String state) {
        this.setState(state);
        return this;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getActivity() {
        return activity;
    }

    public SysRole withActivity(Boolean activity) {
        this.setActivity(activity);
        return this;
    }

    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public SysRole withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public SysRole withCreaterId(Integer createrId) {
        this.setCreaterId(createrId);
        return this;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public SysRole withModifyTime(Date modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getModifierId() {
        return modifierId;
    }

    public SysRole withModifierId(Integer modifierId) {
        this.setModifierId(modifierId);
        return this;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
    }

    public String getRemark() {
        return remark;
    }

    public SysRole withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}