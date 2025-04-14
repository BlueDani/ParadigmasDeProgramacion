package diagnostico;

public class Ejercicio01 {
		
	public static void main(String[] args) {
	
		int [][] matriz = {
				{1,2,3},
				{3,1,4},
				{5,4,2}
		};
		
		//int[][] m2 = new int[3][3];

		System.out.println(resolverEjercicio01(matriz));
	}

	private static boolean resolverEjercicio01(int[][] matriz) {
		int sumaAnteriores = matriz[0][0];
		boolean cumpleCondicion = true;
		
		for(int i=1; i<matriz.length && cumpleCondicion; i++) {
			
			int valorActual = matriz[i][i];
			
			if(valorActual != sumaAnteriores) {
				cumpleCondicion = false;
			}
			sumaAnteriores += valorActual;
		}
		return cumpleCondicion;
	}
	
}
