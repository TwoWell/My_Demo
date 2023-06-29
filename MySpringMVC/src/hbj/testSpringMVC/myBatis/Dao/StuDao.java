package hbj.testSpringMVC.myBatis.Dao;

import hbj.testSpringMVC.myBatis.po.Stu;

import java.io.IOException;

public interface StuDao {
    public Stu findStuById(int sid) throws IOException;
}
