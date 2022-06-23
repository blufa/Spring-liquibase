package sn.vision.liquibase;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {

    // @Query("SELECT s.name FROM Student s WHERE s.name LIKE %:studentName%")
   Student findByName(String studentName);
}
