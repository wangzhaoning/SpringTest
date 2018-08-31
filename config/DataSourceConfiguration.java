package com.habuma.spittr.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
public class DataSourceConfiguration {
	@Profile("development")
	@Bean
	public DataSource embeddedDataSource() {
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.addScript("classpath:shcema.sql")
				.build();
	}
	@Profile("qa")
	@Bean
	public DataSource Data() {
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:tcp://localhost/~/spitter");
		ds.setUsername("sa");
		ds.setInitialSize(5);
		ds.setMaxIdle(10);
		return ds;
		}
	@Profile("production")
	@Bean
	public DataSource dataSource() {
		JndiObjectFactoryBean jndiObjectFactoryBean=new JndiObjectFactoryBean();
		jndiObjectFactoryBean.setJndiName("jdbc/SpittrDS");
		jndiObjectFactoryBean.setResourceRef(true);
		jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
		return (DataSource)jndiObjectFactoryBean.getObject();
	}
	
}
