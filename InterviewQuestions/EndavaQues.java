package InterviewQuestions;

public class EndavaQues {
    public static void main(String[] args) {
        System.out.println(funct("1234567", 3));
    }

    static int funct(String s, int k){

        while(s.length() > 1){
            int sum=0;
            for(int i=0; i<s.length(); i++){
                if(i % k == 0){
                    int d = s.charAt(i) - '0';
                    sum += d;
                }
            }
            s = String.valueOf(sum);
        }
        return Integer.parseInt(s);
    }

}
