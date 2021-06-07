package employee_exam.mappers;

import java.util.List;

import org.springframework.stereotype.Component;

import employee_exam.dto.Employee;



@Component
public interface EmployeeMapper {

	List<Employee> selectEmployeeByAll();

	Employee selectbyId(int empNo);

	int insertEmployee(Employee employee);

	int updateEmployee(Employee employee);

	int deleteEmployee(Employee employee);

}
