package com.sjpddd.EpidemicFlow.entity;

import javax.persistence.*;

@Table(name="user1")
@Entity
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String account;
    private String password;
    private String name;
    private Integer idnumber;
    private String user;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdnumber() {
        return idnumber;
    }
    public void setIdnumber(Integer idnumber) {
        this.idnumber = idnumber;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
}
