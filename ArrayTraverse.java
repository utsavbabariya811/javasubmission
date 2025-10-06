package Java_Self_Study;

public class ArrayTraverse {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        System.out.println("Using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nUsing for-each loop:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        int copy[] = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);

        System.out.println("\nCopied Array:");
        for (int x : copy) {
            System.out.print(x + " ");
        }
    }
}
