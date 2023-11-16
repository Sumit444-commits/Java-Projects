public class Tut7 {
    public static void main(String arg[]){

        //sorting
        int arr[] = {5 , 7 , 8 , 7, 4 , 8 , 9 , 1};

        //bubble sort for decending order

    //     for(int i=0;i < arr.length-1 ; i++){
    //         for(int j=0; j<arr.length-1 ; j++){
    //             if(arr[i]>arr[j]){
    //                 int sort = arr[j];
    //                 arr[j]= arr[i];
    //                 arr[i] = sort;
    //             }
    //         }
    //     }


        //bubble sort for assending order

           for(int i=0;i < arr.length ; i++){
            for(int j=0; j<arr.length ; j++){
                if(arr[i]<arr[j]){
                    int sort = arr[j];
                    arr[j]= arr[i];
                    arr[i] = sort;
                }
            }
        }



        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
