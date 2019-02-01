package guru.springframework.spring5webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.spring5webapp.model.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
