package lab1;

public class Reduce {
    static void main() {
        int count = reduce(100);
        System.out.println(count);
    }

    private static int reduce(int i) {
        int count = 0;
        while (i > 0) {
            if (i % 2 == 0) {
                i /= 2;
            }
            else {
                i--;
            }
            count++;
        }
        return count;
    }

}
