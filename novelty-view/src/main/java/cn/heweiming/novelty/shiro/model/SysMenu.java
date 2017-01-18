package cn.heweiming.novelty.shiro.model;

import java.util.Date;

public class SysMenu {
	
	private Integer id;

	private Integer permissionsId;

	private Integer parentId;

	private String name;

	private String code;

	private String icon;

	private Short sorting;

	private String className;

	private String subClassName;

	private String description;

	private String remark;

	private String type;

	private String state;

	private Boolean activity;

	private Date createTime;

	private Integer createrId;

	private Date modifyTime;

	private Integer modifierId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPermissionsId() {
		return permissionsId;
	}

	public void setPermissionsId(Integer permissionsId) {
		this.permissionsId = permissionsId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Short getSorting() {
		return sorting;
	}

	public void setSorting(Short sorting) {
		this.sorting = sorting;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSubClassName() {
		return subClassName;
	}

	public void setSubClassName(String subClassName) {
		this.subClassName = subClassName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Boolean getActivity() {
		return activity;
	}

	public void setActivity(Boolean activity) {
		this.activity = activity;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getCreaterId() {
		return createrId;
	}

	public void setCreaterId(Integer createrId) {
		this.createrId = createrId;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Integer getModifierId() {
		return modifierId;
	}

	public void setModifierId(Integer modifierId) {
		this.modifierId = modifierId;
	}
}