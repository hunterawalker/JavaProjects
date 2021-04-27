package gravity;
import java.util.Scanner;
public class Gravity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the time in the air in seconds.");
        int x;
        int time=0;
        int m = 10;
        int speed=0;
        int t = scanner.nextInt();
        for(x=0;x!=t;x++){
            speed += m;
            time += m *t;
        }
        System.out.println("It speeds up to " + speed + "mps");
        System.out.println("It travel " + time +" meters in " + t + " seconds.");
    }
    
}
