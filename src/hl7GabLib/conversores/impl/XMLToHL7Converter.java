package hl7GabLib.conversores.impl;

import hl7GabLib.conversores.excepciones.ConversorException;
import hl7GabLib.conversores.interfaces.ConversorInterface;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.DefaultXMLParser;
import ca.uhn.hl7v2.parser.EncodingNotSupportedException;
import ca.uhn.hl7v2.parser.PipeParser;
import ca.uhn.hl7v2.parser.XMLParser;

public class XMLToHL7Converter implements ConversorInterface {

	protected XMLToHL7Converter() {
	}

	@Override
	public String execute(String input) throws ConversorException {
		String retorno ="";

	  	XMLParser xmlParser = new DefaultXMLParser();
	  	PipeParser pipeParser = new PipeParser();
		Message hapiMsg;
		try {
			// The parse method performs the actual parsing
			
			hapiMsg = xmlParser.parse(input);
			retorno = pipeParser.encode(hapiMsg);
			
		} catch (EncodingNotSupportedException e) {
			throw new ConversorException("EncodingNotSupported",e);
		} catch (HL7Exception e) {
			throw new ConversorException("HL7Exception",e);
		}

		return retorno;
	}

}
