/**
 * Created by Victor Gonzalez on 6/03/17.
 */
import java.util.Stack;
public class Hanoi {
    private int disk;
    private Stack<Integer> stick1, stick2, stick3;
    private int moves;

    public Hanoi(int disk) {
        this.stick1 = new Stack<>();
        this.stick2 = new Stack<>();
        this.stick3 = new Stack<>();
        this.moves = 0;
        for (int i = disk; i > 0; i--){//here I push all the disk from highest to lowest in the first tower,
            stick1.push(i);
        }

        setDisk(disk);



    }
    public void printTowers() {//This method prints the steps of the solution
        System.out.println("Step " + moves);
        System.out.println("Tower1: " + stick1);
        System.out.println("Tower2: " + stick2);
        System.out.println("Tower3: " + stick3);
        moves++;

    }


    public void sol(int disk,Stack stick1,Stack stick2, Stack stick3){//This method is the recursive function that moves the disk.
        if (disk > 0){
            sol(disk-1, stick1, stick3, stick2);
            stick3.push(stick1.pop());//this push the top of the stick 1 and pop the top of the stick 1.
            printTowers();
            sol(disk-1, stick2, stick1, stick3);
        }
    }


    public int getDisk() {
        return disk;
    }

    public Stack<Integer> getStick1() {
        return stick1;
    }


    public void setDisk(int disk) {
        this.disk = disk;

    }

    public Stack<Integer> getStick2() {
        return stick2;
    }


    public Stack<Integer> getStick3() {
        return stick3;
    }

}