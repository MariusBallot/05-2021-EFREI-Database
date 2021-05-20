package com.example.demo.vehicule;

import javax.persistence.*;

@Entity
@Table
public class Vehicule {

    @Id
    @SequenceGenerator(
            name= "vehicule_sequence",
            sequenceName = "vehicule_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "vehicule_sequence"
    )
    private Long matricule;
    private String marque;
    private String modele;
    private String typeCarbu;
    private String categorie;
    private Boolean boiteAuto;
    private Boolean clim;
    private int kilometrage;

    public Vehicule(Long matricule, String marque, String modele, String typeCarbu, String categorie, Boolean boiteAuto, Boolean clim, int kilometrage) {
        this.matricule = matricule;
        this.marque = marque;
        this.modele = modele;
        this.typeCarbu = typeCarbu;
        this.categorie = categorie;
        this.boiteAuto = boiteAuto;
        this.clim = clim;
        this.kilometrage = kilometrage;
    }

    public Vehicule(String marque, String modele, String typeCarbu, String categorie, Boolean boiteAuto, Boolean clim, int kilometrage) {
        this.marque = marque;
        this.modele = modele;
        this.typeCarbu = typeCarbu;
        this.categorie = categorie;
        this.boiteAuto = boiteAuto;
        this.clim = clim;
        this.kilometrage = kilometrage;
    }

    public Vehicule() {
    }

    public Long getMatricule() {
        return matricule;
    }

    public void setMatricule(Long matricule) {
        this.matricule = matricule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getTypeCarbu() {
        return typeCarbu;
    }

    public void setTypeCarbu(String typeCarbu) {
        this.typeCarbu = typeCarbu;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Boolean getBoiteAuto() {
        return boiteAuto;
    }

    public void setBoiteAuto(Boolean boiteAuto) {
        this.boiteAuto = boiteAuto;
    }

    public Boolean getClim() {
        return clim;
    }

    public void setClim(Boolean clim) {
        this.clim = clim;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "matricule='" + matricule + '\'' +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", typeCarbu='" + typeCarbu + '\'' +
                ", categorie='" + categorie + '\'' +
                ", boiteAuto=" + boiteAuto +
                ", clim=" + clim +
                ", kilometrage=" + kilometrage +
                '}';
    }
}
