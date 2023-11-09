class predictcolumn
{
    int columnWithMaxZeros(int arr[][], int N) {
        int nthColumn=-1;
        int count=0;
        int temp=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(arr[j][i]==0){
                    count++;
                }
            }
            if(temp<count){
                temp=count;
                nthColumn=i;
            }
            count=0;
        }
        return nthColumn;
    }
}