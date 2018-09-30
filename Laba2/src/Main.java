import	java.lang.*;
import	java.util.Scanner;

public	class	Main	{
    public	static	void	main(String[]	args) {
        double r;
        Circle	k1	=	new	Circle(3.1, 4.1, 5.1, "red");
        System.out.println("Длина	окружности	=	"	+	k1.getLength()	+	"см\n");
        System.out.println("Введите	радиус	");
        Scanner	source	=	new	Scanner(System.in);
        r	=	source.nextDouble();
        k1.setR(r);
        System.out.println("\nДлина	окружности	=	"	+	k1.getLength()	+	"см");
    }
}
