package hbj.testSpringMVC.myBatis.Dao;

import hbj.testSpringMVC.myBatis.po.Stu;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class StuDaoImp implements StuDao{
    @Override
    public Stu findStuById(int sid) throws IOException {
        String resource = "resources/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        Stu stu = sqlSession.selectOne("test.findStuById", 1);

        sqlSession.close();
        return stu;
    }
}
