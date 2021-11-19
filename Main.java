import java.util.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Fullname: ");
        String name = in.nextLine();
        System.out.println("enter your favorite bible verse or motto: ");
        String str = in.nextLine();
       
        TreeMap<Character,Integer> tm = Pross(str);
        System.out.println(tm);
       
        
    }       
    public static TreeMap<Character,Integer> Pross(String str)
    {
            char[] charArray = str.toCharArray();
 
            TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
 
            for (int x = 0; x < charArray.length ;x++ )
            {
                if(!tm.containsKey(charArray[x]))
                {
                    tm.put(charArray[x],1);
                }
                else
                {
                    int count = tm.get(charArray[x])+1;
                    tm.put(charArray[x],count);
                }
            }
            return tm;

    }
}