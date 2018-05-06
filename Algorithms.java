package mentoringTask1Part2;

import java.util.Random;

public class Algorithms {
	Random rndm;

	public void operations() {
		rndm = new Random();
		// declaration of toTranspose matrix
		int a = rndm.nextInt(5) + 2;
		int b = rndm.nextInt(5) + 2;
		int toTranspose[][] = new int[a][b];
		// multA, multB matrices
		int aSize = rndm.nextInt(5) + 2;
		int matrixA[][] = new int[aSize][a];
		int matrixB[][] = new int[a][b];

		// matrix for Transpose
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				toTranspose[i][j] = rndm.nextInt(10);
			}
		}

		// Print the matrix
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(toTranspose[i][j] + " ");
			}
			System.out.println();
		}


		System.out.println("Transpose the matrix");
		transposeMatrix(toTranspose);
		System.out.println();

		/// Multiply matrices
		// Initialize and print matrix multA
		for (int i = 0; i < aSize; i++) {
			for (int j = 0; j < a; j++) {
				matrixA[i][j] = rndm.nextInt(20);
				System.out.print(matrixA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// Initialize and print matrix multB
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				matrixB[i][j] = rndm.nextInt(20);
				System.out.print(matrixB[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Multiply matrixA and matrixB");
		multiplyMatrix(matrixA, matrixB);

	}
	void transposeMatrix(int[][] array) {

		for (int j = 0; j < array[0].length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	void multiplyMatrix(int[][] multX, int[][] multY) {
		int matrix[][] = new int[multX.length][multY[0].length];
		for (int i = 0; i < multX.length; i++) {
			for (int j = 0; j < multY[0].length; j++) {
				for (int k = 0; k < multY.length; k++) {
					matrix[i][j] += multX[i][k] * multY[k][j];
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
