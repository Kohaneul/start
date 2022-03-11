package day11.nemo;

public class Temp {

	public static void main(String[] args) {
	int[] arr= {(int)(Math.random()*10+1),(int)(Math.random()*10+1),(int)(Math.random()*10+1),(int)(Math.random()*10+1),(int)(Math.random()*10+1)};
	
	
	for(int i = 0; i<arr.length;i++) {
		for(int j = i+1; j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}System.out.print(arr[i]+" ");
	}

	}

}
