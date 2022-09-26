package quick.sort;

public class Main {
    public static void main(String[] args) {

        char[] a = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.println("Исходный массив: ");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println();
        QuickSort.qsort(a);
        System.out.println("Отсортирований массив: ");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
