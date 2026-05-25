class Recursion3{
      public static void rev(int i, String rev,String str){
         if(i<0){
            if(str.equals(rev)){
            System.out.println("palindrome");
         }else{
            System.out.println("not palindrome");
         }
            return;
         }
         rev=rev+str.charAt(i);
         rev(i-1,rev,str);
         
      }

        public static void main(String args []){

        String str="moon";
        String rev="";

        rev(str.length()-1,rev,str);
}   
}