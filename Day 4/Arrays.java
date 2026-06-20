public class Arrays {
    public static void main(String[] args) {
        
        //in order to put multiple values in a variablle we use the concept arrays
        //array is a very big bucket which has many slots to put multiple value

        int arr[]= new int[5]; //this num in bracket tells the number of slots in the bucket i.e 5 slots

        //"[]" we need to add this bracket in order to tell jvm that it is an array 
        //slot1, slot2, slot3, slot4, slot5.
        //counting starts from 0.
        //0, 1, 2, 3, 4 ==index of the array

        arr[1]=4;
        arr[0]=3;
        arr[2]=5;
        arr[3]=20;


        //the minimum index of the array will be 0
        //the maximum index of the array will be length of array -1

    
        System.out.println(arr[1]);
        System.out.println(arr[4]);
        int arr1[]= new int[]{1,2,3,4};
        System.out.println(arr1[2]);

        String arr2[]= new String[4];

        //integer arrays are initialized with 0
        //string arrays are initialized with null

        arr2[0]="Hello";
        arr2[1]="Banti";
        System.out.println(arr2[2]);








    
        
    }
    
}
