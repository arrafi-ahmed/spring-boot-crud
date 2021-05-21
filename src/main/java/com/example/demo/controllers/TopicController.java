package com.example.demo.controllers;

import com.example.demo.models.Topic;
import com.example.demo.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){ return topicService.getTopic(id);}

    @PostMapping("/topics")
    public Topic createTopic(@RequestBody Topic topic){
        return topicService.createTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public Topic updateTopic(@RequestBody Topic topic, @PathVariable String id){
        return topicService.updateTopic(topic, id);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}