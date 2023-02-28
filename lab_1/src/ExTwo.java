import java.util.Arrays;

public class ExTwo {
    public static void main(String[] args) {
        long n = 4;
        if(n < 30000){
            int[][] mat = LatinSquar((int)n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println(LongLatinSquar(n));
        }

    }
    public static int[][] LatinSquar(long number) {
        long startTime = System.currentTimeMillis();
        int[][] matrice = new int[(int)number][(int)number];
        if(number < 30000){
            for(int j=0; j<(int)number; j++){
                int[] line = new int[(int)number];
                for(int i=0; i<(int)number; i++){
                    matrice[j][i] = (i + j) % (int)number +1;
                    line[i] = (i + j) % (int)number + 1;
                }
                String arrayString = Arrays.toString(line);
                System.out.println(arrayString);
            }
        }else {
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            System.out.println(totalTime);
        }
        return matrice;
    }

    public static long LongLatinSquar(long number) {
        long startTime = System.currentTimeMillis();
        long[][] matrice = new long[(int)number][(int)number];
            for(long j=0; j<number; j++){
                for(long i=0; i<number; i++){
                    matrice[(int)j][(int)i] = (i + j) % number +1;
                }
            }
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;

        return totalTime;
    }
}