// import java.util.*;

import java.util.Scanner;

class Game{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,choose_range;
        
        System.out.println("Enter the range you want to guess in \n press 1 for (0-10) \n press 2 for (0-100)");
        choose_range=sc.nextInt();
        switch (choose_range) {
            case 1:
            int random=(int)(Math.random()*10);
            System.out.println("You have choosen range 0-10");
            do {
                System.out.println("Guess the number");
                num= sc.nextInt();
                if (num==random) {
                    System.out.println("You won");
                    break;
                }
                else if (num>random) {
                    System.out.println("Try to guess a smaller number");
                    
                } 
                else if(num<random) {
                    System.out.println("Try to guess a larger number");
                }
            
            } while (num>=0);
            System.out.println("Gave Over");
             
            break;
            case 2:
            random=(int)(Math.random()*100);
            System.out.println("You have choosen range 0-100");
            do {
                System.out.println("Guess the number");
                num= sc.nextInt();
                if (num==random) {
                    System.out.println("You won");
                    break;
                }
                else if (num>random) {
                    System.out.println("Try to guess a smaller number");
                    
                } 
                else if(num<random) {
                    System.out.println("Try to guess a larger number");
                }
                
            } while (num>=0);
            System.out.println("Gave Over");
            default:
            
                
            
            break;
        }
    }
       
}