/**
Spiral Matrix
link: https://leetcode.com/problems/spiral-matrix/
 */
import java.util.*;
class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix==null){
            return null;
        }
        
        List<Integer> result= new ArrayList<Integer>();
        
        int top=0,left=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        int dir=0;
        
        while(top<=bottom && right>=left){
            
            //left to right
            if(dir==0){
                for(int i=left;i<=right;i++){
                    result.add(matrix[top][i]);
                
                }
                top++;
            }
            
            //top to bottom
            if(dir==1){
                
                for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                
                }
                right--;
            }
            
            //right to left
            if(dir==2){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                
                }
                bottom--;
            }
            
            //bottom to top
            if(dir==3){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                
                }
                left++;
            }
            dir++;
            dir=dir%4;
        }
        return result;
    }

    public static void main(String args[]){
        
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(SpiralMatrix.spiralOrder(matrix));
    }
}