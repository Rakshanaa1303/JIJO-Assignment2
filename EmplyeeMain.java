import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmplyeeMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of employees: ");
		n=Integer.parseInt(br.readLine());
		EmployeeVo ev[]=new EmployeeVo[n];
		
		for(int i=0;i<n;i++) {
		
		
		System.out.println("Enter employee id: ");
		int num=Integer.parseInt(br.readLine());
		
		System.out.println("Enter name: ");
		String name=(br.readLine());
		
		System.out.println("Enter annual income: ");
		double income =Double.parseDouble(br.readLine());
		
		ev[i]= new EmployeeVo(num, name, income);
		}
		
		
		// Let's call the method to calculate the it
		EmployeeBo ebo=new EmployeeBo();
		
		for (int i=0;i<n;i++)
		{
			
			
			ebo.calincomeTax(ev[i]);
			System.out.println(ev[i]);
			
		}
		
	}

}