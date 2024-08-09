import java.util.*;
import java.lang.Math;

public class NumtoWords {
    private static final String [] belowTwenty={" ", "one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    private static final String [] tens={"","", "twenty", "thirty","forty","fifty","sixty","seventy","eighty","ninety" };
    private static final String [] thousand={"","thousand"};
    
    public static String numtowords(int num){
        if(num==0){
            return "Zero";

        }

        return convert(num);
    }

    private static String convert(int num){
        if(num<20)
        {
            return belowTwenty[num];

        }
        else if(num<100)
        {
            return tens[num/10]+((num%10!=0)?" " + belowTwenty[num%10]:"");
        }
        else if(num<1000){
            return belowTwenty[num/100]+ " hundred"+((num%100!=0)?" "+convert(num%100):" ");


        }
        else{
            for (int i = 0; i < thousand.length; i++) {
                int unit = (int) Math.pow(1000, i+1);
                if(num<unit)
                {
                    return convert(num / (unit / 1000)) + " " + thousand[i] + ((num % (unit / 1000) != 0) ? " " + convert(num % (unit / 1000)) : "");
                
                }
                
            }
        }
        return "";
    }
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num= sc.nextInt();
        System.out.println("result: "+numtowords(num));

    }
}
