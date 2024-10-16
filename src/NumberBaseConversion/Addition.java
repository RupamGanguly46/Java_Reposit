package NumberBaseConversion;
import java.util.*;
public class Addition {
    static Scanner scanner = new Scanner(System.in);

    public static int B2D(int n){
        int sum = 0;
        int mul = 1;
        while (n>0){
            int rem = n % 10;
            sum = sum + rem * mul;
            n = n/10;
            mul = mul*2;
        }
        return sum;
    }

    public static int Verify(int a, int b){
        a = B2D(a);
        b = B2D(b);
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
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Enter first binary");
        int a = scanner.nextInt();
        System.out.println("Enter second binary");
        int b = scanner.nextInt();
        System.out.println("Decimal : " + Verify(a, b));
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
                int below = sum % 2;
                carry = sum / 2;
                answer += below * turn;
                turn *= 10;
                a = (a - a_digit) / 10;
                b = (b - b_digit) / 10;
            }
            answer = carry * turn + answer;
        }
        System.out.println("Binary :" + answer);
    }
}
