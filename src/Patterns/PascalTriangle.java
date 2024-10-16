package Patterns;
public class PascalTriangle {
//    public static void main(String[] args) {
//        int n = 5;  // number of rows in Pascal's triangle
//        for (int i = 0; i < n; i++) {  // loop for each row
//            // Print leading spaces to make it look like a triangle
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//
//            int number = 1;  // starting number in each row is always 1
//            for (int j = 0; j <= i; j++) {
//                System.out.print(number + " ");
//                number = number * (i - j) / (j + 1);  // compute next number
//            }
//            System.out.println();  // move to the next row
//        }
//    }
//}
//

//public class RhombusPattern {
    public static void main(String[] args) {
        int n = 5;  // The number of rows

        // Upper part of the rhombus (including middle)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        // Lower part of the rhombus
//        for (int i = n - 1; i >= 1; i--) {
//            // Print leading spaces
//            for (int j = n; j > i; j--) {
//                System.out.print(" ");
//            }
//            // Print stars
//            for (int j = 1; j <= n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}

