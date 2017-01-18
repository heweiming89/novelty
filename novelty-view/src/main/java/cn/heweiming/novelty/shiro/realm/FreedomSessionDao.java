package cn.heweiming.novelty.shiro.realm;

import java.io.Serializable;

import javax.annotation.Resource;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;

import cn.heweiming.novelty.shiro.service.SysSessionService;

public class FreedomSessionDao extends EnterpriseCacheSessionDAO {

	@Resource
	private SysSessionService sysSessionService;
	
	
	@Override
	protected Serializable doCreate(Session session) {
		// TODO Auto-generated method stub
		return super.doCreate(session);
	}

	@Override
	protected Session doReadSession(Serializable sessionId) {
		// TODO Auto-generated method stub
		return super.doReadSession(sessionId);
	}

	@Override
	protected void doUpdate(Session session) {
		// TODO Auto-generated method stub
		super.doUpdate(session);
	}

	@Override
	protected void doDelete(Session session) {
		// TODO Auto-generated method stub
		super.doDelete(session);
	}

}
