package cn.heweiming.novelty.shiro.model;

import java.util.Date;

public class SysLoginLog {
    private Integer id;

    private Integer userId;

    private Date loginTime;

    private String loginIp;

    private String loginState;

    private String loginBrowser;

    private String screenResolution;

    private String operatingSystem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginState() {
        return loginState;
    }

    public void setLoginState(String loginState) {
        this.loginState = loginState;
    }

    public String getLoginBrowser() {
        return loginBrowser;
    }

    public void setLoginBrowser(String loginBrowser) {
        this.loginBrowser = loginBrowser;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}