package BasicIO;

public class ArrIdxExcept {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
        // ArrayIndexOutOfBoundsException
    }
}
