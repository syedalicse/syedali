public class D {

   
    public static void main(String[] args) {
        
   String s="ishasli";
   char a;
   String s2="";
   for(int i=0;i<s.length();i++)
   {
       a=str.charAt(i);
       if(a!=' ')
       {
           s2=s2+a;
           s=s.replace(a, ' ');
       }
   }
        System.out.println("the string is:"+s2);
    }
}
