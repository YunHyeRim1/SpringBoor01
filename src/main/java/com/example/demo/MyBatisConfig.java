package com.example.demo;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(basePackages={"com.example.demo.cmm.mpr"})
public class MyBatisConfig {
    @Bean public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{
        final SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactory.setMapperLocations(resolver.getResources("classpath:com/example/demo/cmm/mpr/*.xml"));
        return sqlSessionFactory.getObject();
    }
    @Bean SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory)throws Exception{
        final SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
        return null;
    }
    
}