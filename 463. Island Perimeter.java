class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans=0;
        int x=grid.length;
        int y=grid[0].length;
        for( int r=0;r<x;r++){
            for(int c=0;c<y;c++){
                if(grid[r][c]==1){
                    ans += 4;
                    if(r>0 && grid[r-1][c]==1){
                        ans -=2;
                    }
                     if(c>0 && grid[r][c-1]==1){
                        ans -=2;
                     }
                }
            }
        }
            return ans;
        }
    }
