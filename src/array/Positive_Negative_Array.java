package array;

public class Positive_Negative_Array {
    public static void main(String[] args) {
        int a[] = {3, 6, 5, -7, 0};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positive++;
            } else if (a[i] < 0) {
                negative++;
            } else if (a[i] == 0) {
                zero++;
            }
        }
        System.out.println("positive " + positive + " negative " + negative + " zero " + zero);
    }
    }

