public class maxSubSumPrefix {
    public static void main(String[] args) {
        int marks[] = { 1, 2, 3, 4, 5 };
        int[] prefix = new int[marks.length];
        for (int i = 1; i <= marks.length - 1; i++) {
            for (int j = i + 1; j <= marks.length - 1; j++)
                prefix[i] = marks[i] + marks[j];
        }
        for (int i = 0; i < prefix.length; i++) {
            System.out.println(prefix[i]);

        }
    }
}
// for (int i = 0; i <= marks.length - 1; i++) {
// for (int j = i; j <= marks.length - 1; j++) {

// // int sum = 0;
// // for (int k = i; k <= j; k++) {
// // // System.out.print(marks[k] + " ");
// // sum += marks[k];

// // }
// // System.out.print(sum + " ");

// }
// System.out.println(" ");

// }

// }

// public static void main(String[] args) {
// int marks[] = { 1, 2, 453, 45, 67, 99, 6 };
// subarray(marks);
// }
// }
