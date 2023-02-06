package it.unipv.sfw.esame.progettoC23;

import java.text.DateFormat;
import java.util.Date;

public class Macchinario {
  private int IDMacchinario; 
  private Date DataAcquisto; 
  private String NomeMacchinario;
  private Date DataUltimaManutenzione;
  
public Macchinario(int iDMacchinario, Date dataAcquisto, String nomeMacchinario) {
	IDMacchinario = iDMacchinario;
	DataAcquisto = dataAcquisto;
	NomeMacchinario = nomeMacchinario;
	this.DataUltimaManutenzione = 00/00/0000;
}

public int getIDMacchinario() {
	return IDMacchinario;
}

public void setIDMacchinario(int iDMacchinario) {
	IDMacchinario = iDMacchinario;
}

public void setDataAcquisto(Date dataAcquisto) { //impostare data attuale
	DataAcquisto = dataAcquisto;
}

public Date getDataUltimaManutenzione() {
	return DataUltimaManutenzione;
}

public void setDataUltimaManutenzione(Date dataUltimaManutenzione) {
	DataUltimaManutenzione = dataUltimaManutenzione;
}
  
}

