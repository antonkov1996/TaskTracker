package ru.testwebflow.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.testwebflow.entities.Tasks;
import ru.testwebflow.entities.TestClass;
import ru.testwebflow.entities.Users;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class TestBean {
    @Autowired
    private SessionFactory sessionFactory;

    private String msg ="Hellow World";
    private TestClass testClass= new TestClass("ani",18);

    public String getMsg() {
        return msg;
    }


    public void setMsg(String msg) {
        this.msg = msg;
    }

    public TestClass getTestClass() {
        return testClass;
    }

    public void setTestClass(TestClass testClass) {
        this.testClass = testClass;
    }
}
