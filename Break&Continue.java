public class brkandcont {
    public static void main(String[] args) {
        // Break and continue

        // 1. Java Break Statement

        for (int i = 0; i < 10; i++) {
        if (i == 7) {
        break;
        }
        System.out.println(i);
        }

        // 2. Continue Statement
        for (int i = 0; i < 10; i++) {
        if (i == 7) {
        continue;
        }
        System.out.println(i);
        }

        // Break in while loop
        int i = 0;
        while (i < 10) {
        System.out.println(i);
        i++;
        if (i == 7) {
        break;
        }
        }

        // Continue in while loop
        int i = 0;
        while (i < 10) {
        if (i == 7) {
        i++;
        continue;
        }
        System.out.println(i);
        i++;
        }

    }
}
