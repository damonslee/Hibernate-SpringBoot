package com.bookstore.repository;

import com.bookstore.dto.AuthorDto;
import java.util.List;
import com.bookstore.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;

@Repository
@Transactional(readOnly = true)
public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query(nativeQuery = true)
    List<String> fetchByName();

    @Query(nativeQuery = true)
    List<AuthorDto> fetchNameAndAge();
}
