package diagnostico;

public class Ejercicios {


	public static void main(String[] args) {
		int[][] m = {
				{ Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
				{ Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
				{ Integer.MAX_VALUE, Integer.MAX_VALUE, 1}
		};
		
		int[][] m2 = {
				{ 1, 2, 3, 1},
				{ 4, 1, 6, 1},
				{ 7, 8, 2, 1},
				{ 1, 5, 1, 4}
		};
		
		int[][] m3 = {
				{ 8, 2, -3, 4},
				{ 5, -6, -6, 20},
				{ 21, 1, -5, 0}
		};
		
		int[][] m4 = {
				{ 1, 2, 3, 4},
				{ 5, -6, -6, 20},
				{ 1, 1, 10, 10}
		};
		
		
		if(resolver2(m))
			System.out.println("Ta bien");
		else
			System.out.println("Ta mal");
		
		
//		mostrarMatriz(m3);
//		mostrarMatriz(resolver3(m3));
		
		
//		mostrarMatriz(m4);
//		mostrarVector(resolver4(m4));
	}
	
	public static boolean resolver1(int[][] mat) {
		int i = 1;
		int suma= mat[0][0];
		
		for (; i < mat.length; i++ ) {
			
			if(mat[i][i] != suma)
				return false;
			
			suma += mat[i][i];
		}
		
		return true;
	}
	
	public static boolean resolver2(int[][] mat) {
		
		int mult = 1;
		
		for (int[] vec : mat) {
			for (int elem : vec) {
				mult *= elem;
				
//				System.out.println("Suma: " + mult);
				
				if(mult == 0)
					return false;
			}
		}
		
		return true;
	}
	
	public static int[][] resolver3(int[][] mat) {
		
		int cantFilas = mat.length;
		int cantColumnas = mat[0].length;
		
		int[][] resMat = new int[cantFilas][cantColumnas];
		
		for (int i = 0; i < cantFilas; i++) {
			
			for(int j = 0; j < cantColumnas; j++){
				
				resMat[i][j] = mat[i][j];
				
				if(i != 0)
					resMat[i][j] += mat[i-1][j];
				
				if(i != cantFilas-1)
					resMat[i][j] += mat[i+1][j];
				
				if(j != 0)
					resMat[i][j] += mat[i][j-1];
				
				if(j !=  cantColumnas-1)
					resMat[i][j] += mat[i][j+1];
				
			}
			
		}
		
		return resMat;
	}
	
	public static int[] resolver4(int[][] mat) {
		
		
		int[] resVec = new int[mat.length];
		
		for (int i = 0; i < mat.length; i++) {
			
			int moda = mat[i][0];
			int cantRepModa = 1;
			
			for(int j = 0; j <= mat[i].length; j++){
				
				int cantRep = 0;
				
				for(int l = j; l < mat[i].length; l++){
					
					if(mat[i][l] == mat[i][j])
						cantRep++;
					
				}
				
				
				if(cantRep >= cantRepModa){
					moda = mat[i][j];
					cantRepModa = cantRep;
				}
			}
			
			resVec[i] = moda;
		}
		
		return resVec;
	}
	
	public static void mostrarMatriz(int[][] mat) {
		
		for (int[] vec : mat) {
			for (int elem : vec) {
				System.out.print("[" + elem + "]");
			}
			System.out.println("");
		}
		System.out.println("-----------------");
	}
	
	public static void mostrarVector(int[] vec) {
			
		for (int elem : vec) {
			System.out.print("[" + elem + "]");
		}
		System.out.println("");
		System.out.println("-----------------");	
	}
	
}