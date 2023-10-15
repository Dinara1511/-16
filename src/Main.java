import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int [n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        int s=0;
        for (int i = 0; i<n; i++) {
            s+=a[0][i];
            s+=a[n-1][i];
        }
        for (int i=1;i<n-1;i++){
            s+=a[i][0];
            s+=a[i][n-1];
        }
        if (n==1) s=s/2;
        System.out.println(s);
    }
}
