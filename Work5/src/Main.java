import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int n;
        System.out.print("n: ");
        n = checkVariable(1);
        Tasks.Task1(n);
        System.out.println();

        System.out.print("n: ");
        n = checkVariable(1);
        Tasks.Task2(n);
        System.out.println();

        int A;
        System.out.print("A: ");
        A = checkVariable(1);
        System.out.println();

        int B;
        System.out.print("B: ");
        B = checkVariable(1);
        System.out.println();

        Tasks.Task3(A, B);
    }

    static int checkVariable(int min) {
        int n = 0;
        do {
            while(!input.hasNextInt()) {
                System.out.println("ERROR! INVALID INPUT!");
                input.nextLine();
            }
            n = input.nextInt();
            if(n < min)
                System.out.println("ERROR! INVALID INPUT!");
        } while (n < min);
        return n;
    }
}

