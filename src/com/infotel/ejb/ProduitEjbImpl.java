package com.infotel.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.infotel.dao.IdaoRemote;
import com.infotel.metier.Magasin;
import com.infotel.metier.Produit;
import com.infotel.metier.ProduitNonPerissable;
import com.infotel.metier.ProduitPerissable;

@Stateless(name="ejbProduit")
public class ProduitEjbImpl implements IProduitLocal, IProduitRemote {

	
	@EJB
	private IdaoRemote dao;
	
	public IdaoRemote getDao() {
		return dao;
	}

	public void setDao(IdaoRemote dao) {
		this.dao = dao;
	}

	@Override
	public void ajouterMagasin(Magasin m) {
		// TODO Auto-generated method stub
        
		dao.ajouterMagasin(m);
	}

	@Override
	public List<Magasin> findAllMagasins() {
		// TODO Auto-generated method stub
		return dao.findAllMagasins();
	}

	@Override
	public void modifierMagasin(Magasin m) {
		// TODO Auto-generated method stub

		dao.modifierMagasin(m);
	}

	@Override
	public void supprimerMagasin(long idMagasin) {
		// TODO Auto-generated method stub

		dao.supprimerMagasin(idMagasin);
	}

	@Override
	public Magasin getMagasin(long idMagasin) {
		// TODO Auto-generated method stub
		return dao.getMagasin(idMagasin);
	}

	@Override
	public Magasin affichageMagasin(long idMagasin) {
		// TODO Auto-generated method stub
		return dao.affichageMagasin(idMagasin);
	}

	@Override
	public void ajouterProduitNonPerissable(ProduitNonPerissable p) {
		// TODO Auto-generated method stub

		dao.ajouterProduitNonPerissable(p);
	}

	@Override
	public List<ProduitNonPerissable> findAllProduitNonPerissable() {
		// TODO Auto-generated method stub
		return dao.findAllProduitNonPerissable();
	}

	@Override
	public void modifierProduitNonPerissable(ProduitNonPerissable p) {
		// TODO Auto-generated method stub
       dao.modifierProduitNonPerissable(p);
	}

	@Override
	public void supprimerProduitNonPerissable(long idProduit) {
		// TODO Auto-generated method stub
        dao.supprimerProduitNonPerissable(idProduit);
	}

	@Override
	public ProduitNonPerissable getProduitNonPerissable(Long idProduit) {
		// TODO Auto-generated method stub
		return dao.getProduitNonPerissable(idProduit);
	}

	@Override
	public ProduitNonPerissable affichageProduitNonPerissable(long idProduit) {
		// TODO Auto-generated method stub
		return dao.affichageProduitNonPerissable(idProduit);
	}

	@Override
	public void ajouterProduitPerissable(ProduitPerissable x) {
		// TODO Auto-generated method stub
    dao.ajouterProduitPerissable(x);
	}

	@Override
	public List<ProduitPerissable> findAllProduitPerissable() {
		// TODO Auto-generated method stub
		return dao.findAllProduitPerissable();
	}

	@Override
	public void modifierProduitPerissable(ProduitPerissable x) {
		// TODO Auto-generated method stub

		dao.modifierProduitPerissable(x);
	}

	@Override
	public void supprimerProduitPerissable(long idProduit) {
		// TODO Auto-generated method stub
       dao.supprimerProduitPerissable(idProduit);
	}

	@Override
	public ProduitPerissable getProduitPerissable(long idProduit) {
		// TODO Auto-generated method stub
		return dao.getProduitPerissable(idProduit);
	}

	@Override
	public ProduitPerissable affichageProduitPerissable(long idProduit) {
		// TODO Auto-generated method stub
		return dao.affichageProduitPerissable(idProduit);
	}

	@Override
	public void ajouterProduit(Produit p, long idMagasin) {
		// TODO Auto-generated method stub

		dao.ajouterProduit(p, idMagasin);
	}

	@Override
	public void supprimerMagasin(Magasin m) {
		// TODO Auto-generated method stub

		dao.supprimerMagasin(m);
	}

	@Override
	public double calculPrixMagasin(Magasin m) {
		// TODO Auto-generated method stub
		return dao.calculPrixMagasin(m);
	}

}
