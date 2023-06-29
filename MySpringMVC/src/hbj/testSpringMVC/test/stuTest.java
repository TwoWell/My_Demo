package hbj.testSpringMVC.test;

import hbj.testSpringMVC.myBatis.mapper.stuMapper;
import hbj.testSpringMVC.myBatis.po.Stu;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class stuTest {
    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "resources/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }

    // 根据id查询用户信息，得到一条记录结果
    @Test
    public void findStuByIdTest() throws Exception {
//        SqlSession sqlSession = this.getSqlSessionFactory().openSession();

//        //这里的参数test.findUserById，test为命名空间，要与user.xml中的对应起来，
//        //同理，findUserById也要在user.xml中存在，不然都会报错
//        Stu stu = sqlSession.selectOne("test.findStuById", 1);
//        stuMapper stuMapper = sqlSession.getMapper(stuMapper.class);
//        Stu stu = stuMapper.findStuById(1);
        ApplicationContext ac = new ClassPathXmlApplicationContext("hbj/testSpringMVC/test/applicationContext.xml");
        stuMapper stumapper = (stuMapper) ac.getBean("stuMapper");
        Stu stu = stumapper.findStuById(1);
        System.out.println(stu);
        // 释放资源
//        sqlSession.close();
    }
}
