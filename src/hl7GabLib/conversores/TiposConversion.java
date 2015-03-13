package hl7GabLib.conversores;

public enum TiposConversion {
	NONE(0),
	HL7TOXML(1),
	XMLTOHL7(2);
	
	private int value;
	private TiposConversion(int value){
		this.value = value;
	}
	
}
