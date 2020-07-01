package com.Magic8Ball.project;

import java.util.Random;


public class Ball {
	
	public static void main(String[] args) {

		Random r = new Random();
		int choice = (int)(Math.random()*8 + 1);//Get a random number from 1to 8
		String response  = "";

//for(int i=0; i<choice; i++){
		getAnswer(choice);
}

	public static int getAnswer(int choice) {
		String response;
		if (choice == 1)
		response = "It is certain";
		else if (choice == 2)
		response = "Ask again later";
		else if (choice == 3)
		response = "As I See it Yes";
		else if (choice == 4)
		response = "My reply is no";
		else if (choice == 5)
		response = "Canot predict now";
		else if (choice == 6)
		response = "Without a doubt";
		else if (choice == 7)
		response = "Yes- Definitely";
		else if (choice == 8)
		response = "No";
		else
		response = "8-BALL ERROR!";
		
		System.out.println("Magic 8-Ball Says: " + response );
		return choice;
	}
}
//}