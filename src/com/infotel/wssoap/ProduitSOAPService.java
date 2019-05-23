package com.infotel.wssoap;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.infotel.dao.DaoImpl;
import com.infotel.metier.Magasin;

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
}
