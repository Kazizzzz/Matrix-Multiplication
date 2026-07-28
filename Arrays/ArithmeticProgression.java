class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int diff=arr[1]-arr[0];
        boolean ap=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=diff){
                ap=false;
                break;
            }
        }
        if(ap){
            return true;
            
        }
        else{
                return false;
            }

        
    }
}