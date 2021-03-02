package com.shakhzod.blog.repo;

import com.shakhzod.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>
{



}
