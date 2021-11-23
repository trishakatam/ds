//INSERTION SORT
public class Main{
    public static void main(String[] args){
        //declaring array
        int[] arr = new int[] {89, 54, 49, 20, 8};
        int n = arr.length;
        int key,i,j;
        //traversing the array
        for (i=0;i<n;i++){
            key = arr[i];
            j = i-1;
            //replacing the elements greater than key value 
            while (j>=0  && key<arr[j]){
                arr[j+1] = arr[j];
                j-=1;
            arr[j+1] = key;
            }
        }
        //printing the sorted array
        for (i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
