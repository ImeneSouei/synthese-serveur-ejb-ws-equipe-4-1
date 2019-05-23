package com.infotel.metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PNP")
public class ProduitNonPerissable extends Produit{
 /**
	 * 
	 */
	private static final long serialVersionUID = 8295339742880297099L;
private String modeEmploi;

public String getModeEmploi() {
	return modeEmploi;
}

public void setModeEmploi(String modeEmploi) {
	this.modeEmploi = modeEmploi;
}

@Override
public String toString() {
	return "ProduitNonPerissable [modeEmploi=" + modeEmploi + "]";
}
 
}
