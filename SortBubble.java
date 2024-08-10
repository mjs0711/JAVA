package sort.bubble;

import java.util.Arrays;

public class SortBubble {

	public static void main(String[] args) {
		
		int [] array = {5,7,4,3,1,100};
		
		System.out.println("원본데이터 : " + Arrays.toString(array));
		System.out.println(array.length);
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
			System.out.print("pass-" + i );
			System.out.println(java.util.Arrays.toString(array));
		}
		System.out.print("result : ");
		System.out.println(java.util.Arrays.toString(array));			
	}	
}
