package cn.heweiming.project.novelty.model;

import java.util.Date;

public class SysUserRole {
    private Integer id;

    private SysUser user;

    private SysRole role;

    private Boolean activity;

    private Date createTime;

    private Integer createrId;

    private Date modifyTime;

    private Integer modifierId;

    private String remark;

    public Integer getId() {
        return id;
    }

    public SysUserRole withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SysUser getUser() {
        return user;
    }

    public SysUserRole withUser(SysUser user) {
        this.setUser(user);
        return this;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }

    public SysRole getRole() {
        return role;
    }

    public SysUserRole withRole(SysRole role) {
        this.setRole(role);
        return this;
    }

    public void setRole(SysRole role) {
        this.role = role;
    }

    public Boolean getActivity() {
        return activity;
    }

    public SysUserRole withActivity(Boolean activity) {
        this.setActivity(activity);
        return this;
    }

    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public SysUserRole withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public SysUserRole withCreaterId(Integer createrId) {
        this.setCreaterId(createrId);
        return this;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public SysUserRole withModifyTime(Date modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getModifierId() {
        return modifierId;
    }

    public SysUserRole withModifierId(Integer modifierId) {
        this.setModifierId(modifierId);
        return this;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
    }

    public String getRemark() {
        return remark;
    }

    public SysUserRole withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}