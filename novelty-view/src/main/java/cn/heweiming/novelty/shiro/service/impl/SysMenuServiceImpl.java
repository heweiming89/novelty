package cn.heweiming.novelty.shiro.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.heweiming.novelty.shiro.dao.SysMenuDao;
import cn.heweiming.novelty.shiro.domain.vo.SysMenuVo;
import cn.heweiming.novelty.shiro.mapper.SysMenuMapper;
import cn.heweiming.novelty.shiro.model.SysMenu;
import cn.heweiming.novelty.shiro.model.SysUser;
import cn.heweiming.novelty.shiro.service.SysMenuService;

@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {

	@Autowired
	private SysMenuMapper sysMenuMapper;
	
	@Autowired
	private SysMenuDao sysMenuDao;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(SysMenu record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysMenu selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysMenu> selectAll() {
//		return sysMenuMapper.selectAll();
		return Collections.EMPTY_LIST;
	}

	@Override
	public int updateByPrimaryKey(SysMenu record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SysMenuVo> findMenuByUser(SysUser user) {
//		return sysMenuDao.findMenuByUser(user);
		return Collections.EMPTY_LIST;
	}
	

}
