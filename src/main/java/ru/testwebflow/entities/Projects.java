package ru.testwebflow.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Projects {
    private int idProject;
    private int idAuthor;
    private String name;

    @Id
    @Column(name = "id_project")
    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Projects projects = (Projects) o;

        if (idProject != projects.idProject) return false;
        if (idAuthor != projects.idAuthor) return false;
        if (name != null ? !name.equals(projects.name) : projects.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProject;
        result = 31 * result + idAuthor;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
