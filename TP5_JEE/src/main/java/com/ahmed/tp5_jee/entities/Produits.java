package com.ahmed.tp5_jee.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Produits {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PRODUIT")
    private int idProduit;
    @Basic
    @Column(name = "NOM_PRODUIT")
    private String nomProduit;
    @Basic
    @Column(name = "PRIX")
    private double prix;

    public Produits(String nom, double prix) {
        this.nomProduit = nom;
        this.prix = prix;
    }

    public Produits() {

    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produits produits = (Produits) o;
        return idProduit == produits.idProduit && Double.compare(produits.prix, prix) == 0 && Objects.equals(nomProduit, produits.nomProduit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduit, nomProduit, prix);
    }
}
