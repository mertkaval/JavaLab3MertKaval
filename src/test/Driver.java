package test;

import lab3.Pawn;
import lab3.Bishop;
import lab3.Knight;
import lab3.Queen;
import lab3.Rook;
import lab3.King;

public class Driver {

	public static void main(String[] args) {

		Bishop myBishop = new Bishop();
		Pawn myPawn = new Pawn();
		Pawn myPawn1 = new Pawn();
		Pawn myPawn2 = new Pawn();
		Pawn myPawn3 = new Pawn();
		Pawn myPawn4 = new Pawn();
		Pawn myPawn5 = new Pawn();
		Pawn myPawn6 = new Pawn();
		

		Knight myKnight = new Knight();
		Queen myQueen = new Queen();
		Rook myRook = new Rook();
		King myKing = new King();

		myPawn1.promote(myBishop);
		myPawn2.promote(myPawn);
		myPawn3.promote(myKnight);
		myPawn4.promote(myQueen);
		myPawn5.promote(myRook);
		myPawn6.promote(myKing);
		
		
		System.out.println("testing promote pawn to bishop");
		System.out.println(myPawn1);
		System.out.println("--------------------------------");
		System.out.println("testing promote pawn to pawn");
		System.out.println(myPawn2);
		System.out.println("--------------------------------");
		System.out.println("testing promote pawn to knight");
		System.out.println(myPawn3);
		System.out.println("--------------------------------");
		System.out.println("testing promote pawn to queen");
		System.out.println(myPawn4);
		System.out.println("--------------------------------");
		System.out.println("testing promote pawn to rook");
		System.out.println(myPawn5);
		System.out.println("--------------------------------");
		System.out.println("testing promote pawn to king");
		System.out.println(myPawn6);
		
		
		
		

	}

}
