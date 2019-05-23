package com.infotel.metier;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PP")
public class ProduitPerissable extends Produit {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6962680741639084604L;
private Date dateLimiteUtilisation;

public Date getDateLimiteUtilisation() {
	return dateLimiteUtilisation;
}
public void setDateLimiteUtilisation(Date dateLimiteUtilisation) {
	this.dateLimiteUtilisation = dateLimiteUtilisation;
}
@Override
public String toString() {
	return "ProduitPerissable [dateLimiteUtilisation=" + dateLimiteUtilisation + "]";
}

}
