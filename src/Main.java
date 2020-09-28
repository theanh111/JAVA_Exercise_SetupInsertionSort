public class Main {
    public static void main(String[] args) {
        int[] list = {97, 1, 4, -5, 3, 20};
        System.out.println("Before:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        InsertionSort sort = new InsertionSort();
        sort.insertionSort(list);

        System.out.println();
        System.out.println("After:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
