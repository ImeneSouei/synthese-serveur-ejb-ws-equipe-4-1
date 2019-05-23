package com.infotel.wssoap;

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
}
