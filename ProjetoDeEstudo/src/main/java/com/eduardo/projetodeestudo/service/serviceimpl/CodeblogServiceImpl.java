package com.eduardo.projetodeestudo.service.serviceimpl;

import com.eduardo.projetodeestudo.model.Post;
import com.eduardo.projetodeestudo.repository.CodeblogRepository;
import com.eduardo.projetodeestudo.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CodeblogServiceImpl implements CodeblogService {

    @Autowired
    CodeblogRepository codeblogRepository;

    @Override
    public List<Post> findAll() {
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }
}
