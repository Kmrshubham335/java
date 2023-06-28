import java.util.Scanner;
public class squarpattern {
    public static void main(String[] args) {
        try (Scanner dis = new Scanner(System.in)){
            System.out.print("Enter Square Odd Numbers Rows = ");
		int rows = dis.nextInt();
		System.out.println("the Square Pattern of Odd Numbers");
		for (int i = 1; i <= rows; i++) 
		{
			for (int j = i - 1; j < rows; j++ ) 
			{
				System.out.print(j * 2 + 1 );
			}
			for(int k = 0; k < i - 1; k++) 
			{
				System.out.print(k * 2 + 1 );
			}
			System.out.println();
		}
        }
    }    
}
