import java.lang.*;
        import java.util.*;

public class Main {
    public static void main(String[] args) {
        String a, b, end;
        char c = 'U';
        int changer = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        a = in.nextLine();
        System.out.println("Введите адрес: ");
        b = in.nextLine();
        System.out.println("Введите пол(1. Муж. 2. Жен. 3. Нет инф.): ");
        while((changer > 3) || (changer < 1))
        {
            changer = in.nextInt();
            if (changer == 1) c = 'M';
            else if (changer == 2) c = 'F';
            else if (changer == 3) c = 'U';
        }
        Author Man = new Author(a, b, c);
        end = Man.toString();
        System.out.println(end);
    }
}
