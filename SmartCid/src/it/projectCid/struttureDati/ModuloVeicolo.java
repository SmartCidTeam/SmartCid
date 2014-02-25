package it.projectCid.struttureDati;

/**
 * Oggetto rappresentante il modulo veicolo A e modulo veicolo B
 * 
 * @author DanieleNegroni
 */
public class ModuloVeicolo {
	Utente utente;
	Veicolo veicolo;
	CompagniaAssicurativa compagniaAssicurativa;
	Conducente conducente;
	
	/**
	 * @return the utente
	 */
	public Utente getUtente() {
		return utente;
	}
	
	/**
	 * @param utente the utente to set
	 */
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	/**
	 * @return the veicolo
	 */
	public Veicolo getVeicolo() {
		return veicolo;
	}
	
	/**
	 * @param veicolo the veicolo to set
	 */
	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
	}
	
	/**
	 * @return the compagniaAssicurativa
	 */
	public CompagniaAssicurativa getCompagniaAssicurativa() {
		return compagniaAssicurativa;
	}
	
	/**
	 * @param compagniaAssicurativa the compagniaAssicurativa to set
	 */
	public void setCompagniaAssicurativa(CompagniaAssicurativa compagniaAssicurativa) {
		this.compagniaAssicurativa = compagniaAssicurativa;
	}
	
	/**
	 * @return the conducente
	 */
	public Conducente getConducente() {
		return conducente;
	}
	
	/**
	 * @param conducente the conducente to set
	 */
	public void setConducente(Conducente conducente) {
		this.conducente = conducente;
	}
	
}
