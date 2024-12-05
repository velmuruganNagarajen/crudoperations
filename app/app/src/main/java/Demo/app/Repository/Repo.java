package Demo.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Demo.app.Entity.Student;

@Repository
public interface Repo extends JpaRepository<Student, Integer> {


}
