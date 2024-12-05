package Demo.app.Register;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Demo.app.Entity.Student;
import Demo.app.Exception.NotFountException;
import Demo.app.Repository.Repo;

@Service
public class Regi {

	@Autowired
	Repo repo;
	
	public Student Value(Student ss)
	{
		return this.repo.save(ss);
	}
	public List<Student> All(Student stud)
	{
		return this.repo.findAll();
	}
	public Student newValue(Integer id,Student stud)
	{
	  Student oldRecords=this.repo.findById(id)
			  .orElseThrow(()->new NotFountException("user not Found"));
			  oldRecords.setName(stud.getName());
			  oldRecords.setEmail(stud.getEmail());
			  oldRecords.setAddress(stud.getAddress());
			  return this.repo.save(oldRecords);
	}
	public String ClearData(Integer ss)
	{
		this.repo.deleteById(ss);
		return "Records Deleted";
	}
}
