public class largestinArray {
    public static int largestNo(int[] marks) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }

        return max; // ✅ this should be outside the loop and method block ends properly
    }

    public static void main(String[] args) {
        int marks[] = { 1, 2, 453, 45, 67, 99 };
        int result = largestNo(marks);
        System.out.println(result);
    }
}
