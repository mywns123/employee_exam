package employee_exam.dto;

public class Department {

	private int deptNo;
	private String deptName;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int deptNo) {
		this.deptNo = deptNo;
	}

	public Department(int deptNo, String deptName) {
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return String.format("Department [deptNo=%s, deptName=%s]", deptNo, deptName);
	}

}
