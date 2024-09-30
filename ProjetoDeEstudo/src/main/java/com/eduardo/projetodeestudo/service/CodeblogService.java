package com.eduardo.projetodeestudo.service;

import com.eduardo.projetodeestudo.model.Post;

import java.util.List;

public interface CodeblogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
