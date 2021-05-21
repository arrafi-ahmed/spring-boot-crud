package com.example.demo.repositories;

import com.example.demo.models.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {
}
