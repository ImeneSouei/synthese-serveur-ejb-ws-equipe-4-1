package com.infotel.wsrest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class ApplicationProduit extends Application{
	
	
	  @Override
	   public Set<Class<?>> getClasses() {
	      Set<Class<?>> resources = new HashSet<>();//permet dajouter les ressources
	       addRestRessources(resources);
	       return resources;
	       
	   }// fin de methode
	   
	   /**
	    * permet de rajouter des ressource dans le WS REST
	    * @param resources 
	    */
	   
	   private void addRestRessources (Set<Class<?>> resources){
	       
	       //ajout de la resources 
	       resources.add(com.infotel.wsrest.ProduitRestService.class);
	       
	   }
}