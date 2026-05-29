import java.util.*;
public class hash4{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter size of the elements n");
        n=sc.nextInt();
        char [] num=new char[n];
        for (int i=0;i<n;i++){
            num[i]=sc.next().charAt(0);
        }
        HashMap<Character,Integer> map=new HashMap<>();
          for(int i=0;i<n;i++){
                map.put(num[i],map.getOrDefault(num[i],0)+1);
          }
            int size=map.size();
            Character [] keys=new Character[size];
            map.keySet().toArray(keys);
          
            for(int i=0;i<keys.length;i++){
                System.out.println(keys [i] + " --->" + map.get(keys[i]));
            }
          
    }
}