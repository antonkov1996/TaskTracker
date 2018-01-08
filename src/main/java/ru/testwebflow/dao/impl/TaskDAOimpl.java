package ru.testwebflow.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.testwebflow.dao.interfaces.TaskDAO;
import ru.testwebflow.entities.Tasks;
import ru.testwebflow.entities.Users;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@Component
public class TaskDAOimpl implements TaskDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public Tasks getTask(int id_task) {
        String s="from Tasks where idTask="+id_task;
        Tasks task = (Tasks) sessionFactory.getCurrentSession().createQuery(s).uniqueResult();

        return task;
//    return null;
    }

    @Transactional
    @Override
    public List<Tasks> showTasks(int id_project) {

        List<Tasks> tasksList;
        tasksList = (List<Tasks>) sessionFactory.getCurrentSession().createQuery("from Tasks").list();

        return tasksList;

    }

    @Transactional
    @Override
    public String showTaskStatus(int id_task) {
        Tasks task = (Tasks) sessionFactory.getCurrentSession().createQuery("from Tasks where idTask=1").uniqueResult();
        return task.getTaskStatus();
    }

    @Override
    public void changtTaskStatus(int id_task) {

    }

    @Override
    public void addTask(Tasks task) {

    }
}
