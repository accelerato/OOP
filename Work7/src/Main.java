import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> arDeq1 = new ArrayDeque<>();
        ArrayDeque<Integer> arDeq2 = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            arDeq1.add(scan.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            arDeq2.add(scan.nextInt());
        }
        playGame(arDeq1, arDeq2);
    }

    static void playGame(ArrayDeque<Integer> arDeq1, ArrayDeque<Integer> arDeq2) {
        int turn = 0;
        while (!(arDeq1.isEmpty() || arDeq2.isEmpty()))
        {
            if (turn >= 106)
                break;
            if (arDeq1.peek() == 0 && arDeq2.peek() == 9) {
                arDeq1.add(arDeq1.pop());
                arDeq1.add(arDeq2.pop());
            }
            else if (arDeq1.peek() == 9 && arDeq2.peek() == 0) {
                arDeq2.add(arDeq1.pop());
                arDeq2.add(arDeq2.pop());
            }
            else if (arDeq1.peek() < arDeq2.peek()) {
                arDeq2.add(arDeq1.pop());
                arDeq2.add(arDeq2.pop());
            }
            else if (arDeq1.peek() > arDeq2.peek()) {
                arDeq1.add(arDeq1.pop());
                arDeq1.add(arDeq2.pop());
            }
            turn++;
            System.out.println("Ход №" + turn + "\nДек 1: " + arDeq1 + "\nДек 2:" + arDeq2);
        }
        if (arDeq1.isEmpty())
            System.out.println("Игрок 2 победил");
        else
        if (arDeq2.isEmpty())
            System.out.println("Игрок 1 победил");
        else
            System.out.println("Upss");
    }
}
