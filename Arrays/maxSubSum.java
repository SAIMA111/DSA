public class maxSubSum {
    public static void subarray(int marks[]) {
        for (int i = 0; i <= marks.length - 1; i++) {
            for (int j = i; j <= marks.length - 1; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    // System.out.print(marks[k] + " ");
                    sum += marks[k];

                }
                System.out.print(sum + " ");

            }
            System.out.println(" ");

        }

    }

    public static void main(String[] args) {
        int marks[] = { 1, 2, 453, 45, 67, 99, 6 };
        subarray(marks);
    }
}
