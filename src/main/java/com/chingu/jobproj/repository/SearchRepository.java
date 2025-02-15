package com.chingu.jobproj.repository;

import com.chingu.jobproj.model.Post;

import java.util.List;

public interface SearchRepository {
    public List<Post> findByText(String text);
}
