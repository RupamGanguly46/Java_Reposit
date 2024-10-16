package NumberBaseConversion;

public class DecimalAdder {
    public static void main(String[] args){
        int a = 1;
        int b = 1;
        int answer = 0;
        if(a==0){
            answer = b;
        }
        else if(b==0){
            answer = a;
        }
        else {
            int carry = 0;
            int turn = 1;
            while (a != 0) {
                int a_digit = a % 10;
                int b_digit = b % 10;
                int sum = carry + a_digit + b_digit;
                int below = sum % 10;
                carry = sum / 10;
                answer += below * turn;
                turn *= 10;
                a = (a - a_digit) / 10;
                b = (b - b_digit) / 10;
            }
            answer = carry * turn + answer;
        }
        System.out.print(answer);
    }
}
