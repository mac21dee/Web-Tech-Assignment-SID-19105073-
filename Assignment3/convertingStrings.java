import java.util.ArrayList;
import java.util.Scanner;

public class convertingStrings{
	static int dp[][];
	static ArrayList<ArrayList<String> > arrs =
							new ArrayList<ArrayList<String> >();
	static void printAllChanges(String s1, String s2, ArrayList<String> changes)
	{
		int i = s1.length();
		int j = s2.length();
		while (true) {

			if (i == 0 || j == 0) {
				arrs.add(changes);
				break;
			}
			if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
				i--;
				j--;
			}

			else {
				boolean if1 = false, if2 = false;
				if (dp[i][j] == dp[i - 1][j - 1] + 1) {

					changes.add("Change " + s1.charAt(i - 1)
								+ " to " + s2.charAt(j - 1));
					i--;
					j--;
					if1 = true;
				}
				if (dp[i][j] == dp[i - 1][j] + 1) {
					if (if1 == false) {
						changes.add("Delete " + s1.charAt(i - 1));
						i--;
					}
					else {
						ArrayList<String> changes2 = new ArrayList<String>();
						changes2.addAll(changes);
						changes2.remove(changes.size() - 1);
						changes2.add("Delete " + s1.charAt(i));
						printAllChanges(s1.substring(0, i),
										s2.substring(0, j + 1), changes2);
					}

					if2 = true;
				}

				if (dp[i][j] == dp[i][j - 1] + 1) {
					if (if1 == false && if2 == false) {
						changes.add("Add " + s2.charAt(j - 1));
						j--;
					}
					else {

						// Add steps
						ArrayList<String> changes2 = new ArrayList<String>();
						changes2.addAll(changes);
						changes2.remove(changes.size() - 1);
						changes2.add("Add " + s2.charAt(j));

						// Recursively call for the next steps
						printAllChanges(s1.substring(0, i + 1),
										s2.substring(0, j), changes2);
					}
				}
			}
		}
	}

	// Function to compute the DP matrix
	static void editDP(String s1, String s2)
	{
		int l1 = s1.length();
		int l2 = s2.length();
		int[][] DP = new int[l1 + 1][l2 + 1];

		// initialize by the maximum edits possible
		for (int i = 0; i <= l1; i++)
			DP[i][0] = i;
		for (int j = 0; j <= l2; j++)
			DP[0][j] = j;

		// Compute the DP matrix
		for (int i = 1; i <= l1; i++) {
			for (int j = 1; j <= l2; j++) {

				// if the characters are same
				// no changes required
				if (s1.charAt(i - 1) == s2.charAt(j - 1))
					DP[i][j] = DP[i - 1][j - 1];
				else {

					// minimum of three operations possible
					DP[i][j] = min(DP[i - 1][j - 1],
								DP[i - 1][j], DP[i][j - 1])
							+ 1;
				}
			}
		}

		// initialize to global array
		dp = DP;
	}

	// Function to find the minimum of three
	static int min(int a, int b, int c)
	{
		int z = Math.min(a, b);
		return Math.min(z, c);
	}
	static void printWays(String s1, String s2,
						ArrayList<String> changes)
	{

		// Function to print all the ways
		printAllChanges(s1, s2, new ArrayList<String>());

		int i = 1;

		// print all the possible ways
		for (ArrayList<String> ar : arrs) {
			System.out.println("\nMethod " + i++ + " : \n");
			for (String s : ar) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) throws Exception
	{   
        
        Scanner sc = new Scanner(System.in);
        // Take the string that needs to be sorted as input
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        //function to show how to edit the string
		editDP(s1, s2);
        // This will print the pathways to the target
		printWays(s1, s2, new ArrayList<String>());
        sc.close();
	}
}