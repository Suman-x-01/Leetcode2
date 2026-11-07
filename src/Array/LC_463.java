package Array;

public class LC_463 {

        public int islandPerimeter(int[][] grid) {
            int parameter=0;

            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[i].length;j++){
                    if(grid[i][j]==1){
                        parameter+=4;


                        if(i>0 && grid[i-1][j]==1){
                            parameter-=2;
                        }
                        if(j>0 && grid[i][j-1]==1){
                            parameter-=2;
                        }
                    }
                }
            }
            return parameter;
        }

}
