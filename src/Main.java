import java.util.Random;

public class Main {
    public static void main(String[] args){
        generatetwodimencionalarray(2,5);
    }

    public static int[][] generatetwodimencionalarray(int length, int width) {
        int[][]array=new int[length][width];
        Random r=new Random();
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                array[i][j]=r.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }
}