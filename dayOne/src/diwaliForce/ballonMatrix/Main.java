package diwaliForce.ballonMatrix;
import java.util.*;
public class Main {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the Matric size row*column : ");
		int row=in.nextInt();
		int col=in.nextInt();
		char[][] mat=new char[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				mat[i][j]='_';
			}
		}
		printMatrix(row,col,mat);
		insertBalloon(mat,row,col);

	}
	static void insertBalloon(char arr[][],int noofRow,int col){
		char c ='y';
		while(c=='y') {
			System.out.print("Enter the Column number : ");
			int insertColumn=in.nextInt();
			System.out.print("Enter the colour of balloon : ");
			char inBalloonColour=in.next().charAt(0);
			arr[noofRow-1][insertColumn-1]=inBalloonColour;
			printMatrix(noofRow,col,arr);
			System.out.println("Do You want Continue ? (Y||N) ");
			c = in.next().charAt(0);
			if(c=='n') {
				System.out.println("Program Finsih");
			}
		}
	} 
	static void printMatrix(int row,int col,char[][] mat) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
