package employee_exam.exception;

@SuppressWarnings("serial")
public class DuplicateEmployeeException extends RuntimeException {

	public DuplicateEmployeeException(String message) {
		super(message);
	}

}
