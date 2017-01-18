package cn.heweiming.novelty.shiro.service;

import java.util.List;

import cn.heweiming.novelty.shiro.domain.vo.SysMenuVo;
import cn.heweiming.novelty.shiro.model.SysMenu;
import cn.heweiming.novelty.shiro.model.SysUser;

public interface SysMenuService {

    int deleteByPrimaryKey(Integer id);

    int insert(SysMenu record);

    SysMenu selectByPrimaryKey(Integer id);

    List<SysMenu> selectAll();

    int updateByPrimaryKey(SysMenu record);
    
	List<SysMenuVo> findMenuByUser(SysUser user);
}
