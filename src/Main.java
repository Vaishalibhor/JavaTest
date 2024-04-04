#1.
import java.util.Arrays;

 class JavaTest {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }
        int i = n;
        int j = 0;
        k = 0;
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[k++] = X[i++];
            } else {
                X[k++] = Y[j++];
            }
        }

        while (j < n) {
            X[k++] = Y[j++];
        }
        Arrays.sort(X);
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        mergeArrays(X, Y);
        System.out.println("Merged array: " + Arrays.toString(X));
    }
}
#2.
 import java.util.Arrays;

    class MaximumSumPath {
    public static int maxSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int sumX = 0, sumY = 0, result = 0;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i++];
            }
            else if (X[i] > Y[j]) {
                sumY += Y[j++];
            }
            else {
                result += Math.max(sumX, sumY);
                result += X[i]; // Add common element
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }
        while (i < m) {
            sumX += X[i++];
        }
        while (j < n) {
            sumY += Y[j++];
        }
        result += Math.max(sumX, sumY);

        return result;
    }
    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};
        System.out.println("Maximum sum path: " + maxSumPath(X, Y));
    }
}
#3.
 import java.util.HashMap;

 class WordCount {
    public static void main(String[] args) {
        java.lang.String str = "Hello world, this is a sample string.";
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}

#4.
 import java.util.HashMap;

 class DuplicateCharacters {
    public static void main(String[] args) {
        java.lang.String str = "Hello, world!";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (Character.isLetter(ch)) {
                if (charCountMap.containsKey(ch)) {
                    charCountMap.put(ch, charCountMap.get(ch) + 1);
                } else {
                    charCountMap.put(ch, 1);
                }
            }
        }
        System.out.println("Duplicate Characters:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + ": " + charCountMap.get(ch));
            }
        }
    }
}
