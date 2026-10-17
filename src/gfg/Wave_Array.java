package gfg;

public class Wave_Array {
    public void sortInWave(int []arr) {
        // code here
        for(int i=1;i<arr.length;i+=2){
            if(arr[i]>arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
            if (i + 1 < arr.length && arr[i] > arr[i + 1]) {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

    }
}
