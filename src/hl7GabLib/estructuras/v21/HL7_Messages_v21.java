package hl7GabLib.estructuras.v21;

public enum HL7_Messages_v21 {

	// V2.1
	UNKNOWN(""),
	ACK("ACK"), ADR_A19("ADR_A19"), ADT_A01("ADT_A01"), ADT_A02("ADT_A02"), ADT_A03(
			"ADT_A03"), ADT_A04("ADT_A04"), ADT_A05("ADT_A05"), ADT_A06(
			"ADT_A06"), ADT_A07("ADT_A07"), ADT_A08("ADT_A08"), ADT_A09(
			"ADT_A09"), ADT_A10("ADT_A10"), ADT_A11("ADT_A11"), ADT_A12(
			"ADT_A12"), ADT_A13("ADT_A13"), ADT_A14("ADT_A14"), ADT_A15(
			"ADT_A15"), ADT_A16("ADT_A16"), ADT_A17("ADT_A17"), ADT_A18(
			"ADT_A18"), ADT_A19("ADT_A19"), ADT_A20("ADT_A20"), ADT_A21(
			"ADT_A21"), ADT_A22("ADT_A22"), ADT_A23("ADT_A23"), ADT_A24(
			"ADT_A24"), ADT_AXX("ADT_AXX"), BAR_P01("BAR_P01"), BAR_P02(
			"BAR_P02"), DFT_P03("DFT_P03"), DSR_Q01("DSR_Q01"), DSR_Q03(
			"DSR_Q03"), MFC_Q02("MFC_QO2"), ORM_O01("ORM_O01"), ORR_O02(
			"ORR_O02"), ORU_R01("ORU_R01"), ORU_R03("ORU_R03"), QRY_A19(
			"QRY_A19"), QRY_Q01("QRY_Q01"), QRY_Q02("QRY_Q02"), UDM_Q05(
			"UDM_Q05");

	private final String text;

	/**
	 * @param text
	 */
	private HL7_Messages_v21(final String text) {
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
