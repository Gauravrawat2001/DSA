// GFG

class Solution
{
    public int[] FindExitPoint(int[][] matrix)
    {
        // code here
        int i = 0, j = 0, dir = 0;
        
        while(i >= 0 && j >= 0 && i < matrix.length && j < matrix[0].length){
            if(matrix[i][j] == 1){
                dir = (dir + 1) % 4;
                matrix[i][j] = 0;
            }
            
            if(dir == 0){
                j++;
            }else if(dir == 1){
                i++;
            }else if(dir == 2){
                j--;
            }else{
                i--;
            }
        }
        
        // exit point
        if(dir == 0){
            j--;
        }else if(dir == 1){
            i--;
        }else if(dir == 2){
            j++;
        }else{
            i++;
        }
        
        return new int[]{i,j};
    }
}
