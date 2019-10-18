package test;

public class Q200_Number_of_Islands {
	public int numIslands(char[][] grid) {
		int count = 0;
		int[] location=findIsland(grid);
		while(location!=null) {	
			isIsland(grid,location[0],location[1]);
			location = findIsland(grid);
            count++;
		}
		return count;
    }
	
//	优化：只用一个loop
//	public int numIslands(char[][] grid) {
//        int count = 0;
//         for(int i =0;i< grid.length;i++) {
//             for(int j =0;j < grid[i].length;j++) {
//                 if(grid[i][j] == '1')
//                 {
//                     coverIsland(grid, i,j);
//                     count++;
//                 }
//             }
//         }
//        return count;
//    }
	
	
	private int[] findIsland(char[][] grid){
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j]=='1')
					return new int[] {i,j}; 
			}
		}
		return null;
	}
	
	private void isIsland(char[][] grid, int i, int j) {
		grid[i][j]='0';
		
		if(i+1<grid.length && grid[i+1][j]=='1') {
			isIsland(grid,i+1,j);
		}
		if(j+1<grid[0].length && grid[i][j+1]=='1') {
			isIsland(grid,i,j+1);
		}
		if(i>0 && grid[i-1][j]=='1') {
			isIsland(grid,i-1,j);
		}
		if(j>0 && grid[i][j-1]=='1') {
			isIsland(grid,i,j-1);
		}
	}
}
