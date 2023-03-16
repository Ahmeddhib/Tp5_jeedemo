package com.ahmed.tp5_jee.dao;

import com.ahmed.tp5_jee.entities.Produits;

import java.util.List;

public interface ProduitDao {
    public Produits save(Produits produits);
    public List<Produits> produitsParMC(String mc);
    public Produits getProduit(int idProduit);
    public Produits updateProduit(Produits produits);
    public void deleteProduit(int idProduit);
}

