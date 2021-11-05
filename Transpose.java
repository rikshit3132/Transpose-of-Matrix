import java.util.Scanner;
class Transpose{
	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int i,j;
    System.out.println("Enter the rows:\n");
    int row=sc.nextInt();
    System.out.println("Enter the column:\n");
    int column=sc.nextInt();
    int arr1[][]=new int[row][column];
    int trans[][]=new int[row][column];
    System.out.println("Enter Array1:\n");
 
    for(i=0;i<row;i++){
    	for(j=0;j<column;j++){
    		arr1[i][j]=sc.nextInt();
    	}
    }
    System.out.println("Array1 is:\n");
    for(i=0;i<row;i++){
    	for(j=0;j<column;j++){
    		System.out.print(arr1[i][j]+" ");
    	}
    	System.out.println();
    	}
    for(j=0;j<column;j++){
    	for(i=0;i<row;i++){
    		trans[j][i]=arr1[i][j];	
    	}
    }
    System.out.print("Transposed Array is:\n");
    for(i=0;i<row;i++){
    	for(j=0;j<column;j++){
        System.out.print(trans[i][j]+" ");
    	}
    	System.out.println();
	}
}
}