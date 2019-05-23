package com.infotel.dao;

import java.util.List;

import javax.ejb.Remote;

import com.infotel.metier.Magasin;
import com.infotel.metier.Produit;
import com.infotel.metier.ProduitNonPerissable;
import com.infotel.metier.ProduitPerissable;

@Remote
public interface IdaoRemote {
	public void ajouterMagasin(Magasin m);
	public List<Magasin> findAllMagasins();
	public void modifierMagasin(Magasin m);
	public void supprimerMagasin(long idMagasin);
	public Magasin getMagasin(long idMagasin);
	public Magasin affichageMagasin(long idMagasin);
	
	public void ajouterProduitNonPerissable(ProduitNonPerissable p);
	public List<ProduitNonPerissable> findAllProduitNonPerissable();
	public void modifierProduitNonPerissable(ProduitNonPerissable p);
	public void supprimerProduitNonPerissable(long idProduit);
	public ProduitNonPerissable getProduitNonPerissable(Long idProduit);
	public ProduitNonPerissable  affichageProduitNonPerissable(long idProduit);
	
	public void ajouterProduitPerissable(ProduitPerissable x);
	public List<ProduitPerissable> findAllProduitPerissable();
	public void modifierProduitPerissable(ProduitPerissable x);
	public void supprimerProduitPerissable(long idProduit);
	public ProduitPerissable getProduitPerissable(long idProduit);
	public ProduitPerissable  affichageProduitPerissable(long idProduit);
	
	
	public void ajouterProduit(Produit p, long idMagasin); 
	public void supprimerMagasin (Magasin m);
	public double calculPrixMagasin(Magasin m);
	


}
