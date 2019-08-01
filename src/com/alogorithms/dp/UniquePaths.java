/**
 * 
 */
package com.alogorithms.dp;

/**
 * @author kkanaparthi
 * 
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. 
 * The robot is trying to reach the bottom-right corner of the grid 
 * (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 *
 *
 *
 * Above is a 7 x 3 grid. How many possible unique paths are there?
 * Note: m and n will be at most 100.
 * 
 * 
 * Input: m = 3, n = 2
 *	Output: 3
 *  Explanation:
 *  From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down
 * 2. Right -> Down -> Right
 * 3. Down -> Right -> Right
 * 
 * We will some obstacles along the path, when there is an obstacle there is no path through that path, 
 * and also mark the adjascent nodes also as zero as there is no path possible once there is an obstacle.
 * 
 */
public class UniquePaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int totalPaths = getTotalPaths(2,2);
		System.out.println(" Total Paths are  "+totalPaths);
	}

	/**
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	private static final int getTotalPaths(int m, int n) {
		int[][] paths = new int[m][n];
		
		for(int i=0;i<m;i++) {
			paths[i][0] = 1;
		}
		for(int j=0;j<n;j++) {
			paths[0][j] = 1;
		}
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				paths[i][j] = paths[i-1][j]+paths[i][j-1];
			}
		}
		return paths[m-1][n-1];
	}
}
