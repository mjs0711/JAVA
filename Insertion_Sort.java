package soft;

public class Insertion_Sort {
	public static void main(String[] args) {	
		int[] array = {1, 3, 4, 5, 7};
	      int[] dim = {7, 5, 4, 3, 1};
	      
	      System.out.println("Array Length : "+dim.length);
	      System.out.print("souce : ");
	      System.out.println(java.util.Arrays.toString(dim));
	      
	      for(int i=1; i<dim.length; i++) {
	         for(int j=i; j>0; j--) {
	            if(dim[j-1] > dim[j]) {
	               int temp = dim[j-1];
	               dim[j-1] = dim[j];
	               dim[j] = temp;
	            } 
	         }
	         System.out.print("pass-" + i+" : ");
	         System.out.println(java.util.Arrays.toString(dim));
	      }
	      System.out.print("result : ");
	      System.out.println(java.util.Arrays.toString(dim));
	   }
	}
