public class maxSubSumPrefix {
    public static void main(String[] args) {
        int marks[] = {1, 2, 3, 4, 5};

        int prefix[] = new int[marks.length];

        prefix[0] = marks[0];
        for(int i = 1; i < marks.length; i++) {
            prefix[i] = prefix[i - 1] + marks[i];
        }

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < marks.length; i++) {
            for(int j = i; j < marks.length; j++) {

                int currSum;
                if(i == 0) {
                    currSum = prefix[j];
                } else {
                    currSum = prefix[j] - prefix[i - 1];
                }

                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("Max Subarray Sum = " + maxSum);
    }
}
