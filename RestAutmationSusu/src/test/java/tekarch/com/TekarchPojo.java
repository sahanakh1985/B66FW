package tekarch.com;

public class TekarchPojo {

	private String accountno;
	private int departmentno;
	private double salary;
	private int pincode;

	public TekarchPojo(String accountno, int departmentno, double salary, int pincode) {
		super();
		this.accountno = accountno;
		this.departmentno = departmentno;
		this.salary = salary;
		this.pincode = pincode;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public void setDepartmentno(int departmentno) {
		this.departmentno = departmentno;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
