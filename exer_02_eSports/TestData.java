/* DO NOT MODIFY THE CONTENTS OF THIS FILE */
// This is NOT the file on which you have to work
/* DO NOT MODIFY THE CONTENTS OF THIS FILE */

package exer_02_eSports;

public class TestData {
	private static String[] games1 = {
            "Cyberblade",
            "New Inferno",
            "Solar Storms",
            "Phantom Core",
            "Xenon Strike",
            "Crimson Vortex",
            "Veil of Shadows",
            "Mechforge",
            "Pixel Revolt",
        };

        private static String[] games2 = {
            "Aurora Legends",
            "Mystic Encounters",
            "Lunar Heroine",
            "Diva Quest",
            "Glimmer Clash"
        };

        private static String[] games3 = {
            "Void Runners",
            "Solaris Blackout",
            "Mech Havoc",
            "Overload"
        };

        //----

        private static String[] players1 = {
            "Albert Abelson",
            "Beatrix Bonmati",
            "Carla Collins",
            "Diego Dupont",
            "Erik Esposito",
            "Fiona Fonseca"
        };

        private static String[] players2 = {
            "Queralt Quintana",
            "Roser Riba",
            "Silvia Sala",
            "Teresa Tubau",
        };


        private static String[] players3 = {
            "Zenon Zimmerman",
            "Yosh Yardley",
            "Xenia Xirau",
            "Winston White",
            "Violeta Vidal"
        };

        // ----


        private static int[][] scores1 = {
                { -1, -1, 2000, -1, 2500, 2800},
                { 1500, 7250, 0, -1, 5000, 5100},
                { -1, 9500, -1, -1, 5550, 0},
                { 3200, -1, 8900, -1, 5500, 0},
                { 8100, 0, -1, 9950, 7800, 2500},
                { -1, 1250, 4800, 8950, -1, 1550},
                { 1000, 2500, 1300, 100, -1, 3000},
                { -1, 4580, 9800, 0, -1, 9750},
                { 0, -1, 3700, 7500, -1, 0}
            };

            private static int[][] scores2 = {
                {  1000, 2000, 3000, 4000},
                {  5000, 4000, 3000, 2000},
                {  2000, 3000, 5000, 4000},
                {  4000, 5000, 2000, 3000},
                {  3000, 1000, 4000, 5000}
            };

            private static int[][] scores3 = {
                { -1, 2500, 3800, 900, 5050},
                { 0, -1, 4400, 600, 1500},
                { 0, 0, -1, 4750, 1000},
                { -1, -1, -1, -1, 12800}
            };

	public static String[] getGames(int gn) {
		switch (gn) {
		case 1:
			return games1;
		case 2:
			return games2;
		case 3:
		default:
			return games3;
		}
	}

	public static String[] getPlayers(int gn) {
		switch (gn) {
		case 1:
			return players1;
		case 2:
			return players2;
		case 3:
		default:
			return players3;
		}
	}
	
	public static int[][] getScores(int gn) {
		switch (gn) {
		case 1:
			return scores1;
		case 2:
			return scores2;
		case 3:
		default:
			return scores3;
		}
	}
} // TestData utility class ends here
