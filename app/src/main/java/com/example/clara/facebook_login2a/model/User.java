package com.example.clara.facebook_login2a.model;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

import com.example.clara.facebook_login2a.R;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class User implements Serializable {


    private String id;
    private String nomcomplet;
    private String nom;
    private String prenom;
    private String sexe;
    private String mail;
    private String pays;
    private String timezone;
    private String datenaissance;


    public User(String id, String nomcomplet, String nom, String prenom, String sexe, String mail, String pays, String timezone, String datenaissance) {

        this.id = id;
        this.nomcomplet = nomcomplet;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.mail = mail;
        this.pays = pays;
        this.timezone = timezone;
        this.datenaissance = datenaissance;

    }

    public void getUser() {
        Log.e("id", id);
        Log.e("nc", nomcomplet);
        Log.e("nom", nom);
        Log.e("prenom", prenom);
        Log.e("sexe", sexe);
        Log.e("mail", mail);
        Log.e("pays", pays);
        Log.e("timezone", timezone);
        Log.e("date de naissance", datenaissance);


    }


    public static void saveUser(User user, Context c){
        FileOutputStream fos;
        try{
            fos = c.openFileOutput(c.getResources().getString(R.string.myfile),Context.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.flush();
            oos.close();
        }catch (Resources.NotFoundException | IOException e){
            e.printStackTrace();
    }
    }

    public static User getUser(Context c){
        FileInputStream fis;
        User u = null;
        try{
            fis=c.openFileInput(c.getResources().getString(R.string.myfile));
            ObjectInputStream ois = new ObjectInputStream(fis);
            u = (User) ois.readObject();
            fis.close();
    }catch (Exception e){
            Log.v("TAG_DEBUG", "getUser doesn't work");
        }
        return u;
}}












