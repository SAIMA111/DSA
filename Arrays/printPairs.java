public class printPairs {
    public static void pairs(int marks[]) {
        for (int i = 0; i <= marks.length - 1; i++) {
            for (int j = i + 1; j <= marks.length - 1; j++) {
                System.out.print(marks[i] + " ," + marks[j] + " " + ";");
            }
            System.out.println(" ");

        }

    }

    public static void main(String[] args) {
        int marks[] = { 1, 2, 453, 45, 67, 99, 6 };
        pairs(marks);
    }
}
