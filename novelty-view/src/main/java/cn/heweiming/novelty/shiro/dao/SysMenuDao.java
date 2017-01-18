package cn.heweiming.novelty.shiro.dao;

import java.util.List;

import cn.heweiming.novelty.shiro.domain.vo.SysMenuVo;
import cn.heweiming.novelty.shiro.model.SysUser;

public interface SysMenuDao {

	List<SysMenuVo> findMenuByUser(SysUser user);
	
}
