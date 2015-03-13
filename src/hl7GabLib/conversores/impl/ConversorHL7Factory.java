package hl7GabLib.conversores.impl;

import hl7GabLib.conversores.TiposConversion;
import hl7GabLib.conversores.interfaces.ConversorFactoryInterface;
import hl7GabLib.conversores.interfaces.ConversorInterface;

public class ConversorHL7Factory implements ConversorFactoryInterface {

	private ConversorHL7Factory() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public ConversorInterface newInstance(TiposConversion type) {
		
		ConversorInterface conversor = null;
		if (type != null) {
			type = TiposConversion.NONE;
		}

		switch (type) {
		case HL7TOXML:
			conversor = new HL7ToXmlConverter();
			break;
		case XMLTOHL7:
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
