package hbj.testSpringMVC.controller;

import hbj.testSpringMVC.myBatis.Dao.StuDao;
import hbj.testSpringMVC.myBatis.Dao.StuDaoImp;
import hbj.testSpringMVC.myBatis.mapper.stuMapper;
import hbj.testSpringMVC.myBatis.po.Stu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class controller {
    @RequestMapping("/index")
    public String HelloWorld(Model model) throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("hbj/testSpringMVC/test/applicationContext.xml");
        stuMapper stumapper = (stuMapper) ac.getBean("stuMapper");
        Stu stu = stumapper.findStuById(1);
        model.addAttribute("hbj",stu.getSname());
//        StuDao studao = new StuDaoImp();
//        Stu stu = studao.findStuById(1);
//        model.addAttribute("hbj",stu.getSname());
        return "index";
    }
}
