package ru.testwebflow.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contracts {
    private int idContract;
    private int idUser;
    private int idProject;

    @Id
    @Column(name = "id_contract")
    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    @Basic
    @Column(name = "id_user")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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

        Contracts contracts = (Contracts) o;

        if (idContract != contracts.idContract) return false;
        if (idUser != contracts.idUser) return false;
        if (idProject != contracts.idProject) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idContract;
        result = 31 * result + idUser;
        result = 31 * result + idProject;
        return result;
    }
}
