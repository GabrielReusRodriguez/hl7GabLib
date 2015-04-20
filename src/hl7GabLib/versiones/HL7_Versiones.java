package hl7GabLib.versiones;

public enum HL7_Versiones {

	unknown(""),v2_1("2.1"), v2_2("2.2"), v2_3("2.3"), v2_3_1("2.3.1"), v2_4("2.4"), v2_5(
			"2.5"), v2_5_1("2.5.1"), v2_6("2.6");
	private final String text;

	/**
	 * @param text
	 */
	private HL7_Versiones(final String text) {
		this.text = text;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return text;
	}
	
}
