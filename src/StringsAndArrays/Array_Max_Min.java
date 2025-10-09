package StringsAndArrays;

public class Array_Max_Min {
    public static void main(String[] args) {
        int arr[]={10,20,90,89,2,34,4,5};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }



        }
        System.out.println(max);
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }



        }
        System.out.println(min);


    }


}
