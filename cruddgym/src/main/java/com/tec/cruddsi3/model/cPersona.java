package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class cPersona {
    
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "correo", length = 50)
    private String correo;

    @Column(name = "useer", length = 100)
    private String useer;

    @Column(name = "password", length = 8)
    private String password;

    @Column(name = "roll", length = 25)
    private String roll;

    public cPersona() {
    }

    public cPersona(int id, String correo, String useer, String password, String roll) {
        this.id = id;
        this.correo = correo;
        this.useer = useer;
        this.password = password;
        this.roll = roll;
    }

    public cPersona(String correo, String useer, String password, String roll) {
        this.correo = correo;
        this.useer = useer;
        this.password = password;
        this.roll = roll;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUseer() {
        return useer;
    }

    public void setUseer(String useer) {
        this.useer = useer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    

   
    
}
