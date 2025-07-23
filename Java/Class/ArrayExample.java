public class ArrayExample {
    public static void main(String[] args) {
        /*
         * int[] a = new int[2];
         * a[0] = 1;
         * a[1] = 5;
         * 
         * System.out.println("Array");
         * for (int i = 0; i < a.length; i++) {
         * System.out.println("Value is: " + a[i]);
         * }
         */

        /*
         * int [] a = {1, 2, 3, 4, 5};
         * for ( int i = 0; i < a.length ; i++) {
         * System.out.println("Value is: " + a[i]);
         * }
         */

        // advanced for loop
        int[] a = { 1, 2, 3, 4, 5 };
        for (int x : a) {
            System.out.println(x);
        }
    }
}