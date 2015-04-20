package hl7GabLib.estructuras;

import hl7GabLib.estructuras.v21.HL7_Messages_v21;
import hl7GabLib.estructuras.v22.HL7_Messages_v22;
import hl7GabLib.estructuras.v23.HL7_Messages_v23;

public abstract class HL7_MessageChunker {
	
	public static String getType(HL7_Messages_v21 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length > 0){ //Si es ACK no hay subtipo.
				return chunks[0];
			}
		}
		return "";
	}

	public static String getSubType(HL7_Messages_v21 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length == 2){
				return chunks[1];
			}
		}
		return "";
	}

	public static String getType(HL7_Messages_v22 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length > 0){ //Si es ACK no hay subtipo.
				return chunks[0];
			}
		}
		return "";
	}

	public static String getSubType(HL7_Messages_v22 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length == 2){
				return chunks[1];
			}
		}
		return "";
	}

	public static String getType(HL7_Messages_v23 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length > 0){ //Si es ACK no hay subtipo.
				return chunks[0];
			}
		}
		return "";
	}

	public static String getSubType(HL7_Messages_v23 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length == 2){
				return chunks[1];
			}
		}
		return "";
	}

	
	
}
