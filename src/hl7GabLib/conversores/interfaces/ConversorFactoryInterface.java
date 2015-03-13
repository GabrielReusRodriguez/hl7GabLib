package hl7GabLib.conversores.interfaces;

import hl7GabLib.conversores.TiposConversion;

public interface ConversorFactoryInterface {
	public ConversorInterface newInstance(TiposConversion type);
}
