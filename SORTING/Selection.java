import java.util.*;
public class Selection{
     public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the the elemets");
        n=sc.nextInt();
        int [] num=new int[n];
        for (int i=0;i<n;i++){            
            num[i]=sc.nextInt();
            
        }
        for(int i=0;i<num.length-1;i++){
            int min=i;
            for(int j=i+1;j<num.length;j++){
                if(num[j]<num[min]){
                    min=j;
                }
            }
            // Swap the found minimum element with the first element
            int temp=num[i];
            num[i]=num[min];
            num[min]=temp;
        }
        // Print the sorted array
        System.out.println("Sorted array:");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
     }
}