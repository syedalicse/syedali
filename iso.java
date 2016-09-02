public class Iso {

static boolean isIsomorphic(String s, String t) {

s= s.toLowerCase();
t = t.toLowerCase();
if(s.length()!=t.length()){
    return false;
}
if(s.equalsIgnoreCase(t)){
    return true;
}
    HashMap<Character,Integer> mapOfFirst = new HashMap<Character,Integer>();
    HashMap<Character,Integer> mapOfSec = new HashMap<Character,Integer>();
    int cnt1 =0 ;
    int cnt2 =0 ;
    for(int i =0;i<s.length();i++){

        if(mapOfFirst.get(s.toCharArray()[i])!=null){

        }
        else{
            mapOfFirst.put(s.toCharArray()[i],cnt1);
            cnt1 = cnt1+1;
        }

    }
    for(int i =0;i<t.length();i++){

        if(mapOfSec.get(t.toCharArray()[i])!=null){

        }
        else{
            mapOfSec.put(t.toCharArray()[i],cnt2);
            cnt2 = cnt2+1;
        }

    }

    char[] sCharArray_Fir = s.toCharArray();
    char[] sCharArray_Sec= t.toCharArray();

    for(int i = 0 ; i< s.length();i++){
        int ch1 = mapOfFirst.get(sCharArray_Fir[i]);
        int ch2 = mapOfSec.get(sCharArray_Sec[i]);
        if(ch1!=ch2){
            return false;
        }
    }

    return true;
}   
public static void main(String args[])
{
Isomorphic ism = new Isomorphic();

System.out.println(ism.isIsomorphic("abba", "noon"));
System.out.println(ism.isIsomorphic("abba", "noan"));

}
}
