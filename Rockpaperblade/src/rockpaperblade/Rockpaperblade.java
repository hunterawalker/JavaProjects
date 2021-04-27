package rockpaperblade;

import java.util.Scanner;

public class Rockpaperblade {

    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
       System.out.println("Make your choice: Rock paper or Blade\n");
       System.out.println("Rock = 1\n");
       System.out.println("Paper = 2\n");
       System.out.println("Blade = 3\n");
       double player1 =keyboard.nextInt();
       double cpu = cpu();
       if(player1==cpu){
           System.out.println("It's a tie\n");
       }
        else if(player1==1 && cpu==2){
            System.out.println("You lose. Paper beats Rock\n");   
       }
       else if(player1==2 && cpu==3){
            System.out.println("You lose. Blade beats Paper\n");   
       }
        else if(player1==3 && cpu==1){
            System.out.println("You lose. Rock beats Blade\n");   
       }
       else if(player1==3 && cpu==2){
            System.out.println("You Win. Blade beats Paper\n");   
       }
       else if(player1==2 && cpu==1){
            System.out.println("You Win. Paper beats Rock\n");   
       }
       else if(player1==1 && cpu==3){
            System.out.println("You Win. Rock beats Blade\n");   
       }
    }
    public static double cpu() {
        double z = getRandomIntegerBetweenRange(1.0,3.0);
        return z;
    }
    public static double getRandomIntegerBetweenRange(double min, double max){

    double x = (int)(Math.random()*((max-min)+1))+min;

    return x;
    }
}
