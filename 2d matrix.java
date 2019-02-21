import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        int rows = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        int[][] mat = new int[rows][col];
        for(int i=0;i<=rows-1;i++){
            for(int j=0;j<=col-1;j++){
                mat[i][j] = i*j;
            }
        }
        System.out.println(Arrays.deepToString(mat));       
    }
}
