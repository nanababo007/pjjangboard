package com.example.demo.mybatis.configurations;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages={"com.example.demo.mybatis.mapper"},sqlSessionFactoryRef="sqlSessionFactory",sqlSessionTemplateRef="sqlSessionTemplate")
public class DatabaseConfiguration {

	@Value("${mybatis.mapper-locations}")
	String mapperLocations;
	@Value("${mybatis.type-aliases-packages}")
	String typeAliasesPackages;

    /*Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    HikariConfig hikariConfig() {
		return new HikariConfig();
	}

	@Bean
	DataSource dataSource() {
		DataSource dataSource = new HikariDataSource(hikariConfig());
		return dataSource;
	}*/

	@Bean(name = "sqlSessionFactory")
	SqlSessionFactory SqlSessionFactory(@Qualifier("dataSource") DataSource DataSource, ApplicationContext applicationContext) throws Exception {
		Properties configurationProperties = new Properties();
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasesPackages);
		sqlSessionFactoryBean.setDataSource(DataSource);
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources(mapperLocations));
		configurationProperties.put("mapUnderscoreToCamelCase",true);
		configurationProperties.put("callSettersOnNulls",true);
		configurationProperties.put("jdbcTypeForNull","NULL");
		sqlSessionFactoryBean.setConfigurationProperties(configurationProperties);
		return sqlSessionFactoryBean.getObject();
	}

	@Bean(name = "sqlSessionTemplate")
	SqlSessionTemplate SqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory firstSqlSessionFactory) {
		return new SqlSessionTemplate(firstSqlSessionFactory);
	}

}
