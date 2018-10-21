import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter amount of students:");
        int n = checkVariable(1);
        StudentArray array = new StudentArray();
        array.createArray(n);
        array.writeArrayAuto();
        array.readArray();

        array.sortHoar(0, array.iDNumber.length - 1);
        System.out.println("Sorted Array:");
        array.readArray();
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