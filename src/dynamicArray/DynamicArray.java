package dynamicArray;

public class DynamicArray {
	private int arr[] ;
	private int count =0;
	
	public DynamicArray() {
		// Initializing the array size of 10
		this.arr = new int [10];
		
	}
	
	public void push(int num) {
//		if the size limit exeeds create a new array and assign the pre array value 
		if(count>=arr.length) {
			int temp[] =  new int[arr.length*2];
			int i=0;
			for(;i<arr.length;i++) {
				temp[i]=arr[i];
			}
			temp[i]= num;
			//assign the new array with values
			arr = temp;
			// increment the count
			count++;
		}else {
			// else add the element to continue index of array and increase the count
			arr[count++]=num;
		}
		
	}
	
	public void pop() {
		if(count>0) {	
			//remove the element at last count index
			arr[count--]=0;
		}else {
			System.err.println("Array is Empty for remove element");
		}
		
//		if(arr.length%count==0) {
//			
//		}
	}
	
	public int getSize() {
		return count;
	}
	
	public void printData() {
		System.out.print("[");
		for (int i=0; i<count; i++) {
			if(i==count-1) {	
				System.out.print(arr[i]);
			}else {				
				System.out.print(arr[i]+",");
			}
		}
		System.out.println("]");
	}
	
	
}
