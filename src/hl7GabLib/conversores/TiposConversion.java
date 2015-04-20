package hl7GabLib.conversores;

public enum TiposConversion {
	NONE(0),
	HL7_TO_XML(1),
	XML_TO_HL7(2);
	
	private int value;
	private TiposConversion(int value){
		this.value = value;
	}
	
}
