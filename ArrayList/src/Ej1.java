
public class Ej1 {
	
	public static void main(String[] args) {
		
		int []array1={1,2,3,4,5,6,7,8,9,10};
		int []array2;
		int []nuevoArray=array1;
		int []array3={11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		
		//bucle for() para imprimir los valores de array1
		for(int i=0;i<array1.length;i++) 
			System.out.println("array1["+i+"]= "+array1[i]);
		
		//Para cada elemento de array1, cambiar el valor al factorial
		//del valor del índice del elemento. Imprime los valores del array
			
			//Calcula el factorial de los números
	        int fact= 1; // this  will be the result
	        array1[0]=1;
	        for (int i=1; i <array1.length; i++) {
	            fact=fact*i;
	            array1[i]=fact;
	            System.out.println("Factoriales: "+fact);
	        }
	        //Aprovecha los cálculos anteriores y cambia los valores al factorial
	        for(int i=0;i<array1.length;i++) 
	    			System.out.println("array1["+i+"]= "+array1[i]);
	       
	        
	        //Asignar la referencia de array1 a la variable array2.
	        //Imprime los valores de array2.
	        
	        array2=array1;
	        
	        for(int i=0;i<array2.length;i++) 
    			System.out.println("Los valores de array2["+i+"]= "+array2[i]);
	     
	        //Modificar algunos elementos de array1. Imprimir los valores de array2
	        array1[0]=120;
	        array1[1]=130;
	        
	        for(int i=0;i<array2.length;i++) 
    			System.out.println("Nuevos valores para array2["+i+"]= "+array2[i]);
	        
	        //Crear un vector de 20 elementos de tipo int array3.
	        //Asignar la referencia de este vector a la variable array2.
	        //Imprime los valores de array2.
	        
	        array3=array2;
	        for(int i=0;i<array2.length;i++) 
    			System.out.println("array3=array2["+i+"]= "+array2[i]);
	        
	        //Copiar los valores de array1 a array2 con System.arraycopy()
	        //Imprimir los valores de array2
	        
	        for (int i=0;i<array1.length;i++)
	            array2[i] = array1[i];
	        
	        System.arraycopy(array1,0,array2,0,array1.length);
	        
	        for(int i=0;i<array2.length;i++) 
    			System.out.println("Copiados de arr. 1 a arr2 ["+i+"]= "+array2[i]);
	        
	        //Cambiar algunos valores de array2. Imprimir array3 y array2. 
	        //Compilar y ejecutar el programa
	        array2[8]=140;
	        array2[9]=150;
	             
	        for(int i=0;i<array2.length;i++) 
    			System.out.println("Array2 ["+i+"]= "+array2[i]);
	        
	        for(int i=0;i<array2.length;i++) 
    			System.out.println("Array3 ["+i+"]= "+array2[i]);
	        
	    }
	}	
	