import java.util.Arrays;

public class MyArsenal {
    public static void main(String[] args) {
        System.out.println("LESSON2");

        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) ((Math.random()) * 100);

            for (i = 0; i < arrays.length; i += 2) {
            int max = arrays[i];
            max = arrays[i];
        }
        }
        System.out.println(Arrays.toString(arrays));
    }
}



