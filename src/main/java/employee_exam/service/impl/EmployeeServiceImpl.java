package employee_exam.service.impl;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employee_exam.dto.Employee;
import employee_exam.exception.DuplicateEmployeeException;
import employee_exam.mappers.EmployeeMapper;
import employee_exam.service.EmployeeService;




@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final Log log = LogFactory.getLog(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeMapper mapper;

	@Override
	public List<Employee> getLists() {
		List<Employee> list = mapper.selectEmployeeByAll();
		log.debug("service - list() > " + list.size());
		return list;
	}

	@Override
	public Employee getEmployee(int empNo) {
		log.debug("service - list() > " + empNo);
		return mapper.selectbyId(empNo);
	}

	@Override
	public int resisterEmployee(Employee employee) {
		Employee emp = mapper.selectbyId(employee.getEmpNo());
		if (emp != null) {
			throw new DuplicateEmployeeException(employee.getEmpNo() +"중복입니다.");
		}
		
		log.debug("service - list() > " + employee);
		return mapper.insertEmployee(employee);
	}

	@Override
	public int modifyEmployee(Employee employee) {
		log.debug("service - list() > " + employee);
		return mapper.updateEmployee(employee);
	}

	@Override
	public int removeEmployee(Employee employee) {
		log.debug("service - list() > " + employee);
		return mapper.deleteEmployee(employee);
	}

}
