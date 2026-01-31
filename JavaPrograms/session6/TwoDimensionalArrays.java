package session6;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare and instantiate [Syntax = dataType [][] arrRefVar = new datatype[][]; ]
		
		int [][] a = new int [3][2]; // 3 rows and 2 columns
		
		// insert value in array
		// Syntax --> arrRefVar [row][col];
		a[0][0] = 12; //row=0, col=0
		a[0][1] = 13; //row=0, col=1
		
		a[1][0] = 14; //row=1, col=0
		a[1][1] = 15; //row=1, col=1
		
		a[2][0] = 16; //row=2, col=0
		a[2][1] = 17; //row=2, col=1
		
		//Second method for above : int [][] a = {{12,13},{14,15},{16,17}};
		
		// Value change for above {14} -- > Method : a[1][0] =25; where 1 is that raw index and o is column index
		
		//print size of row and columns
		System.out.println("no. of rows: " + a.length); //no. of raws
		System.out.println("no. of columns: " + a[0].length); // we can use anything like a[1] and a[2] instead of a[0] because every raw has same columns
		
		//read value from array
		for(int i=0; i<a.length; i++) // Here i=0 because row index is staring from 0. Here two loops created where first is outer for loop which is use for read value of row and also we create inner for loop inside for loop we use for red value of columns.
		{
			for (int j=0; j<a[0].length; j++) // Here j=0 because columns index is staring from 0.
			{
				System.out.println(a[i][j]);
			}
		}	
		
		//enhanced for loop
		for (int [] row :a) // {12,13}, {14,15}, {16,17}
		{
			for (int colvalue: row) // row=12,13 row=14,15 row=16,17
			{
				System.out.println(colvalue);
			}
		}
		
		
	}
}
