import com.sun.deploy.security.SelectableSecurityManager;

/**
 * @autor Sidostsova Olga
 */

public class Basic {
    public static void main(String[] args) {
        Integer[] array = new Integer[20];

        int min = 20;
        int max = -20;
        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21) - 10;
            System.out.print(array[i] + " ");
            if ((array[i] > 0) && (array[i] < min)) {
                min = array[i];
            }
            if ((array[i] < 0) && (array[i] > max)) {
                max = array[i];
            }
        }
        System.out.println("\nМинимальный положительный = " + min);
        System.out.println("Максимальный отрицательный = " + max);

        if ((min < 20) && (max > -20)) {
            System.out.println("Массив после переставновки максимумов и минимумов");
            for (int i = 0; i < array.length; i++) {
                if (array[i] == min) {
                    array[i] = max;
                } else if (array[i] == max) {
                    array[i] = min;
                }
                System.out.print(array[i] + " ");
            }
        } else System.out.println("\nВсе числа или положительные или отрицательные");

    }
}
