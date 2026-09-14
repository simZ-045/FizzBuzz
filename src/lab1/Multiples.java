package lab1;

public class Multiples {
    static void main() {
        int count = multiples(1000, 3, 5);
        System.out.println(count);

    }

    static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }

        }
        return count;

    }

    static int multiples() {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }

        }
        return count;

    }


}
