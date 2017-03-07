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
    }
}
