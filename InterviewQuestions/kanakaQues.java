package InterviewQuestions;

import java.util.Scanner;

public class kanakaQues {

        public static int findMinI(int N) {
            int st = 0;
            int e = N; // Safe upper bound since S(i) grows fast

            int ans = -1;

            while (st <= e) {
                int m = st + (e - st) / 2;
                int sum = (m % 2 == 0) ? (m * m + m + 2) : (m * m + 3);

                if (sum >= N) {
                    ans = m;
                    e = m - 1; // try to find smaller i
                } else {
                    st = m + 1;
                }
            }

            return ans;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            System.out.println(findMinI(N));  // Example input
        }
    }


