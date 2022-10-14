package tests;

import java.util.Arrays;

public class ArrangeZeroOne {

	public static void main(String[] args) {
		int[] n= {0,1,1,0,1};
		if(n.length!=0) {
			int[] n2=new int[n.length];
			int start=0,end=n.length-1;
			for(int i=0;i<n.length;i++) {
				if(n[i]==0) n2[start++]=n[i];
				else n2[end--]=n[i];
			}
			System.out.println(Arrays.toString(n2));
		}else System.out.println("Input is Zero Length");
	}
}
