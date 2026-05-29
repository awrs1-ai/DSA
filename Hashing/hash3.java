import java.util.*;
public class hash3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter size of the elements n");
        n=sc.nextInt();
        int [] num=new int[n];
        for (int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
          for(int i=0;i<n;i++){
                map.put(num[i],map.getOrDefault(num[i],0)+1);
          }
            int size=map.size();
            Integer [] keys=new Integer[size];
            map.keySet().toArray(keys);
          
            for(int i=0;i<keys.length;i++){
                System.out.println(keys [i] + " --->" + map.get(keys[i]));
            }
          
    }
}