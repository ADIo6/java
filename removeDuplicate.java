import java.util.*;


public class removeDuplicate {
    public static void main(String[] args) {

        
        try(Scanner sc = new Scanner(System.in)){
            String s;
            
            System.out.println("Enter the String ");
            s = sc.nextLine();
            StringBuilder strb= new StringBuilder(s);

            for(int i=0;i<strb.length();i++)
            {
                for (int j = i+1; j < strb.length(); j++) {
                    if(strb.charAt(i)==strb.charAt(j)){
                            strb.deleteCharAt(j);// deleting s
                    }
                }
                s= strb.toString();

            }
            System.out.println("String new : "+ s);
        }
    }
}
