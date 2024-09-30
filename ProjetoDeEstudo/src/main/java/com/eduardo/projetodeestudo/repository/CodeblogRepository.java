package com.eduardo.projetodeestudo.repository;

import com.eduardo.projetodeestudo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {
}
