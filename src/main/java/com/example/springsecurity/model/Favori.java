package com.example.springsecurity.model;

import com.example.springsecurity.user.User;
import jakarta.persistence.*;

@Entity
public class Favori {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idfavori;

    @ManyToOne
    @JoinColumn(name = "idannonce")
    Annonce annonce;

    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    User utilisateur;

    public Favori() {
    }

    public Favori(int idfavori, Annonce annonce, User utilisateur) {
        this.idfavori = idfavori;
        this.annonce = annonce;
        this.utilisateur = utilisateur;
    }

    public int getIdfavori() {
        return idfavori;
    }

    public void setIdfavori(int idfavori) {
        this.idfavori = idfavori;
    }

    public Annonce getAnnonce() {
        return annonce;
    }

    public void setAnnonce(Annonce annonce) {
        this.annonce = annonce;
    }

    public User getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(User utilisateur) {
        this.utilisateur = utilisateur;
    }
}
