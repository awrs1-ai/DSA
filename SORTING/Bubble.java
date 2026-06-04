import java.util.*;
public class Bubble{
        public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            int n;
            System.out.println("enter the the elemets");
            n=sc.nextInt();
            int [] num=new int[n];
            for (int i=0;i<n;i++){
                num[i]=sc.nextInt();
            }
            for(int i=0;i<num.length-1;i++){
                int swap=0;
                for(int j=0;j<num.length-1-i;j++){
                    if(num[j]>num[j+1]){
                        // Swap num[j] and num[j+1]
                        int temp=num[j];
                        num[j]=num[j+1];
                        num[j+1]=temp;
                        swap=1;
                    }
                    if(swap==0){
                        break;
                    }
                }
            }
            // Print the sorted array
            System.out.println("Sorted array:");
            for(int i=0;i<num.length;i++){
                System.out.print(num[i]+" ");
            }
        }
}
