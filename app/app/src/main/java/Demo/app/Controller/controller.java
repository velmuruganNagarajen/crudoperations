package Demo.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Demo.app.Entity.Student;
import Demo.app.Register.Regi;

@RestController
@CrossOrigin
@RequestMapping("/Welcome")
public class controller {

	@Autowired
	Regi regi;
	@PostMapping("/AddValue")
	public Student Data(@RequestBody Student ss)
	{
		return this.regi.Value(ss);
	}
	@GetMapping("/GetData")
	public List<Student> GetAll(Student ss)
	{
		return this.regi.All(ss);
	}
	@PutMapping("/Change/{id}")
	public Student Updatevalue(@PathVariable (value ="id" )Integer ss
			,@RequestBody Student Stud)
	{
		return this.regi.newValue(ss, Stud);
	}
	@DeleteMapping("/Delete/{id}")
	public String Clear(@PathVariable (value="id")Integer ss)
	{
		this.regi.ClearData(ss);
		return "Records Deleted";
	}
}
