package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CutTheTriangle1767A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());  // Number of test cases

        while (t-- > 0) {
            // Read the empty line if present
            String emptyLine = br.readLine().trim();
            while (emptyLine.isEmpty()) {
                emptyLine = br.readLine().trim(); // Continue reading until a non-empty line is found
            }

            // Read the vertices of the triangle
            String[] firstVertex = emptyLine.split(" ");
            String[] secondVertex = br.readLine().trim().split(" ");
            String[] thirdVertex = br.readLine().trim().split(" ");

            // Parse the coordinates
            int x1 = Integer.parseInt(firstVertex[0]);
            int y1 = Integer.parseInt(firstVertex[1]);
            int x2 = Integer.parseInt(secondVertex[0]);
            int y2 = Integer.parseInt(secondVertex[1]);
            int x3 = Integer.parseInt(thirdVertex[0]);
            int y3 = Integer.parseInt(thirdVertex[1]);

            // Store the x and y coordinates in arrays for easy access
            int[] x = {x1, x2, x3};
            int[] y = {y1, y2, y3};

            // Find min and max for x and y coordinates
            int minX = Math.min(x1, Math.min(x2, x3));
            int maxX = Math.max(x1, Math.max(x2, x3));
            int minY = Math.min(y1, Math.min(y2, y3));
            int maxY = Math.max(y1, Math.max(y2, y3));

            // Check conditions for possible cuts
            boolean canCutVertically = (minX < maxX); // There are points on both sides
            boolean canCutHorizontally = (minY < maxY); // There are points above and below

            if (canCutVertically || canCutHorizontally) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        br.close(); // Close the BufferedReader to release resources
    }
}

//4
//
//4 7
//6 8
//3 5
//
//4 5
//4 7
//6 8
//
//5 8
//1 8
//2 5
//
//3 6
//6 6
//6 3