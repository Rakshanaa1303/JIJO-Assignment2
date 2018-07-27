class EmployeeVo {
	 int empid;
	 String empname;
	 double annualIncome;
	 double incomeTax=0;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public double getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(double incomeTax) {
		this.incomeTax = incomeTax;
	}
	public EmployeeVo(int empid, String empname, double annualIncome) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.annualIncome = annualIncome;
		
	}
	@Override
	public String toString() {
		return "EmployeeVo [empid=" + empid + ", empname=" + empname + ", annualIncome=" + annualIncome + ", incomeTax="
			+ incomeTax + "]";
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(annualIncome);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + empid;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		temp = Double.doubleToLongBits(incomeTax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVo other = (EmployeeVo) obj;
		if (Double.doubleToLongBits(annualIncome) != Double.doubleToLongBits(other.annualIncome))
			return false;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		if (Double.doubleToLongBits(incomeTax) != Double.doubleToLongBits(other.incomeTax))
			return false;
		return true;
	}
	
}
