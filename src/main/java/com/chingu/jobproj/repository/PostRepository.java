package com.chingu.jobproj.repository;

import com.chingu.jobproj.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
