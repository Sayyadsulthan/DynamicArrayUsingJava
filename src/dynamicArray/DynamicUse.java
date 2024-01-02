package dynamicArray;

public class DynamicUse {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		DynamicArray D1 = new DynamicArray();
		
		//adding the elements to array
		D1.push(5);
		D1.push(2);
		D1.push(4);
		D1.push(3);
		D1.push(6);
		D1.push(8);
		
		//printing the existing or entered data in an Array
		D1.printData();
		
		//removing the elements
		D1.pop();
		D1.pop();
		
		//Printing data
		D1.printData();
		
		//adding the elements to array
		D1.push(5);
		D1.push(2);
		D1.push(4);
		D1.push(3);
		D1.push(6);
		D1.push(8);
		D1.push(5);
		D1.push(2);
		D1.push(4);
		D1.push(3);
		D1.push(6);
		D1.push(8);
		
		//Printing data
		D1.printData();
		//return the size or count of array elements occupied
		System.out.println(D1.getSize());
		


	}

}
