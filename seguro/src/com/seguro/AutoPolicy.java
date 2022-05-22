package com.seguro;

import java.util.Scanner;

public class AutoPolicy {

	public static void main(String[] args) {

		String s = "";
		
		Scanner input = new Scanner(System.in);

		switch (input.next()) {
		case "Connecticut":
			System.out.println("Connecticut,");
			break;
		case "Maine":
			System.out.println("Maine");
			break;
		case "Massachusetts,":
			System.out.println("Massachusetts");
			break;
		case "New Hampshire":
			System.out.println("New Hampshire");
			break;
		case "Nova Jersey":
			System.out.println("Nova Jersey");
			break;
		case "Nova York":
			System.out.println("Nova York");
			break;
		case "Pensilvânia":
			System.out.println("Pensilvânia");
			break;
		case "Rhode Island":
			System.out.println("Rhode Island");
			break;
		case "Vermont.":
			System.out.println("Vermont");
			break;
		default:
			System.out.println("Seguro não aplicado neste estado");

		}
		input.close();
	}
}
