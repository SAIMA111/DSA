public class printSubArrays {
    public static void subarray(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            for (int j = i; j < marks.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(marks[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int marks[] = {1, 2, 453, 45, 67, 99, 6};
        subarray(marks);
    }
}
