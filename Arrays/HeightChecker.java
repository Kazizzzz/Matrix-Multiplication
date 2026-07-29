class HeightChecker {
    public int heightChecker(int[]heights) {
  int [] original=heights.clone();
        for(int i=0;i<original.length;i++){
            int current=original[i];
            int j=i-1;
            while(j>=0&& current<original[j]){
                original[j+1]=original[j];
                j--;

            }
            original[j+1]=current;

        }
        int count =0;
       
        for(int i=0;i<heights.length;i++){
            if(heights[i] != original[i]){
                count ++;
            }
        }
        return count;
        
    }
}
