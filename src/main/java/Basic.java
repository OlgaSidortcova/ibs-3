
/**
 * @autor Sidostsova Olga
 */

public class Basic {
    public static void main(String[] args) {

        Integer[] array = new Integer[20];
        array[0] = -10 + (int) (Math.random() * 21);
        System.out.print(array[0]);

        int min = array[0];
        int indexMin = 0;

        int max = array[0];
        int indexMax = 0;

        for (int i = 1; i < array.length; i++) {
            array[i] = -10 + (int) (Math.random() * 21);
            System.out.print(" " + array[i]);
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }

        System.out.println("\nMin под номером " + indexMin + " со значением " + min);
        System.out.println("Max под номером " + indexMax + " со значением " + max);
        array[indexMin] = max;
        array[indexMax] = min;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
