package NumberBaseConversion;

public class BinaryToDecimal {
    public static void main(String[] args){
        int n = 1011;
        int sum = 0;
        int mul = 1;
        while (n>0){
            int rem = n % 10;
            sum = sum + rem * mul;
            n = n/10;
            mul = mul*2;
        }
        System.out.println(sum);
    }
}

// for decimal addition
// 3467 + 8436
// here 7 + 6 = 13
// 13 % 10 = 3 remainder written under
// 13/10 = 1 is the carry over


