public class D {

   
    public static void main(String[] args) {
        
   String str="vishali";
   char a;
   String s2="";
   for(int i=0;i<str.length();i++)
   {
       a=str.charAt(i);
       if(a!=' ')
       {
           s2=s2+a;
           str=str.replace(a, ' ');
       }
   }
        System.out.println("the string is:"+s2);
    }
}
