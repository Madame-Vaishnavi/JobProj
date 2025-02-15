package com.chingu.jobproj.repository;

import com.chingu.jobproj.model.Post;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;
import org.bson.Document;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class searchRepoImpl implements SearchRepository{

    @Autowired
    MongoClient mongoClient;

    @Autowired
    MongoConverter mongoConverter;

    @Override
    public List<Post> findByText(String text) {
        final List<Post> posts = new ArrayList<Post>();
        MongoDatabase database = mongoClient.getDatabase("vaishnavi");
        MongoCollection<Document> collection = database.getCollection("JobPost");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text",
                                new Document("query", text)
                                        .append("path", Arrays.asList("techs", "desc")))),
                new Document("$sort",
                        new Document("exp", 1L)),
                new Document("$limit", 3L)));

        result.forEach(document -> posts.add(mongoConverter.read(Post.class, document)));

        return posts;
    }
}
