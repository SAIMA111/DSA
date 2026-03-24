public class reverseArray {
    public static void reverse(int[] marks) {
        int start = 0;
        int end = marks.length - 1;
        while (start <= end) {
            int temp = marks[start];
            marks[start] = marks[end];
            marks[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 1, 2, 453, 45, 67, 99, 6 };
        reverse(marks);
        for (int i = 0; i <= marks.length - 1; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
