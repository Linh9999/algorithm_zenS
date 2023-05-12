package algorithm_zenS;
import java.util.Scanner;

public class miniMaxSum {
	static int arrNumber[];
	static int sumMin=0,sumMax=0, k=0;

	public static void main(String[] args) {
		inputNumber();
		outputElement(arrNumber);
		outputSumExcept(arrNumber,k);

	}
	public static void inputNumber() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	    int n = 5;
	    // Create array
	    arrNumber = new int [n];
	    System.out.print("Input 5 number: \n");
	    for (int i = 0; i < n; i++) {
	        System.out.printf("a[%d] = ", i);
	        arrNumber[i] = scanner.nextInt();
	     }
	    System.out.print("Input a position you want : ");
	    k = scanner.nextInt();
	        
	}
	
	public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                  
        }
        
    }
	public static void outputSumExcept(int arr[],int k) {
		bubbleSort(arr);
		int sum=0,temp=0;
		if(k>5) {
			k=5;
			System.out.println("Max Position = 5");
		}
		 for(int i=0;i<arr.length;i++) {
				temp= temp+ arr[i];
				sum=temp-arr[k-1]; 
		 }
		 System.out.println("If we sum everything except "+ k +", our sum is: "+ sum);
	           
	}

	public static void outputElement(int arr[]) {
		for(int e :arr) {
			 System.out.print(e + " ");
		}
	
		bubbleSort(arr);
		int tempMin =0;
		int tempMax =0;
		int n = arr.length;
		for(int i=0; i < n;i++) {
			tempMin=tempMin +arr[i];
			sumMin = tempMin -arr[0];
			tempMax=tempMax+arr[i];
			sumMax =tempMax-arr[n-1];
		}
		System.out.println("\n"+sumMax+" "+sumMin);
	
	}
	public static void show(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
