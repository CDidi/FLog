package com.example.clara.facebook_login2a.model;

import java.io.Serializable;

/**
 * Created by Clara on 11/05/2015.
 */
public class User implements Serializable{


    private final String id;
    private final String nomcomplet;
    private final String nom;
    private final String prenom;
    private final String sexe;
    private final String mail;
    private final String pays;
    private final String timezone;

    public User(String id, String nomcomplet,String nom, String prenom, String sexe,String mail, String pays, String timezone) {

        this.id = id;
        this.nomcomplet = nomcomplet;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.mail = mail;
        this.pays = pays;
        this.timezone = timezone;
    }



}


