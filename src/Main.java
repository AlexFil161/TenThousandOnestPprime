public class Main {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int count = 0;
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                result++;
            }
            if (result == 10001) {
                System.out.println(i);
                break;
            }
        }
    }
}