package com.pluralsight;

import java.util.Scanner;

public class HighscoreWins {
    public static void main(String[] args) {

        ///Created a scanner
        Scanner theScan = new Scanner(System.in);

        //ask then the question
        System.out.println("Please enter the game score (Home:Visitor|21:9): ");

        //the score
        String gameScore = theScan.nextLine().trim();

        //split the gameScore info on the |
        String[] gameParts = gameScore.split("\\|");
        System.out.println("Game Score is: " + gameParts [0]);
        System.out.println("Game Score is: " + gameParts [1]);

        //get the individual team scores in their own array
        String[] teamNames = gameParts[0].split(":");

        //the first team name in their own array
        String homeTeam = teamNames[0];
        String visitorTeam = teamNames[1];

        //get the individual team scores in their own array
        String[] teamScores = gameParts[1].split(":");

        //get the individual team scores in their own array
        int homeScore = Integer.parseInt(teamScores[0]);
        int visitorScore = Integer.parseInt (teamScores[1]);

        //display the name of the winning team
         if (homeScore > visitorScore) {
            System.out.println("Winner:" + homeTeam);
        } else if (visitorScore> homeScore) {
             System.out.println("Winner: " + visitorTeam);
        } else {
             System.out.println("Winner: Tie!");
        }


    }
}
