import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter the total no. of elements: ");
		int n = Integer.parseInt(br.readLine());
		
		if(n<=2)
		{
			System.out.println("Input should be greater than 2");
		}
		else
		{
			int arr[] = new int[n];

			System.out.println("Enter the numbers: ");
			for (int i = 0; i < arr.length; i++) 
			{
				String s1 = br.readLine();
				int x = Integer.parseInt(s1);
				arr[i] = x;
			}
			
			if(UserMainCode.checkTripplets(arr))
			{
				System.out.println("TRUE");
			}
			else
			{
				System.out.println("FALSE");
			}

		}
	}
}
