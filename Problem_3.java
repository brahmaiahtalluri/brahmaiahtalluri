import java.util.*;
public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int limit = (a % 2 == 0) ? a - 1 : a;

        for (int i = 0; i < limit; i++) {
            int odd = 2 * i + 1;
            System.out.print(odd);
            if (i < limit - 1) {
                System.out.print(",");
            }
        }
        sc.close();
    }
}
