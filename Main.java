import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
       int count = 0;
       int spaceCount = 0;
       int wordCount = 0; 
       Scanner in = new Scanner(System.in);
        System.out.print("Enter your Fullname: ");
        String name = in.nextLine();
        System.out.print("enter your favorite bible verse or motto: ");
        String str = in.nextLine();
        System.out.println("------------------------------------------------");
        System.out.println("CHARACTER STATISTICS: ");
        TreeMap<Character,Integer> tm = Pross(str);
        System.out.println(tm); 
        //for encryption
         String en = encrypt(name);
         System.out.println("Encrypted Code: " + en);
          
        //Counts each character except space  
        for(int i = 0; i < str.length(); i++) { 
          //It doesn't include the first space as it won't be considered as a word 
            if(str.charAt(i) == ' ' && Character.isLetter(str.charAt(i+1)) && (i > 0)) {  
                wordCount++;  
            }   //for total word count
            if(str.charAt(i) != ' ')  
                count++;  
        }  //To count the last word present in the string, increment wordCount by 1 
        for(int i = 0; i < str.length()+0; i++){
           if(str.charAt(i) != ' ')  
                spaceCount++;  
        }//loop count character including spaces.
        
        wordCount++;
        //Displays the total number of characters present in the given string
        System.out.println("Total number of words: " + wordCount);  
        System.out.println("Characters count: " + spaceCount);//output characters including space
        System.out.println("Characters count without spaces: "+ count);//output character without space 
        System.out.println("------------------------------------------------");
        System.out.println("Submitted by: " + name);
        in.close(); 
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
            return tm;//this is for my string statistics.
             
    }
    
    //encrypting value
public static String encrypt(String key) {
String result = "";
int l = key.length();
char ch;
for(int i = 0; i < l; i++){
ch = key.charAt(i);
ch += 10;
result += ch;
}
return result;
}
}