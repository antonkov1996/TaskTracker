package ru.testwebflow.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Tasks {
    private int idTask;
    private String taskStatus;
    private int idDeveloper;
    private int idProject;
    private int idTask1;

    @Id
    @Column(name = "id_task")
    public int getIdTask() {
        idTask1 = idTask;
        return idTask1;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    @Basic
    @Column(name = "task_status")
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Basic
    @Column(name = "id_developer")
    public int getIdDeveloper() {
        return idDeveloper;
    }

    public void setIdDeveloper(int idDeveloper) {
        this.idDeveloper = idDeveloper;
    }

    @Basic
    @Column(name = "id_project")
    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tasks tasks = (Tasks) o;

        if (idTask != tasks.idTask) return false;
        if (idDeveloper != tasks.idDeveloper) return false;
        if (idProject != tasks.idProject) return false;
        if (taskStatus != null ? !taskStatus.equals(tasks.taskStatus) : tasks.taskStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTask;
        result = 31 * result + (taskStatus != null ? taskStatus.hashCode() : 0);
        result = 31 * result + idDeveloper;
        result = 31 * result + idProject;
        return result;
    }
}
