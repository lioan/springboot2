package cn.com.lioan.springboot2.dao.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

//@Configuration
public class DataSourceConfig {

    //为了解决Hikari数据库连接池 url属性不存在的第二种方案 但是个人觉得第一种方式直接改配置字段属性比较好
    @Primary
    @Bean(name = "dataSourcePropertiesOne")
    @Qualifier("dataSourcePropertiesOne")
    @ConfigurationProperties(prefix = "datasource1")
    public DataSourceProperties dataSourcePropertiesOne() {
        return new DataSourceProperties();
    }

    @Bean(name = "dataSourcePropertiesTwo")
    @Qualifier("dataSourcePropertiesTwo")
    @ConfigurationProperties(prefix = "datasource2")
    public DataSourceProperties dataSourcePropertiesTwo() {
        return new DataSourceProperties();
    }

    @Bean(name = "dbOneDataSource")
    @Primary
    @ConfigurationProperties(prefix = "datasource1")
    public DataSource dbOneDataSource(){
//        return DataSourceBuilder.create().build();
        //为了解决Hikari数据库连接池 url属性不存在的第二种方案
        return dataSourcePropertiesOne().initializeDataSourceBuilder().build();
    }

    @Bean(name = "dbTwoDataSource")
    @ConfigurationProperties(prefix = "datasource2")
    public DataSource dbTwoDataSource(){
        //        return DataSourceBuilder.create().build();
        //为了解决Hikari数据库连接池 url属性不存在的第二种方案
        return dataSourcePropertiesTwo().initializeDataSourceBuilder().build();
    }
}
