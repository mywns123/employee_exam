package employee_exam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ContextDataSource.class, ContextSqlSession.class , MvcConfig.class })
@ComponentScan(basePackages = {
		"employee_exam.mappers",
		"employee_exam.service",
		"employee_exam.controller"})
public class ContextRoot {

	
}
