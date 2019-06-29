import java.util.*;

public class CHN15A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int cas = 0; cas < cases; cas++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if ((a + k) % 7 == 0) ans++;
            }
            System.out.println(ans);
        }
    }
}
