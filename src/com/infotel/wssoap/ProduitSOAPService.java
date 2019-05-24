package com.infotel.wssoap;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.infotel.dao.DaoImpl;
import com.infotel.metier.Magasin;
import com.infotel.metier.ProduitNonPerissable;
import com.infotel.metier.ProduitPerissable;

@WebService
@Stateless
public class ProduitSOAPService {
	@EJB
	private DaoImpl dao;

	public DaoImpl getDao() {
		return dao;
	}

	public void setDao(DaoImpl dao) {
		this.dao = dao;
	}
	@WebMethod
	public void ajouterMagasin(
			@WebParam(name="nomMagasin")String nomMagasin,
			@WebParam(name="codeMagasin")int codeMagasin,
			@WebParam(name="prixDuLocal")double prixDuLocal) 
	{

		Magasin m= new Magasin();
		m.setNomMagasin(nomMagasin);
		m.setCodeMagasin(codeMagasin);
		m.setPrixDuLocal(prixDuLocal);
		
		dao.ajouterMagasin(m);
}
	@WebMethod
	public List<Magasin> findAllMagasins(){
		return dao.findAllMagasins();
	}
	@WebMethod
	public void modifierMagasin(
			@WebParam(name="idMagasin")long idMagasin,
			@WebParam(name="nomMagasin")String nomMagasin,
			@WebParam(name="codeMagasin")int codeMagasin,
			@WebParam(name="prixDuLocal")double prixDuLocal)
	{
		Magasin m= new Magasin();
		m.setIdMagasin(idMagasin);
		m.setNomMagasin(nomMagasin);
		m.setCodeMagasin(codeMagasin);
		m.setPrixDuLocal(prixDuLocal);
		dao.modifierMagasin(m);
	}
	@WebMethod
	public void supprimerMagasin(
			@WebParam(name="idMagasin")long idMagasin)
	{


dao.supprimerMagasin(idMagasin);



}
	@WebMethod
	public Magasin getMagasin(
			
			@WebParam(name="idMagasin")long idMagasin)
	{


return dao.getMagasin(idMagasin);
}
	@WebMethod
	public Magasin affichageMagasin(
			
			@WebParam(name="idMagasin")long idMagasin)
	{


return dao.affichageMagasin(idMagasin);
}
	@WebMethod
	public void ajouterProduitNonPerissable(
			@WebParam(name="nomProduit")String nomProduit,
			@WebParam(name="stock")int stock,
			@WebParam(name="prix")double prix,
			@WebParam(name="modeEmploi")String modeEmploi)
	{
		ProduitNonPerissable p = new ProduitNonPerissable();
		p.setNomProduit(nomProduit);
		p.setStock(stock);
		p.setPrix(prix);
		p.setModeEmploi(modeEmploi);
		
		dao.ajouterProduitNonPerissable(p);
}
	@WebMethod
	public List<ProduitNonPerissable> findAllProduitNonPerissable(){
		return dao.findAllProduitNonPerissable();
	}
	@WebMethod
	public void modifierProduitNonPerissable(
			
			@WebParam(name="idProduit")long idProduit,
			@WebParam(name="nomProduit")String nomProduit,
			@WebParam(name="stock")int stock,
			@WebParam(name="prix")double prix,
			@WebParam(name="modeEmploi")String modeEmploi)
	
	{
		ProduitNonPerissable p = new ProduitNonPerissable();
		p.setIdProduit(idProduit);
		p.setNomProduit(nomProduit);
		p.setStock(stock);
		p.setPrix(prix);
		p.setModeEmploi(modeEmploi);
		
		dao.modifierProduitNonPerissable(p);
}
	@WebMethod
	public void supprimerProduitNonPerissable(
			
			@WebParam(name="idProduit")long idProduit)
	{


dao.supprimerProduitNonPerissable(idProduit);



}
	@WebMethod
	public ProduitNonPerissable getProduitNonPerissable(
			
			@WebParam(name="idProduit")long idProduit)
	{


return dao.getProduitNonPerissable(idProduit);
}
	@WebMethod
	public ProduitNonPerissable  affichageProduitNonPerissable(
			@WebParam(name="idProduit")long idProduit)
	{


return dao.affichageProduitNonPerissable(idProduit);
}
	@WebMethod
	public void ajouterProduitPerissable(
			
			@WebParam(name="nomProduit")String nomProduit,
			@WebParam(name="stock")int stock,
			@WebParam(name="prix")double prix)
		
	{
		ProduitPerissable x = new ProduitPerissable();
		x.setNomProduit(nomProduit);
		x.setStock(stock);
		x.setPrix(prix);
		x.setDateLimiteUtilisation(new Date());
		dao.ajouterProduitPerissable(x);
}
	@WebMethod
	public List<ProduitPerissable> findAllProduitPerissable(){
		return dao.findAllProduitPerissable();
	}
	
	@WebMethod
	public void modifierProduitPerissable(
			@WebParam(name="idProduit")long idProduit,
			@WebParam(name="nomProduit")String nomProduit,
			@WebParam(name="stock")int stock,
			@WebParam(name="prix")double prix) {
		
		ProduitPerissable x = new ProduitPerissable();
		x.setIdProduit(idProduit);
		x.setNomProduit(nomProduit);
		x.setStock(stock);
		x.setPrix(prix);
		x.setDateLimiteUtilisation(new Date());
		
		dao.modifierProduitPerissable(x);
		
		
	}
	@WebMethod
	public void supprimerProduitPerissable(
			
			@WebParam(name="idProduit")long idProduit)
	{


       dao.supprimerProduitPerissable(idProduit);



}
	@WebMethod
	public ProduitPerissable getProduitPerissable(
			
			@WebParam(name="idProduit")long idProduit)
	{


return dao.getProduitPerissable(idProduit);
}
	@WebMethod
	public ProduitPerissable  affichageProduitPerissable(
			@WebParam(name="idProduit")long idProduit)
	{


return dao.affichageProduitPerissable(idProduit);
}
	@WebMethod
	public void ajouterProduit(
			
			@WebParam(name="nomProduit")String nomProduit,
			@WebParam(name="stock")int stock,
			@WebParam(name="prix")double prix,
			@WebParam(name="modeEmploi")String modeEmploi,
			@WebParam(name="idMagasin")long idMagasin){
		
		ProduitNonPerissable p = new ProduitNonPerissable();
		Magasin m = new Magasin();
		p.setNomProduit(nomProduit);
		p.setStock(stock);
		p.setPrix(prix);
		p.setModeEmploi(modeEmploi);
		p.setMagasin(m);
		
		dao.ajouterProduit(p, idMagasin);
			
			
		
	
}
}
