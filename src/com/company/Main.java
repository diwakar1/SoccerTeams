package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	final int MIN_Players=9;
	final int MAX_Players = 15;
	 int teamsize;
	 int players=0;
	 int teams;
	 int leftover;
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the numbers of players per team: ");
        teamsize = input.nextInt();

        System.out.println("Number should "
                            + " between "+ MIN_Players + "   and  " +
                             MAX_Players);

        while (teamsize<9 || teamsize >15 ){

            System.out.println("This is invalid");
            System.out.println("Enter the numbers of players per team: ");
            teamsize = input.nextInt();
        }
        System.out.println("Enter number of players: ");
        players= input.nextInt();
        while (players< 0 )
        {
            System.out.println(" please do not enter the negative number.");
            System.out.println("Enter number of players: ");
            players= input.nextInt();

        }
        teams = players/ teamsize;
        leftover= players%teamsize;
        System.out.println( "There are teams "+ teams + " and  leftover "+ leftover);
    }
}
