package guru.springframework.spring5webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.spring5webapp.model.Author;


@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
