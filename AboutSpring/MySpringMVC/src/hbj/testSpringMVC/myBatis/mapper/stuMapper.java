package hbj.testSpringMVC.myBatis.mapper;

import hbj.testSpringMVC.myBatis.po.Stu;

public interface stuMapper {
    public Stu findStuById(int sid) throws Exception;
}
