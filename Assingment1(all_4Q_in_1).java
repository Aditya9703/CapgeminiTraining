package Basicjava;
import java.util.*;

public class Assingment1(all_4Q_in_1)  {

	    Scanner reader = new Scanner(System.in);

	    void transpose() {
	        System.out.print("Enter row count: ");
	        int rowSize = reader.nextInt();
	        System.out.print("Enter column count: ");
	        int colSize = reader.nextInt();

	        int[][] nums = new int[rowSize][colSize];

	        System.out.println("Fill the matrix:");
	        for (int r = 0; r < rowSize; r++) {
	            for (int c = 0; c < colSize; c++) {
	                nums[r][c] = reader.nextInt();
	            }
	        }

	        System.out.println("Resulting transpose:");
	        for (int c = 0; c < colSize; c++) {
	            for (int r = 0; r < rowSize; r++) {
	                System.out.print(nums[r][c] + " ");
	            }
	            System.out.println();
	        }
	    }

	    void rotate2x2() {
	        int[][] grid = new int[2][2];

	        System.out.println("Provide 2x2 matrix values:");
	        for (int a = 0; a < 2; a++) {
	            for (int b = 0; b < 2; b++) {
	                grid[a][b] = reader.nextInt();
	            }
	        }

	        System.out.println("After clockwise rotation:");
	        for (int b = 0; b < 2; b++) {
	            for (int a = 1; a >= 0; a--) {
	                System.out.print(grid[a][b] + " ");
	            }
	            System.out.println();
	        }
	    }

	    void multiplyMatrix() {
	        int[][] left = new int[3][2];
	        int[][] right = new int[2][4];
	        int[][] output = new int[3][4];

	        System.out.println("Input 3x2 matrix:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 2; j++) {
	                left[i][j] = reader.nextInt();
	            }
	        }

	        System.out.println("Input 2x4 matrix:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 4; j++) {
	                right[i][j] = reader.nextInt();
	            }
	        }

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 4; j++) {
	                for (int k = 0; k < 2; k++) {
	                    output[i][j] += left[i][k] * right[k][j];
	                }
	            }
	        }

	        System.out.println("Matrix multiplication output:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(output[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    void flipMatrix() {
	        int[][] values = new int[4][3];

	        System.out.println("Enter 4x3 matrix data:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 3; j++) {
	                values[i][j] = reader.nextInt();
	            }
	        }

	        System.out.println("Matrix after vertical flip:");
	        for (int i = 3; i >= 0; i--) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(values[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

	 class P3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Assingment1(all_4Q_in_1) task = new Assingment1(all_4Q_in_1)();

	        while (true) {
	            System.out.println("\n1. Transpose Operation");
	            System.out.println("2. Rotate 2x2");
	            System.out.println("3. Multiply Matrices");
	            System.out.println("4. Flip Matrix");
	            System.out.println("5. Exit Now");
	            System.out.print("Enter your choice: ");

	            int pick = sc.nextInt();

	            switch (pick) {
	                case 1:
	                    task.transpose();
	                    break;
	                case 2:
	                    task.rotate2x2();
	                    break;
	                case 3:
	                    task.multiplyMatrix();
	                    break;
	                case 4:
	                    task.flipMatrix();
	                    break;
	                case 5:
	                    return;
	                default:
	                    System.out.println("Invalid input, choose again");
	            }
	        }
	    }
	}
