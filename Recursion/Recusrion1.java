import java.util.*;
class Recusrion1{
    public static void sum(int fact,int i,int n){
        if(i>n){
            System.out.println(fact);
            return;
        }
        fact=fact*i;6
    

         sum(fact,i+1,n);
        

    }



    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();
         sum(1,1,n);        
            }
}