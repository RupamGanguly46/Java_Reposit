package Patterns.MonuBhaiyaGit;
public class MirrorPattern {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int row = 1;
        int space = n - 1;
        int val = 1;
        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                System.out.print(val + "\t");
                val++;
                j++;
            }
            // next row Perp
            System.out.println();
            row++;
            space--;
            star += 2;// star = star + 2;
        }
    }

}
