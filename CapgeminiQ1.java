import java.util.*;




public class CapgeminiQ1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int K = sc.nextInt();
            String S = sc.next();


            if (K > N) {
                System.out.println(-1);
                return;
            }


            if (K == 1) {
                System.out.println(0);
                return;
            }

            for (int i = 0; i <= N - K; i++) {
                boolean valid = true;
                for (int j = i; j < i + K - 1; j++) {
                    if (S.charAt(j) == S.charAt(j + 1)) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    System.out.println(i);
                    return;
                }
            }

            System.out.println(-1);
        }
}

