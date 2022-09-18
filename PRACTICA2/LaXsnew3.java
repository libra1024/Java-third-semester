

import java.util.Scanner;

class LaXsnew2{
	
	public static void main(String[] args){
		
			// Asking the user to input a number and then it is creating a matrix with the same number of rows
			// and columns.
				Scanner teclado = new Scanner(System.in);
				System.out.print("Introduce el numero de filas: ");
				int numFilas = teclado.nextInt();
				teclado.close();
				char[][] matriz = new char[numFilas][numFilas];
				
				
			// Creating a matrix with the same number of rows and columns.
				for(int i=0; i<numFilas; i++){
					for(int j=0; j<numFilas; j++){
						if(i==j){
						matriz[i][j]='x';
						}else{
							matriz[i][j]=' ';
						}
					}
				}
				
			// Creating the second diagonal.
				for(int k=0; k<numFilas; k++){
					for(int l=0; l<numFilas; l++){
					
						matriz[k][l]=matriz[(numFilas-1)-l][k];


						if(k==l){
						matriz[l][k]='x';
						}else{
							matriz[l][k]=' ';
						}
					}
				}
				
				
			
			// Printing the matrix.
				for(int m=0; m<numFilas; m++){
					for(int n=0; n<numFilas; n++){
					System.out.print(matriz[m][n]);					
						}
					System.out.println("");
					}
				}			
		
		
		
		
	}


		

		