1、mybatis快速入门，getUser()
通过配置conf.xml构建SqlSessionFactory，创建SqlSession，session执行映射文件中的sql。

2、CRUD  
xml方式 	注解方式（interface）

3、优化Mybatis配置文件中的配置
数据库配置优化  数据库信息单放在db.properties
为实体类定义别名，简化sql映射xml文件中的引用。typealiases （单独指定，默认包下）入参 parameterType，出参resultType 

4、字段名与实体类属性名不相同冲突（别名，mapper定义）
1. 通过在查询的sql语句中定义字段名的别名，让字段名的别名和实体类的属性名一致，这样就可以表的字段名和实体类的属性名一一对应上了，这种方式是通过在sql语句中定义别名来解决字段名和属性名的映射关系的。
2. 通过<resultMap>来映射字段名和实体类属性名的一一对应关系。这种方式是使用MyBatis提供的解决方式来解决字段名和属性名的映射关系的

5、表关联查询
MyBatis中使用association标签来解决一对一的关联查询，association标签可用的属性如下：

property:对象属性的名称
javaType:对象属性的类型
column:所对应的外键字段名称
select:使用另一个查询封装的结果
MyBatis中使用collection标签来解决一对多的关联查询，ofType属性指定集合中元素的对象类型。

6、存储过程

7、缓存

8、mybatis与spring整合