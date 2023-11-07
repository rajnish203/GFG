import java.util.ArrayList;

class upperLowerSum
{
    //Function to return sum of upper and lower triangles of a matrix.
     ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {  
        ArrayList<Integer>list=new ArrayList<>();
        int upperSum=0;
        int lowerSum=0;
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j){
                    upperSum+=matrix[i][j];
                }
                
                if(i>=j){
                    lowerSum+=matrix[i][j];
                }
            }
        }
        
        list.add(upperSum);
        list.add(lowerSum);
        
        return list;
    }
}