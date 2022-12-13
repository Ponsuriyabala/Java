package ballBrick;
import java.util.*;
public class Build {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of the NxN matrix : ");
		int rowColumn=in.nextInt();
		int ballPosition=(rowColumn/2);
		String game[][]=new String[rowColumn][rowColumn];
		for(int i=0;i<rowColumn;i++) {
			for(int j=0;j<rowColumn;j++) {
				if(i==0||j==0||j==rowColumn-1) {
					game[i][j]="W";
				}
				else if(i==rowColumn-1&&j==ballPosition) {
					game[i][j]="o";
				}
				else if(i==rowColumn-1) {
					game[i][j]="G";
				}
				else {
					game[i][j]=" ";
				}
			}
		}


		char entry='y';
		do{
			System.out.println("Enter the bricks position and the brick type :");
			int row=in.nextInt();
			int column=in.nextInt();
			String value=in.next();
			game[row][column]=value;
			System.out.println("Do you want to continue(y or n)");
			char entryGet=in.next().charAt(0);
			entry=entryGet;
		}while(entry=='y'||entry=='Y');

		System.out.println("Enter ball count");
		int ballCount=in.nextInt();

		do {
			System.out.println("Enter the direction ");
			String ballDirection=in.next();
			switch(ballDirection){
			case "st":
				straight(game,ballCount,ballPosition,rowColumn);
				break;
			case "ld":
				leftDiagonal(game,ballCount,ballPosition,rowColumn);
				break;
			case "rd":
				rightDiagonal(game,ballCount,ballPosition,rowColumn);
				break;

			default:
				System.out.println("enter another");
			}
		}while(ballCount>0);

		display(game,rowColumn);
	}
	static void display(String game[][],int rowColumn) {
		for(int i=0;i<rowColumn;i++) {
			for(int j=0;j<rowColumn;j++) {
				System.out.print(game[i][j] +" ");
			}
			System.out.println();
		}	
	}
	static void straight(String game[][],int ballCount,int ballPosition,int rowColumn) {
		for(int i=rowColumn-2;i>1;i--) {
			if(game[i][ballPosition]!=" ") {
				int brickValue=Integer.parseInt(game[i][ballPosition]);
				if(brickValue!=1) {
					brickValue-=1;
					game[i][ballPosition]=Integer.toString(brickValue);
				}
				else {
					game[i][ballPosition]=" ";
				}
				break;
			}
		}
		display(game,rowColumn);
	}
	static void leftDiagonal(String game[][],int ballCount,int ballPosition,int rowColumn) {
		boolean flag=true;
		display(game,rowColumn);
		if(ballPosition>1) {
			for(int i=rowColumn-2;i>=1;i--) {
				for(int j=1;j<ballPosition;j++) {
					if(game[i][j]!=" ") {
						int brickValue=Integer.parseInt(game[i][j]);
						if(brickValue!=1) {
							brickValue-=1;
							game[i][j]=Integer.toString(brickValue);
						}
						else {
							game[i][j]=" ";
						}
						game[rowColumn-1][ballPosition]="G";
						game[rowColumn-1][j]="o";
						ballPosition=j+1;
						flag=false;
						break;
					}
				}
				if(!flag)
					break;
			}
		}
		System.out.println(ballPosition);
		display(game,rowColumn);
	}
	static void rightDiagonal(String game[][],int ballCount,int ballPosition,int rowColumn) {
		boolean flag=true;
		display(game,rowColumn);
		if(ballPosition>1) {
			for(int i=rowColumn-2;i>=1;i--) {
				for(int j=rowColumn-2;j>ballPosition;j--) {
					if(game[i][j]!=" ") {
						int brickValue=Integer.parseInt(game[i][j]);
						if(brickValue!=1) {
							brickValue-=1;
							game[i][j]=Integer.toString(brickValue);
						}
						else {
							game[i][j]=" ";
						}
						game[rowColumn-1][ballPosition]="G";
						ballPosition=j;
						game[rowColumn-1][ballPosition]="o";
						ballPosition=j-1;
						flag=false;
						break;
					}
				}
				if(!flag)
					break;
			}
		}
		System.out.println(ballPosition);
		display(game,rowColumn);
	}

}


