package zuoye;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
        int[] array = new int[7];
        System.out.println("请输入7个数");
        Scanner scanner =new  Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
        	array[i]=scanner.nextInt();
			}
        	
      for(int n:array) {
        	 System.out.print(n+" ");
         }
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {

					int temp = array[i];

					array[i] = array[j];

					array[j] = temp;
	}
}
}		System.out.println(Arrays.toString(array));
		}
}
		
