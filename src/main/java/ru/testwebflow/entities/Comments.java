package ru.testwebflow.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comments {
    private int idComment;
    private int idAuthor;
    private String text;
    private Integer idProject;
    private Integer idTask;

    @Id
    @Column(name = "id_comment")
    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    @Basic
    @Column(name = "id_author")
    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Basic
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "id_project")
    public Integer getIdProject() {
        return idProject;
    }

    public void setIdProject(Integer idProject) {
        this.idProject = idProject;
    }

    @Basic
    @Column(name = "id_task")
    public Integer getIdTask() {
        return idTask;
    }

    public void setIdTask(Integer idTask) {
        this.idTask = idTask;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comments comments = (Comments) o;

        if (idComment != comments.idComment) return false;
        if (idAuthor != comments.idAuthor) return false;
        if (text != null ? !text.equals(comments.text) : comments.text != null) return false;
        if (idProject != null ? !idProject.equals(comments.idProject) : comments.idProject != null) return false;
        if (idTask != null ? !idTask.equals(comments.idTask) : comments.idTask != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idComment;
        result = 31 * result + idAuthor;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (idProject != null ? idProject.hashCode() : 0);
        result = 31 * result + (idTask != null ? idTask.hashCode() : 0);
        return result;
    }
}
