/**
 * Created by tau on 6/03/17.
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
        for (int i = disk; i > 0; i--){
            stick1.push(i);
        }

        setDisk((int)Math.pow(2,disk));



    }
    public void printTowers() {
        System.out.println("Step " + moves);
        System.out.println("Tower1: " + stick1);
        System.out.println("Tower2: " + stick2);
        System.out.println("Tower3: " + stick3);
        moves++;

    }


    public void doHanoi(int disk, Stack stick1 , Stack stick2, Stack stick3) {

        if (disk == 1) {
            sol(disk);

        }
        else {
            doHanoi(disk - 1, stick1, stick2, stick3);
            System.out.println("Disk " + disk + " from " + stick1 + " to " + stick3);
            doHanoi(disk - 1, stick1, stick2, stick3);
        }
    }
    public static void main(String[] args) {
        Hanoi hanoi= new Hanoi(3);
        //hanoi.doHanoi(hanoi.getDisk(),hanoi.getStick1(),hanoi.getStick2(),hanoi.getStick3());
        hanoi.printTowers();
        hanoi.sol(hanoi.getDisk());

    }

    public void sol(int disk){
        if (disk == 1){
            printTowers();
        }
        else{
            sol(disk-1);
            if (stick3.empty() && stick1.size()!=1 || stick3.peek() > stick1.peek() ) {
                stick3.push(stick1.peek());
                stick1.pop();
            }
            else if(stick2.empty() || stick1.peek() < stick2.peek()){
                stick2.push(stick1.peek());
                stick1.pop();
            }
            else if (stick2.peek() > stick3.peek()){
                stick2.push(stick3.peek());
                    stick3.pop();
            }
            else if (stick1.empty() || stick2.peek() < stick1.peek()){
                stick1.push(stick2.peek());
                stick2.pop();
            }
        }
        printTowers();
    }


    public int getDisk() {
        return disk;
    }

    public Stack<Integer> getStick1() {
        return stick1;
    }

    public void setStick1(Stack<Integer> stick1) {
        this.stick1 = stick1;
    }

    public void setDisk(int disk) {
        this.disk = disk;

    }

    public Stack<Integer> getStick2() {
        return stick2;
    }

    public void setStick2(Stack<Integer> stick2) {
        this.stick2 = stick2;
    }

    public Stack<Integer> getStick3() {
        return stick3;
    }

    public void setStick3(Stack<Integer> stick3) {
        this.stick3 = stick3;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }
}