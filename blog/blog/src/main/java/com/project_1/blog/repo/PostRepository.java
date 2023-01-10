package com.project_1.blog.repo;

import org.springframework.data.repository.CrudRepository;

import com.project_1.blog.models.Post;

public interface PostRepository  extends CrudRepository<Post, Long>{
    
}
