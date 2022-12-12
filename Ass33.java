package in.ineuron.main;

import java.util.Scanner;

public class Ass33 {
	int numFromGuesser;
	
	int Guesser() {
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Guesser please enter a number betwwen 1 to 10");
		numFromGuesser =sc.nextInt();
		}while(numFromGuesser<0 || numFromGuesser>10);
		return numFromGuesser;
	}
	
	int numFromPlayer1;
	
	int Player1() {
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Player1 please enter a number betwwen 1 to 10");
		numFromPlayer1=sc.nextInt();
		}while(numFromPlayer1<0 || numFromPlayer1>10);
		return numFromPlayer1;
	}
	
	int numFromPlayer2;
	
	int Player2() {
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Player2 please enter a number between 1 to 10");
		numFromPlayer2=sc.nextInt();
		}while(numFromPlayer2<0 ||numFromPlayer2>10);
		return numFromPlayer2;
	}
	
	int numFromPlayer3;
	
	int Player3() {
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Player3 please enter a number between 1 to 10");
		numFromPlayer3=sc.nextInt();
		}while(numFromPlayer3<0 || numFromPlayer3>10);
		return numFromPlayer3;
	}
	
	void compare() {
		if(numFromPlayer1==numFromGuesser) {
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
				System.out.println("Game tied between Player1 and Player2 and Player3");
			else if(numFromGuesser==numFromPlayer2) 
				System.out.println("Game tied between Player1 and Player2");
			else if(numFromGuesser==numFromPlayer3 )
				System.out.println("Game tied between Player1 and Player3");
			else 
				System.out.println("Player1 won the Game");
		}
		else if(numFromGuesser==numFromPlayer2) {
			if(numFromGuesser==numFromPlayer3)
				System.out.println("Game tied betwen Player2 and Player3");
			else
				System.out.println("Player2 won the Game");
		}
		else if(numFromPlayer3==numFromGuesser) 
			System.out.println("Player3 won the game");
		else 
			System.out.println("Game lost try again!");
	}
    public static void main(String[] args) {
		Ass33 ass=new Ass33();
		ass.Guesser();
		ass.Player1();
		ass.Player2();
		ass.Player3();
		ass.compare();
	}
}
