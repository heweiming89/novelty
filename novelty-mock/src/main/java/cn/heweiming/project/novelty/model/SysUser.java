package cn.heweiming.project.novelty.model;

import java.util.Date;

public class SysUser {
    private Integer id;

    private String userNo;

    private String realName;

    private String username;

    private String password;

    private String mobile;

    private String email;

    private String sysType;

    private String sysState;

    private Boolean activity;

    private Date createTime;

    private Integer createrId;

    private Date modifyTime;

    private Integer modifierId;

    private String remark;

    public Integer getId() {
        return id;
    }

    public SysUser withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserNo() {
        return userNo;
    }

    public SysUser withUserNo(String userNo) {
        this.setUserNo(userNo);
        return this;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getRealName() {
        return realName;
    }

    public SysUser withRealName(String realName) {
        this.setRealName(realName);
        return this;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public SysUser withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public SysUser withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public SysUser withMobile(String mobile) {
        this.setMobile(mobile);
        return this;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public SysUser withEmail(String email) {
        this.setEmail(email);
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSysType() {
        return sysType;
    }

    public SysUser withSysType(String sysType) {
        this.setSysType(sysType);
        return this;
    }

    public void setSysType(String sysType) {
        this.sysType = sysType;
    }

    public String getSysState() {
        return sysState;
    }

    public SysUser withSysState(String sysState) {
        this.setSysState(sysState);
        return this;
    }

    public void setSysState(String sysState) {
        this.sysState = sysState;
    }

    public Boolean getActivity() {
        return activity;
    }

    public SysUser withActivity(Boolean activity) {
        this.setActivity(activity);
        return this;
    }

    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public SysUser withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public SysUser withCreaterId(Integer createrId) {
        this.setCreaterId(createrId);
        return this;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public SysUser withModifyTime(Date modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getModifierId() {
        return modifierId;
    }

    public SysUser withModifierId(Integer modifierId) {
        this.setModifierId(modifierId);
        return this;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
    }

    public String getRemark() {
        return remark;
    }

    public SysUser withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}