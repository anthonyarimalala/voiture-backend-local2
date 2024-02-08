package com.example.springsecurity.model;

import com.example.springsecurity.user.User;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idannonce;

    @ManyToOne
    @JoinColumn(name = "idmarque")
    Marque marque;

    String modele;

    String matricule;

    Date annee_fabrication;

    String detail;
    @Column(columnDefinition = "int default 0")
    int etat;

    int idutilisateur;
    @Column(columnDefinition = "int default 0")
    int validation;

    double prix;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "annonce_categorie",
            joinColumns = @JoinColumn(name = "idannonce"),
            inverseJoinColumns = @JoinColumn(name = "idcategorie")
    )
    private List<Categorie> categories;

    @ElementCollection
    @CollectionTable(
            name = "imagelinks",
            joinColumns = @JoinColumn(name = "idannonce")
    )
    @Column(name = "imagelink")
    private List<String> imagelinks;


    public Annonce() {
    }

    public Annonce(int idannonce, int idcategorie, Marque marque, String modele, String matricule, Date annee_fabrication, String detail, int etat, int idutilisateur, int validation, double prix) {
        this.idannonce = idannonce;
        this.marque = marque;
        this.modele = modele;
        this.matricule = matricule;
        this.annee_fabrication = annee_fabrication;
        this.detail = detail;
        this.etat = etat;
        this.idutilisateur = idutilisateur;
        this.validation = validation;
        this.prix = prix;
    }

    public int getIdannonce() {
        return idannonce;
    }

    public void setIdannonce(int idannonce) {
        this.idannonce = idannonce;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public List<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }

    public List<String> getImagelinks() {
        return imagelinks;
    }

    public void setImagelinks(List<String> imagelinks) {
        this.imagelinks = imagelinks;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Date getAnnee_fabrication() {
        return annee_fabrication;
    }

    public void setAnnee_fabrication(Date annee_fabrication) {
        this.annee_fabrication = annee_fabrication;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public int getValidation() {
        return validation;
    }

    public void setValidation(int validation) {
        this.validation = validation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
