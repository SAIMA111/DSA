public class kadane {
    public static void kadaneAlgo(int marks[]) {
        int maximumsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for (int i = 0; i <= marks.length - 1; i++) {
            currentsum += marks[i];
            if (maximumsum < currentsum) {
                maximumsum = currentsum;
            }
            System.out.println("sum at each step:" + maximumsum);

        }
        System.out.println("----------------------------------------------");
        System.out.println("-----------THE REAL MAX SUM------:" + maximumsum);

    }

    public static void main(String[] args) {
        int marks[] = { 1, 2, 3, 4, 5, 6 };
        kadaneAlgo(marks);
    }
}
