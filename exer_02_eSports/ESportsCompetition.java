package exer_02_eSports;

import jconsole.JConsole;
import java.awt.Color;

public class ESportsCompetition {

	public static void main(String[] args)
    {
		JConsole console = new JConsole (80, 40);
		
        String[] games;
        String[] players;
        int[][] scores;

        int datasets;
        int NUMBER_OF_DATASETS = 3;

        console.println("E-SPORTS COMPETITION");
        console.println("--------------------");
        console.println();

        datasets = ReadDatasetNumber(NUMBER_OF_DATASETS, console);
        games = TestData.getGames(datasets);
        players = TestData.getPlayers(datasets);
        scores = TestData.getScores(datasets);

        // ---
        console.println();

        /* COMPLETE FROM THIS POINT */
        
        
        console.print("\n\n\nPress any key to exit");
        console.readKey();
        System.exit(0);

    }


    static int ReadDatasetNumber(int nd, JConsole console)
    {
        /* COMPLETE */
       
    }

    // determine games per player
    static int GamesPerPlayer (int playerIndex, int[][] scores)
    {
    	// calculate how many games each player plays
        /* COMPLETE */
    }

    // show games per player
    static void ShowGamesPerPlayer (String [] players, int [][] scores, JConsole console)
    {
    	// for each player show how many games they play. Use previous function
        /* COMPLETE */
    }

   // best game per player. Returns index.
   static int BestGamePerPlayer (int playerIndex, int[][] scores)
   {
        // determine the (index of) the game in which the player scores the most. 
       /* COMPLETE */
   }

   // show best game per player
   static void ShowBestGamePerPlayer (String [] games, String [] players, int [][] scores, JConsole console)
   {
	   // for each player display the name of the game in which they score the most.
       /* COMPLETE */
   }

   // game average score
   static double GameAverageScore (int gameIndex, int[][] scores)
   {
	   // calculate averge score for the given game
       /* COMPLETE */
   }

   // Show average score per game
   static void ShowAverageScorePerGame (String[] games, int[][] scores, JConsole console) {
	   // for each game show its average score
       /* COMPLETE */
   }
	
}
