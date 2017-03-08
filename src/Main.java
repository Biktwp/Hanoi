import java.util.Scanner;
/**
 * Created by Victor Gonzalez on 6/03/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks");
        int disk = sc.nextInt();
        Hanoi hanoi= new Hanoi(disk);
        hanoi.printTowers();
        hanoi.sol(disk,hanoi.getStick1(),hanoi.getStick2(),hanoi.getStick3());

        
        System.out.println("The number of pieces was: " + n + "\n" +
                        "The minimum number of movements with that number of pieces is: " + (int)(Math.pow(2, n)-1));

    }
}

