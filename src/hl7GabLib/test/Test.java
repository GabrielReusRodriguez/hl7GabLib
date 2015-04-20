package hl7GabLib.test;

import hl7GabLib.versiones.HL7_Versiones;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inici");
		
		HL7_Versiones version = HL7_Versiones.v2_2;
		
		switch(version){
		case v2_2:
			System.out.println("V2.2");
			break;
		case v2_1:
			System.out.println("V2.1");
			break;
			default:
				System.out.println("Default");
				break;
		}
		
		System.out.println("Final");
	}

}
