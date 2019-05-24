package com.infotel.wsrest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.infotel.dao.DaoImpl;

import com.infotel.metier.Magasin;

@Stateless
@Path(value = "/produits")
public class ProduitRestService {
	@EJB 
	private DaoImpl dao;
	 //methode ajouter un magazin
		@GET
	    @Path("addMagasin/{nomMagasin}/{codeMagasin}/{prixDuLocal}")
		@Produces(MediaType.APPLICATION_JSON)
		public void ajouterMagasin(
				@PathParam(value = "nomMagasin") String nomMagasin,
				@PathParam(value = "codeMagasin") int  codeMagasin,
				@PathParam(value = "prixDuLocal")double prixDuLocal) {

			Magasin m= new Magasin();
			m.setNomMagasin(nomMagasin);
			m.setCodeMagasin(codeMagasin);
			m.setPrixDuLocal(prixDuLocal);
			
			dao.ajouterMagasin(m);
		}
			 //methode lister magazin
			@GET
			@Path("allMagasins")
			@Produces(MediaType.APPLICATION_JSON)
			public List<Magasin> getAllMagasins(){

				return dao.findAllMagasins();
			}
}
