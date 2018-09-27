package com.examen.model;

import java.math.BigDecimal;

public class ModelTO {


	String date;
	BigDecimal apertura;
	BigDecimal cierre;
		
	public void ModelTO() {
		
	}
	public ModelTO(String date, String papertura, String pcierre) {
		
		this.date = date;
		this.apertura = new BigDecimal(papertura);
		this.cierre = new BigDecimal(pcierre);
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the apertura
	 */
	public BigDecimal getApertura() {
		return apertura;
	}

	/**
	 * @param apertura the apertura to set
	 */
	public void setApertura(BigDecimal apertura) {
		this.apertura = apertura;
	}

	/**
	 * @return the cierre
	 */
	public BigDecimal getCierre() {
		return cierre;
	}

	/**
	 * @param cierre the cierre to set
	 */
	public void setCierre(BigDecimal cierre) {
		this.cierre = cierre;
	}
	

}
