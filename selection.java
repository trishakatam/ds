//SELECTION SORT:
public class Main{
    public static void main(String[] args){
        //declaring array
        int[] arr = new int[]{1,4,3,20,8}; 
        int temp,i,j,min_index;
        //finding minimun element in the array
        for (i=0;i<5;i++){
            min_index = i;
            for(j=i+1;j<5;j++){
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            //swapping two elements
            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        //printing the sorted array
        for (i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
