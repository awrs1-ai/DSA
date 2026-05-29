import java.util.*;
class hash{
    public static void main(String [] args){
        Scanner  sc=new Scanner(System.in);

        int n;
        System.out.println("enter size of the elements n");
        n=sc.nextInt();
        
        int [] arr=new int[n];
        System.out.println("enter size of the elements n");
        for(int i=0;i<n;i++){
        
        arr[i]=sc.nextInt();
        }

        int [] freq=new int[6];
         for (int i=0;i<n;i++){
            freq[arr[i]]++;
         }
         int q;
         q=sc.nextInt();
         while(q--!=0){
            int num;
            num=sc.nextInt();
            System.out.println(num + " -------->" + freq[num]);
         }
    
}
}