package cn.heweiming.novelty.shiro.test;

import java.io.Serializable;
import java.util.Collection;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;

import cn.heweiming.novelty.shiro.model.SysSession;

public class ShiroSessionDaoTest extends AbstractSessionDAO {

	@Override
	public void update(Session session) throws UnknownSessionException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Session session) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Session> getActiveSessions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Serializable doCreate(Session session) {
		Serializable sessionId = generateSessionId(session);
		SysSession sysSession = new SysSession();
		sysSession.setId((String) sessionId);
		// SerializationUtils.serialize(session);
		// sysSession.setContext(SerializationUtils.serialize(obj));
		return null;
	}

	@Override
	protected Session doReadSession(Serializable sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
