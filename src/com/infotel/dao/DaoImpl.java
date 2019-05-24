package com.infotel.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.infotel.metier.Magasin;
import com.infotel.metier.Produit;
import com.infotel.metier.ProduitNonPerissable;
import com.infotel.metier.ProduitPerissable;
@Stateless
@LocalBean
public class DaoImpl implements IdaoLocal, IdaoRemote {
	@PersistenceContext(unitName="pu-ejb-ws")
	EntityManager em;
	@Override
	public void ajouterMagasin(Magasin m) {
		em.persist(m);

	}

	@Override
	public List<Magasin> findAllMagasins() {
		return em.createQuery("select m from Magasin m").getResultList();
	}

	@Override
	public void modifierMagasin(Magasin m) {
            em.merge(m);
	  
	}

	@Override
	public void supprimerMagasin(long idMagasin) {
		Query q = null;
		q = em.createQuery("DELETE FROM Magasin m WHERE m.idMagasin = :x").setParameter("x", idMagasin);
		idMagasin = (long) q.executeUpdate();

	}

	@Override
	public Magasin getMagasin(long idMagasin) {
	
		return em.find(Magasin.class, idMagasin);
	}

	@Override
	public Magasin affichageMagasin(long idMagasin) {
	
	return em.find(Magasin.class, idMagasin);
	}

	@Override
	public void ajouterProduitNonPerissable(ProduitNonPerissable p) {
		em.persist(p);

	}

	@Override
	public List<ProduitNonPerissable> findAllProduitNonPerissable() {
		return em.createQuery("select p from Produit p ").getResultList();
	}

	@Override
	public void modifierProduitNonPerissable(ProduitNonPerissable p) {
		em.merge(p);

	}

	@Override
	public void supprimerProduitNonPerissable(long idProduit) {
		Query q = null;
		q = em.createQuery("DELETE FROM ProduitNonPerissable p  WHERE p.idProduit = :y").setParameter("y", idProduit);
		idProduit = (long) q.executeUpdate();

	}

	@Override
	public ProduitNonPerissable getProduitNonPerissable(Long idProduit) {
	
		return em.find(ProduitNonPerissable.class, idProduit);
	}

	@Override
	public ProduitNonPerissable affichageProduitNonPerissable(long idProduit) {
		
		return em.find(ProduitNonPerissable.class, idProduit);
	}

	@Override
	public void ajouterProduitPerissable(ProduitPerissable x) {
		em.persist(x);
		
	}

	@Override
	public List<ProduitPerissable> findAllProduitPerissable() {
		return em.createQuery("select x from Produit x").getResultList();
	}

	@Override
	public void modifierProduitPerissable(ProduitPerissable x) {
		em.merge(x);
		
	}

	@Override
	public void supprimerProduitPerissable(long idProduit) {
		Query q =null;
		q=em.createQuery("DELETE FROM ProduitPerissable x WHERE x.idProduit= :z").setParameter("z", idProduit);
		idProduit = (long) q.executeUpdate();
		
	}
	@Override
	public ProduitPerissable getProduitPerissable(long idProduit) {
		
		return em.find( ProduitPerissable.class,idProduit);
	}

	@Override
	public ProduitPerissable affichageProduitPerissable(long idProduit) {
		
		return em.find(ProduitPerissable.class,idProduit);
	}



	@Override
	public void ajouterProduit(Produit p, long idMagasin) {
		Magasin m= em.find(Magasin.class, idMagasin);
		p.setMagasin(m);
		em.persist(p);
	}

	@Override
	public void supprimerMagasin(Magasin m) {
		em.remove(m);
	}

	@Override
	public double calculPrixMagasin(Magasin m) {
		// TODO Auto-generated method stub
		
		 double PrixDuLocal = 0.0;        
		 double coutTotal = 0;       
		 int quantite =0;       
		 Produit[] produits = (Produit[]) m.getProduits().toArray();                        
		 for(int i= 0; i< produits.length; i++)        
		 {           
			 PrixDuLocal = produits[i].getPrix();           
			 quantite = produits[i].getStock();                        
			 coutTotal += PrixDuLocal * quantite;       
			 }                
		 return coutTotal;    
		 }
		
	}




