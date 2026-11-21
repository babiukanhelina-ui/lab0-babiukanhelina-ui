
package ua.university;

import java.util.Arrays;

public class BasicOperators {

    public static double[] sumAndAverage(int a, int b, int c) {
        double sum = (double) a + b + c;
        double average = sum / 3;
        return new double[]{sum, average};
    }

    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static char gradeFromScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException();
        }

        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        if (score >= 50) return 'E';

        return 'F';
    }

    public static String dayOfWeek(int day) {
        String[] days = {
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"
        };

        if (day < 1 || day > 7) {
            throw new IllegalArgumentException();
        }

        return days[day - 1];
    }

    public static int[] countdown(int n) {
        if (n < 0) throw new IllegalArgumentException();

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }

        return result;
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException();

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static int[] reverseArray(int[] arr) {
        if (arr == null) throw new IllegalArgumentException();

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }

        return result;
    }

    public static int sumMatrix(int[][] matrix) {
        if (matrix == null) throw new IllegalArgumentException();

        int sum = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }

        return sum;
    }

    public static boolean isPalindrome(String s) {
        if (s == null) throw new IllegalArgumentException();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }

        int min = arr[0];
        int max = arr[0];

        for (int value : arr) {
            if (value < min) min = value;
            if (value > max) max = value;
        }

        return new int[]{min, max};
    }

    public static int[][] multiplicationTable(int n) {
        if (n < 1) throw new IllegalArgumentException();

        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }

        return result;
    }

    public static int[] evenNumbersUpToN(int n) {
        if (n < 2) return new int[0];

        int[] result = new int[n / 2];

        for (int i = 0; i < result.length; i++) {
            result[i] = (i + 1) * 2;
        }

        return result;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int countVowels(String s) {
        if (s == null) throw new IllegalArgumentException();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static int[] fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException();

        int[] result = new int[n];

        if (n > 0) result[0] = 0;
        if (n > 1) result[1] = 1;

        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result;
    }

    public static int[][] transpose(int[][] matrix) {
        if (matrix == null) throw new IllegalArgumentException();

        if (matrix.length == 0) return new int[0][0];

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static int[] sortArray(int[] arr) {
        if (arr == null) throw new IllegalArgumentException();

        int[] result = Arrays.copyOf(arr, arr.length);
        Arrays.sort(result);

        return result;
    }
}
