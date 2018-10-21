class Tasks {
    private static int count = 1;

    public static void Task1(int n) {
        for (int i = 0; i < count; i++) {
            System.out.print(count + " ");
        }
        if (count < n) {
            count++;
            Task1(n);
        }
        else
            count = 1;
    }

    public static void Task2(int n) {
        System.out.print(count + " ");
        if (count < n) {
            count++;
            Task2(n);
        }
        else
            count = 1;
    }

    public static void Task3(int A, int B) {
        System.out.print(A + " ");
        if (A < B)
            Task3(++A, B);
        else if (A > B)
            Task3(--A, B);
    }
}