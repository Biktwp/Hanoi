/**
 * Created by tau on 6/03/17.
 */
import java.util.Stack;
public class Hanoi {
    private int disk;
    private Stack<Integer> stick1, stick2, stick3;
    private int moves;

    public Hanoi(int disk) {
        this.disk = disk;
        this.stick1 = new Stack<>();
        this.stick2 = new Stack<>();
        this.stick3 = new Stack<>();
        this.moves = 0;

    }

}