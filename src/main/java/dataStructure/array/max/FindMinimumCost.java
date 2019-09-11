package dataStructure.array.max;

//Java implementation of the approach 
import java.util.*; 

class FindMinimumCost 
{ 

//Function to return the minimum cost 
//to reach the last index 
static int FindMinimumCostM(int ind, int a[], 
						int n, int k, int dp[]) 
{ 

	// If we reach the last index 
	if (ind == (n - 1)) 
		return 0; 

	// Already visited state 
	else if (dp[ind] != -1) 
		return dp[ind]; 
	else { 

		// Initially maximum 
		int ans = Integer.MAX_VALUE; 

		// Visit all possible reachable index 
		for (int i = 1; i <= k; i++) 
		{ 
			System.out.println("for loop started "+ i);

			// If inside range 
			if (ind + i < n) 
			{	System.out.println("before "+ ans);
				ans = Math.min(ans, Math.abs(a[ind + i] - a[ind]) + 
							FindMinimumCostM(ind + i, a, n, k, dp)); 

				System.out.println("after "+ ans);
				}
			// We cannot move any further 
			else
				break; 
		} 

		// Memoize 
		System.out.println(Arrays.toString(dp));
		return dp[ind] = ans; 
	} 
} 

//Driver Code 
public static void main(String[] args) 
{ 
	int a[] = { 10, 30, 40, 50, 20 }; 
	int k = 3; 
	int n = a.length; 
	int dp[] = new int[n]; 
	Arrays.fill(dp, -1); 
	System.out.println(FindMinimumCostM(0, a, n, k, dp)); 
	System.out.println(Arrays.toString(dp));
} 
} 
