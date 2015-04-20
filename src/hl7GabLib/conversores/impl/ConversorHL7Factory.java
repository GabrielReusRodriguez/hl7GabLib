package hl7GabLib.conversores.impl;

import hl7GabLib.conversores.TiposConversion;
import hl7GabLib.conversores.interfaces.ConversorInterface;

public abstract class ConversorHL7Factory {
	
	public static ConversorInterface newInstance(TiposConversion type) {
		
		ConversorInterface conversor = null;
		if (type == null) {
			type = TiposConversion.NONE;
		}

		switch (type) {
		case HL7_TO_XML:
			conversor = new HL7ToXmlConverter();
			break;
		case XML_TO_HL7:
			conversor = new XMLToHL7Converter();
			break;
		case NONE:
		default:
			conversor = new NoneConverter();
			break;
		}

		return conversor;
	}

}
