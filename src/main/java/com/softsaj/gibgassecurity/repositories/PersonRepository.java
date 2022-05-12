
package com.softsaj.gibgassecurity.repositories;

import com.softsaj.gibgassecurity.models.Person;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcos
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    
     Optional<Person> findPersonById(Integer id);
     
     void deletePersonById(Integer id);
}