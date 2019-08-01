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
 */
public class UniquePathsWithObstacles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][]obstacleGrid = new int[][] {
		                       {0,0,0},
		                       {0,1,0},
		                       {0,0,0}
		};
		//obstacleGrid[0][1] = {}
		int totalPaths = getTotalPathsWithObstacles(obstacleGrid);
		System.out.println(" Total Paths With Obstacles are  "+totalPaths);
	}
	
	/**
	 * 
	 * @param obstacleGrid
	 * @return
	 */
	private static final int getTotalPathsWithObstacles(int[][]obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		
		int[][] paths = new int[m][n];
		
		for(int i=0;i<m;i++) {
			if(obstacleGrid[i][0]==1) {
				paths[i][0] = 0;
			} else {
				paths[i][0] = 1;
			}
		}
		
		for(int j=0;j<n;j++) {
			if(obstacleGrid[0][j]==1) {
				paths[0][j] = 0;
			} else {
				paths[0][j] = 1;
			}
		}
		
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				if(obstacleGrid[i][j]!=1) {
					paths[i][j] = paths[i-1][j]+paths[i][j-1];
				}
			}
		}
		
		return paths[m-1][n-1];
	}
}
