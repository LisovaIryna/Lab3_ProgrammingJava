package Array_WithoutMehods;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        try {
            System.out.println();

            // Enter the size of the matrix
            System.out.print("Enter the number of rows of the matrix: ");
            int n = sc.nextInt();
            System.out.print("Enter the number of columns in the matrix: ");
            int m = sc.nextInt();

            int[][] array = new int[n][m];

            // Input array
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.println("Enter " + (i + 1) + " the matrix row: ");
                for (int j = 0; j < m; j++) {
                    array[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            // Output array
            System.out.println(" ");
            System.out.println("The matrix is entered");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

            // Enter the column number to display
            System.out.println();
            System.out.print("Enter the column number you want to display (from 1 to 4): ");
            int column = sc.nextInt();

            // Output the necessary column
            System.out.println();
            System.out.println("Column " + column + " :");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i][column - 1] + " ");
                System.out.println();
            }
        }
        catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Error. A string is entered, not a number.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. There is no column with this number.");
        }
    }
}