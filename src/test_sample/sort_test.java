package test_sample;

import java.util.Arrays;
import java.util.Scanner;

public class sort_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("��Ҫ������ٸ����֣�");
		int num = in.nextInt();
		//System.out.println(num);
		int[] arr = new int[num];
		
		
		for(int i=0;i<num;i++){
			System.out.println("�����"+i+"������");
			arr[i] = in.nextInt();
		}
		Arrays.parallelSort(arr);
		System.out.println("���������֣�");
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}
	}

}
