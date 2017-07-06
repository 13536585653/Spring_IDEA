package org.ch13;

import org.apache.commons.dbcp.BasicDataSource;
import org.ch13.service2.UserService;
import org.ch13.service2.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by langye on 2017/2/28.
 */
/*这个注解标识当前类是一个配置类，取代spring的xml文件*/
@Configuration
/*这个注解用于扫描spring标识容器组件的，等同于在配置文件配置<context:component-scan/>*/
@ComponentScan("org.ch13")
/*开启事务管理*/
@EnableTransactionManagement
public class AppConfig {
	/*@Bean注解等同于在配置文件中配置<bean id=""></bean>
	* 注解的参数相当于指定Bean的id
	* 如果不指定参数，默认将标注的方法名作为id的名称
	* 返回值是一个实现类对象*/
	@Bean("userService")
	@Scope("prototype")
	public UserService userService(){
		return new UserServiceImpl();
	}



	//一、
	/*配置数据源，使用dbcp连接池*/
	@Bean
public DataSource dataSource(){
		/*创建commons包的*/
		BasicDataSource dataSource = new BasicDataSource();
		/*给连接池配置属性*/
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("123");
		dataSource.setMaxActive(60);
		dataSource.setMaxIdle(50);
		dataSource.setMinIdle(10);
		dataSource.setInitialSize(5);
		dataSource.setMaxWait(2000);
		return dataSource;
	}

	//二、
	/*配置jpa的适配器*/
	@Bean
public JpaVendorAdapter jpaVendorAdapter(){
		HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
		/*使用的数据库类型*/
		jpaVendorAdapter.setDatabase(Database.MYSQL);
		/*数据库方言*/
		jpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
		/*显示sql语句*/
		jpaVendorAdapter.setShowSql(true);
		/*是否执行ddl语句*/
		jpaVendorAdapter.setGenerateDdl(false);
		return jpaVendorAdapter;
}

	//三、
	/*实体管理器工厂
	* 方法可以定义参数，相当于注入，spring会自动将需要的参数对象传入这个方法中
	* 也可以在方法体中调用上面的方法实现注入*/
	@Bean
public LocalContainerEntityManagerFactoryBean factoryBean(DataSource dataSource,JpaVendorAdapter jpaVendorAdapter){
		/*创建容管理的实体管理器工厂*/
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		/*注入数据源和适配器，以及扫描的实体类*/
		factoryBean.setDataSource(dataSource);
		factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
		factoryBean.setPackagesToScan("org.ch13.entity");
		return factoryBean;
	}


	//四、
	/*jpa的事务管理器*/
	@Bean
public PlatformTransactionManager txManager(EntityManagerFactory entityManagerFactory){
	JpaTransactionManager txManager = new JpaTransactionManager();
	/*注入一个entityManagerFactory*/
	txManager.setEntityManagerFactory(entityManagerFactory);
	return txManager;
}
}
