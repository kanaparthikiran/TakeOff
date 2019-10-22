// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPathBFS {        
    int minimumDistance(int numRows, int numColumns, List<List<Integer>> area) {
    int[][] areaMatrix = covertListToMatrix(area);
    return findShortestPathBFS(areaMatrix,0,0);
}

    /**
     * 
     * @param area
     * @return
     */
	private int[][] covertListToMatrix(List<List<Integer>> area) {
		if(area==null || area.size()==0) {
			return new int[][]{{}};
		}
		int[][] areaMatrix = new int[area.size()][area.get(0).size()];
		for(int i=0;i<area.size();i++) {
			for(int j=0;j<area.get(i).size();j++) {
				areaMatrix[i][j] = area.get(i).get(j);
			}
		}
		return areaMatrix;
	}

	
	boolean higherVersion(String ver1, String ver2) {
	    if(ver1==null || ver2==null || ver1.trim().length()==0 || ver2.trim().length()==0) {
	        return false;
	    }
	    return Integer.parseInt(ver1.replaceAll(".",""))>Integer.parseInt((ver2.replaceAll(".","")));
	}

    
	/**
	 * 
	 * @param arr
	 * @param startX
	 * @param startY
	 * @return
	 */
	private static int findShortestPathBFS(int arr[][], int startX, int startY) {
			if(arr[startX][startY]==9) return 0;
			int moveX[]=new int[]{0,0,1,-1};
			int moveY[]=new int[]{1,-1,0,0};
			boolean visited[][]=new boolean[arr.length][arr[0].length];
			Queue<QNode> qNodes = new LinkedList<>();
			qNodes.add(new QNode(startX,startY,0));
			while(!qNodes.isEmpty())
			{
				QNode currNode=qNodes.remove();
				int currX=currNode.x;
				int currY=currNode.y;
				int currDistance = currNode.distance;
				visited[currX][currY]=true;
				//System.out.println(arr[currX][currY]);
				if(arr[currX][currY]==9) return currDistance;
				
				for (int i = 0; i < moveX.length; i++) 
				{
					int newX=currX+moveX[i];
					int newY=currY+moveY[i];
					
					if(newX>=0&&newX<arr.length&&newY>=0 && 
					newY<arr[0].length&&!visited[newX][newY]&&arr[newX][newY]!=0)
					{
						qNodes.add(new QNode(newX,newY,currDistance+1));
					}
				}
			
			}
			return -1;
		}
	}
class QNode {
		int x;
		int y;
		int distance;
		QNode(int x,int y, int distance) {
			this.x=x;
			this.y=y;
			this.distance=distance;
		}
}