package cn.heweiming.novelty.shiro.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.heweiming.novelty.shiro.mapper.SysSessionMapper;
import cn.heweiming.novelty.shiro.model.SysSession;
import cn.heweiming.novelty.shiro.service.SysSessionService;

@Service("sysSessionService")
public class SysSessionServiceImpl implements SysSessionService {

	@Resource
	private SysSessionMapper sysSessionMapper;

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(SysSession record) {
		return sysSessionMapper.insert(record);
	}

	@Override
	public SysSession selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysSession> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKey(SysSession record) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
