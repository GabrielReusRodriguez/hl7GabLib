package hl7GabLib.estructuras;

import hl7GabLib.estructuras.v21.HL7_Messages_v21;
import hl7GabLib.estructuras.v22.HL7_Messages_v22;
import hl7GabLib.estructuras.v23.HL7_Messages_v23;
import hl7GabLib.estructuras.v231.HL7_Messages_v231;
import hl7GabLib.estructuras.v24.HL7_Messages_v24;
import hl7GabLib.estructuras.v25.HL7_Messages_v25;
import hl7GabLib.estructuras.v251.HL7_Messages_v251;
import hl7GabLib.estructuras.v26.HL7_Messages_v26;

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
	
	public static String getType(HL7_Messages_v231 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length > 0){ //Si es ACK no hay subtipo.
				return chunks[0];
			}
		}
		return "";
	}

	public static String getSubType(HL7_Messages_v231 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length == 2){
				return chunks[1];
			}
		}
		return "";
	}
	public static String getType(HL7_Messages_v24 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length > 0){ //Si es ACK no hay subtipo.
				return chunks[0];
			}
		}
		return "";
	}

	public static String getSubType(HL7_Messages_v24 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length == 2){
				return chunks[1];
			}
		}
		return "";
	}
	
	public static String getType(HL7_Messages_v25 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length > 0){ //Si es ACK no hay subtipo.
				return chunks[0];
			}
		}
		return "";
	}

	public static String getSubType(HL7_Messages_v25 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length == 2){
				return chunks[1];
			}
		}
		return "";
	}
	
	public static String getType(HL7_Messages_v251 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length > 0){ //Si es ACK no hay subtipo.
				return chunks[0];
			}
		}
		return "";
	}

	public static String getSubType(HL7_Messages_v251 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length == 2){
				return chunks[1];
			}
		}
		return "";
	}
	
	public static String getType(HL7_Messages_v26 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length > 0){ //Si es ACK no hay subtipo.
				return chunks[0];
			}
		}
		return "";
	}

	public static String getSubType(HL7_Messages_v26 msg){
		if(msg != null){
			String[] chunks = msg.toString().split("_");
			if(chunks.length == 2){
				return chunks[1];
			}
		}
		return "";
	}

	
	
}
