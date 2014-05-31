package org.apache.openjpa.persistence;

import java.util.Map;

import javax.persistence.spi.PersistenceUnitInfo;

import org.apache.openjpa.conf.OpenJPAConfiguration;

/**
 * @Title: DecryptPersistenceProviderImpl.java
 * @Package org.apache.openjpa.persistence
 * @Description: TODO
 * @author 0000
 * @date 2014年4月14日 上午2:05:19
 * @version V1.0
 */
public class DecryptPersistenceProviderImpl extends PersistenceProviderImpl{

	@Override
	public OpenJPAEntityManagerFactory createEntityManagerFactory(String name, Map m) {
		// TODO Auto-generated method stub
		System.out.println(m);
		return super.createEntityManagerFactory(name, m);
	}

	@Override
	public OpenJPAEntityManagerFactory createEntityManagerFactory(String name, String resource, Map m) {
		// TODO Auto-generated method stub
		System.out.println("111"+m);
		return super.createEntityManagerFactory(name, resource, m);
	}

	@Override
	public void setPersistenceEnvironmentInfo(OpenJPAConfiguration conf, PersistenceUnitInfo pui) {
		// TODO Auto-generated method stub
		System.out.println("11122"+conf+"22"+pui);
		super.setPersistenceEnvironmentInfo(conf, pui);
	}

	@Override
	protected OpenJPAConfiguration newConfigurationImpl() {
		// TODO Auto-generated method stub
		System.out.println("3333");
		return super.newConfigurationImpl();
	}
	
}
