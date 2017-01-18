package cn.heweiming.novelty.shiro.domain.vo;

import java.util.List;

import cn.heweiming.novelty.shiro.model.SysMenu;

public class SysMenuVo extends SysMenu {

	private String url;

	private List<SysMenuVo> subMenuList;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<SysMenuVo> getSubMenuList() {
		return subMenuList;
	}

	public void setSubMenuList(List<SysMenuVo> subMenuList) {
		this.subMenuList = subMenuList;
	}

}
