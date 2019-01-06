package cn.com.lioan.springboot2.dao.config;

/**
 * 如果有多个数据源就直接创建多个SqlSessionFactory和SqlSessionTemplate创建
 */
public class MybatisConfig {

    /**
     * 第一个数据库 SqlSessionFactory和SqlSessionTemplate 创建
     */
    /*@Configuration
    @MapperScan(basePackages = {"cn.com.lioan.springboot2.dao.mapper.one"},
            sqlSessionFactoryRef = "sqlSessionFactoryOne",
            sqlSessionTemplateRef = "sqlSessionTemplateOne")
    public static class DBOne{

        @Resource
        DataSource dbOneDataSource;

        @Bean
        public SqlSessionFactory sqlSessionFactoryOne() throws Exception {
            SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
            factoryBean.setDataSource(dbOneDataSource);
            factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                    .getResources("classpath:/mybatis/mapping/one/*Mapping.xml"));
            return factoryBean.getObject();
        }

        @Bean
        public SqlSessionTemplate sqlSessionTemplateOne() throws Exception {
            SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryOne());
            return template;
        }
    }*/

    /**
     * 第二个数据库 SqlSessionFactory和SqlSessionTemplate 创建
     */
    /*@Configuration
    @MapperScan(basePackages = {"cn.com.lioan.springboot2.dao.mapper.two"},
            sqlSessionFactoryRef = "sqlSessionFactoryTwo",
            sqlSessionTemplateRef ="sqlSessionTemplateTwo" )
    public static class DBTwo{

        @Resource
        DataSource dbTwoDataSource;

        @Bean
        public SqlSessionFactory sqlSessionFactoryTwo() throws Exception {
            SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
            factoryBean.setDataSource(dbTwoDataSource);
            factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                    .getResources("classpath:/mybatis/mapping/two/*Mapping.xml"));
            return factoryBean.getObject();
        }

        @Bean
        public SqlSessionTemplate sqlSessionTemplateTwo() throws Exception {
            SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryTwo()); // 使用上面配置的Factory
            return template;
        }
    }*/
}
