package cn.heweiming.novelty.shiro.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.session.Session;

public class SerializableUtils {

	public static String serialize(Session session) {
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos)) {
			oos.writeObject(session);
			return Base64.encodeToString(baos.toByteArray());
		} catch (IOException e) {
			throw new RuntimeException("serialize session error");
		}
	}

	public static Session deserialize(String sessionStr) {
		try (ByteArrayInputStream bais = new ByteArrayInputStream(Base64.decode(sessionStr));
				ObjectInputStream ois = new ObjectInputStream(bais)) {
			return (Session) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			throw new RuntimeException("deserialize session error");
		}
	}

}
