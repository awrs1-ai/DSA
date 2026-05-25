import java.util.*;
class Recursion2{
     public static void rev(int []a,int s,int e){
           if(s>=e){
               System.out.println(Arrays.toString(a));
               return;
           }
           int temp=a[s];
           a[s]=a[e];
           a[e]=temp;
           rev(a,s+1,e-1);
     }
       
     public static void main(String [] args){
         int a[]={1,2,3,4,5};

         rev(a,0,a.length-1); 
         
               
          }
     }
     