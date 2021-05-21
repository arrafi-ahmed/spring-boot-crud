package com.example.demo.services;

import com.example.demo.models.Topic;
import com.example.demo.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        List<Topic> topics=new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic createTopic(Topic topic){
        return topicRepository.save(topic);
    }

    public Optional<Topic> getTopic(String id){return topicRepository.findById(id);}

    public Topic updateTopic(Topic topic, String id){return topicRepository.save(topic);}

    public void deleteTopic(String id){ topicRepository.deleteById(id);}
}
