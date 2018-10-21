import java.util.Random;

class StudentArray {
    public Student iDNumber[];
    public void createArray(int n) {
        iDNumber = new Student[n];
        for(int i = 0; i < n; i++)
            iDNumber[i] = new Student();
    }
    void sortHoar(int first /*индекс начала массива*/, int last /*индекс конца массива*/)
    {
        if (first >= last) //Если начало больше конца (для рекурсивных вызовов)
        {
            return;
        }
        int mid = first + (last - first) / 2; //середина рассматриваемого массива (от first до last)

        //меняем средний элемент с первым, чтобы при пробегании по массиву средний опорный элемент не был затронут
        iDNumber[mid] = swap(iDNumber[first], iDNumber[first] = iDNumber[mid]);

        int i = first + 1;
        int j = last;
        while (i <= j) //пока индексы от начала и конца не пересеклись
        {
            while (i <= j && iDNumber[i].getID() <= iDNumber[first].getID()) //поиск элемента больше первого (среднего) от начала
                i++;
            while (i <= j && iDNumber[j].getID() > iDNumber[first].getID()) //поиск элемента меньше или равному первому (среднему) от конца
                j--;
            if (i < j) {
                //меняем 2 найденных элемента
                iDNumber[i] = swap(iDNumber[j], iDNumber[j] = iDNumber[i]);
            }
        }
        //меняем идущий перед найденным элементом элемент с первым (средним)
        iDNumber[i - 1] = swap(iDNumber[first], iDNumber[first] = iDNumber[i - 1]);
        int part = i - 1;
        sortHoar(first, part - 1); //рекурсивный вызов с обработкой части массива от начала и конца в зависимости от места остановки цикла
        sortHoar(part + 1, last);
    }

    private Student swap(Student a, Student b) {
        return a;
    }
    public void writeArray() {
        for(int i = 0; i < iDNumber.length; i++) {
            iDNumber[i].setName(Main.input.nextLine());
            iDNumber[i].setID(Main.checkVariable(1));
        }
    }
    public void writeArrayAuto() {
        for(int i = 0; i < iDNumber.length; i++) {
            Random random = new Random();
            iDNumber[i].setName(makeRandomString());
            iDNumber[i].setID(Math.abs(random.nextInt()));
        }
    }
    public void readArray() {
        for(int i = 0; i < iDNumber.length; i++) {
            System.out.println(iDNumber[i]);
            System.out.println();
        }
    }
    private String makeRandomString() {
        Random random = new Random();
        String temp = "";
        int n = Math.abs(random.nextInt()) % 10 + 1;
        for(int i = 0; i < n; i++)
            temp += (char)(Math.abs(random.nextInt()) % 26 + 97);
        return temp;
    }
}