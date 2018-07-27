import java.util.Comparator;

class Emplyeesort implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		 EmployeeVo e1=(EmployeeVo)o1;
		 EmployeeVo e2=(EmployeeVo)o2;
		 int retval=0;
		 if(e1.getIncomeTax()<e2.getIncomeTax())
			 retval=1;
		 else
			 if(e1.getIncomeTax()>e2.getIncomeTax())
				 retval=-1;
			 else
				 retval=0;
			return retval;
	}
	
}