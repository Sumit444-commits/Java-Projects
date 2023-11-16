import java.util.*;

public class Tut{
public static void array(int[] arr){
    for(int i=0; i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
}
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

    int arr[] = {7,8,3,1,2};
    //Bubble Sort
    for(int i=0;i<arr.length-1;i++){

        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

    int arr1[] = {7,8,3,1,2};
    // Selection sort
    for(int i=0;i<arr1.length-1;i++){
        int smallest = i;
        for(int j=i+1;j<arr1.length;j++){
            if(arr1[smallest]>arr1[j]){
                smallest = j;
            }
        }
        int temp = arr1[smallest];
        arr1[smallest]= arr1[i];
        arr1[i]= temp;
    }
    array(arr);
System.out.println();
    array(arr1);
    int arr2[] = {7,8,3,1,2};
    //Insertion sort
    for(int i=1;i<arr2.length;i++){
        int container = arr2[i];
        int j= i-1;
        while(j>=0 && container < arr2[j]){
            arr2[j+1] = arr2[j];
            j--;
        }
        arr2[j+1] = container;
    }
    System.out.println();
    array(arr2);
}



}