package employee_exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import employee_exam.dto.Employee;



@Service
public interface EmployeeService {

	List<Employee> getLists();

	Employee getEmployee(int empNo);	

	int resisterEmployee(Employee employee);

	int modifyEmployee(Employee employee);

	int removeEmployee(Employee employee);
}
