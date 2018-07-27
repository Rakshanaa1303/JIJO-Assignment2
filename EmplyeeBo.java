

class EmployeeBo{
	public void calincomeTax(EmployeeVo evo)
	{
		double incomeTax= evo.getAnnualIncome()*0.3;
		evo.setIncomeTax(incomeTax);
	}
}
