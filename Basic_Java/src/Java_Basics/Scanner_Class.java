package Java_Basics;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[3];
		array [0] = "Prashant";
		array [1] = "Uttam";
		array [2] = "mane";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = input.nextLine();
		
		System.out.println("My name is"+ " " + name);

	}

}
