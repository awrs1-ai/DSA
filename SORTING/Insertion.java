import java.util.*;
class Insertion{
    public static void main(String[] args) {
    
    
        System.out.println("Enter the numbers:");
          char [] arr={'a','c','d','b'};
          
          for (int i=1;i<arr.length;i++){
            char key=arr[i];
            int j=i-1;
              while(j>=0 && arr[j]>key){
                 arr[j+1]=arr[j];
                 j--;
              }
              arr[j+1]=key;
    }
    System.out.println(Arrays.toString(arr));
    }
}