package Sorting;

public class Sort1 {
    public static void foo(int n, int[] elements) {
        if (n == 0)
            return;

        int temp = 0;
        for (int j = 0; j < (n - 1); j++) {
            if (elements[j + 1] > elements[j]) {
                temp = elements[j + 1];
                elements[j + 1] = elements[j];
                elements[j] = temp;
            }
        }
        foo(n-1, elements);
    }
}
