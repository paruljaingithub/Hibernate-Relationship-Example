package com.example.demo;


import java.util.Properties;

import javax.sql.DataSource;

import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Component;


@Component
@Configuration
@EnableJpaRepositories
public class DataSourceConfiguration {

	
	//pgSimpleDataSource.setUrl("");
	@Bean
	public DataSource dataSource() {
		PGSimpleDataSource pgSimpleDataSource = new PGSimpleDataSource();
		pgSimpleDataSource.setUrl("jdbc:postgresql://localhost:5432/demodb");
		pgSimpleDataSource.setUser("postgres");
		pgSimpleDataSource.setPassword("postgres");
		return pgSimpleDataSource;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setDataSource(dataSource);
		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.show_sql","true");
		jpaProperties.put("hibernate.hbm2ddl.auto", "create");
		jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		entityManagerFactoryBean.setJpaProperties(jpaProperties);
		entityManagerFactoryBean.setPackagesToScan("com.example.demo");
		//entityManagerFactoryBean.setPersistenceUnitName("");
		return entityManagerFactoryBean;
	}
}
