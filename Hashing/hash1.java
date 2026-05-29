import java.util.*;
class hash1{
    public static void main(String [] args){
        Scanner  sc=new Scanner(System.in);

        String s;
        System.out.println("enter size of the elements n");
        s=sc.next();
    
        int [] freq=new int[26];
         for (int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
         }
         int q;
         q=sc.nextInt();
         while(q--!=0){
            char c;
            c=sc.next().charAt(0);
            System.out.println(c + " -------->" + freq[c-'a']);
         }
    
}
}