import java.util.ArrayList;
import java.util.Scanner;

public class Digit {
    public static void main(String args[]) {
        Scanner scanner;
        int numberA, numberB, number, flag, count = 0;
        scanner = new Scanner(System.in);
        while (true) {
            numberA = scanner.nextInt();
            numberB = scanner.nextInt();
            ArrayList<Integer> temp = new ArrayList<>(0);
            for (int i = numberA; i <= numberB; i++) {
                number = i;
                flag = 0;
                while (number != 0) {
                    temp.add(number % 10);
                    number = number / 10;
                }
                int[] array = new int[temp.size()];
                for (int j = 0; j < temp.size(); j++) {
                    array[j] = temp.get(j);
                }
                temp.clear();
                for (int k = 0; k < array.length; k++) {
                    for (int p = k + 1; p < array.length; p++) {
                        if (array[k] == array[p]) {
                            flag = 1;
                        }
                    }
                }
                if (flag == 0) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }

    }

}
