import java.util.ArrayList;

class minDistanceBt2number {
    int minDist(int a[], int n, int x, int y) {
        // code here
        boolean isX=false;
        boolean isY=false;
        ArrayList<Integer>xIndex=new ArrayList<>();
        ArrayList<Integer>yIndex=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]==x){
                xIndex.add(i);
                isX=true;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==y){
                yIndex.add(i);
                isY=true;
            }
        }
        int minDistance =Integer.MAX_VALUE;
        if(isX && isY){
            for(int i=0;i<xIndex.size();i++){
                for(int j=0;j<yIndex.size();j++){
                    int temp=Math.abs(yIndex.get(j)-xIndex.get(i));
                    minDistance=Math.min(temp, minDistance);
                }
            }
        }else{
            return -1;
        }
        return minDistance;
    }
}