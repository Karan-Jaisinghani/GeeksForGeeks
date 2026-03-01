class Solution {
    public int activitySelection(int[] start, int[] finish) {
        int count =1;
        int add=0;
        quickSort(finish , 0, finish.length-1 , start);
        
        for(int i =1;i<start.length;i++){
            if(start[i]>finish[add]){
                count++;
                add=i;
            }
        }
        return count;
        
    }
    void quickSort(int[] arr, int low, int high , int [] arr2) {
        if (low < high) {
            
            int pi = partition(arr, low, high , arr2);

           
            quickSort(arr, low, pi - 1, arr2);
            quickSort(arr, pi + 1, high , arr2);
        }
    }

    
    int partition(int[] arr, int low, int high , int [] arr2) {
        int pivot = arr[high];
        
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            
            if (arr[j] <= pivot) {
                i++;

              
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                int temp1 = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp1;
            }
        }

        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        int temp1 = arr2[i + 1];
        arr2[i + 1] = arr2[high];
        arr2[high] = temp1;
        

        return i + 1;
    }
}