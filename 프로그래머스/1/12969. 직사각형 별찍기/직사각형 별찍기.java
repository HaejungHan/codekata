import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        String x = "*";
        
        for(int i=1; i<=n; i++){ // 세로
            for(int j=1; j<=m; j++){ // 가로
                System.out.print(x);
            }
            System.out.println();
        }

    }
}