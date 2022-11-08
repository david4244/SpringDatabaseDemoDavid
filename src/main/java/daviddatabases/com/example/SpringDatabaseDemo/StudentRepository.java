package daviddatabases.com.example.SpringDatabaseDemo;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
