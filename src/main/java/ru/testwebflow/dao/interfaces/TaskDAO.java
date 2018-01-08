package ru.testwebflow.dao.interfaces;

import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;
import ru.testwebflow.entities.Tasks;

import java.util.List;


public interface TaskDAO {
    Tasks getTask(int id_task);
    List<Tasks> showTasks(int id_project);
    String showTaskStatus(int id_task);
    void changtTaskStatus(int id_task);
    void addTask(Tasks task);
}
