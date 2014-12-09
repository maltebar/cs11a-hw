public class GameOfLife{
	public static void main(String[] args){
		boolean[][] matrix ={{false,false,false,false,false,false},
							 {false,true,false,false,false,false},
							 {false,false,true,true,false,false},
							 {false,true,true,false,true,false},
					   	     {false,false,false,false,false,false}};
		printMatrix(playGame(matrix));
	}

	public static void printMatrix(boolean[][] matrix){
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(matrix[i][j] == true){
					System.out.print("*");
				}
				else{
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	
	public static int countNeighbors(boolean[][] matrix, int row, int column){
		int sumOfNeighbors = 0;
		for(int i=row-1; i<=row+1; i++){
			for(int j=column-1; j<=column+1; j++){
				if(matrix[i][j] == true){
					sumOfNeighbors ++; 
				}
			}
		}
		if(matrix[row][column] == true){
			sumOfNeighbors --;
		}
		return sumOfNeighbors;
	}
	
	public static boolean[][] playGame(boolean[][] matrix){
		boolean[][] newMatrix = new boolean[matrix.length][matrix[0].length];
		for(int i = 1; i<matrix.length-1; i++){
			for(int j = 1; j<matrix[0].length-1; j++){
				if((matrix[i][j] == false && countNeighbors(matrix,i,j) == 3)||
					(matrix[i][j] == true &&(countNeighbors(matrix,i,j)==3
						||countNeighbors(matrix,i,j)==2))){
					newMatrix[i][j] = true;
				}
				else{
					newMatrix[i][j] = false;
				}
			}
		}
		return newMatrix;
	}
}
				
