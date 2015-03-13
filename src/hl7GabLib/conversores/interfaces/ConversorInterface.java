package hl7GabLib.conversores.interfaces;

import hl7GabLib.conversores.excepciones.ConversorException;

public interface ConversorInterface {

	public String execute(String msg) throws ConversorException;
}
