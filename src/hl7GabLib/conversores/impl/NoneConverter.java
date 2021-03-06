package hl7GabLib.conversores.impl;

import hl7GabLib.conversores.excepciones.ConversorException;
import hl7GabLib.conversores.interfaces.ConversorInterface;

public class NoneConverter implements ConversorInterface {

	protected NoneConverter() {
	}

	@Override
	public String execute(String msg) throws ConversorException {
		throw new ConversorException("Conversor no soportado.");
	}

}
