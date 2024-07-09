package com.example.education.Services;

import com.example.education.Repo.EventRepository;
import com.example.education.model.Citizen;
import com.example.education.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServices {
    @Autowired
    EventRepository eventRepository;

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> findAll() {
        return eventRepository.findAll();
    }
    public long countEvents(){
        return  eventRepository.count();
    }
    public void deleteEvent(Integer id){
        eventRepository.deleteById(id);
    }
    public Event updateEvent(Event event, Integer id){
        event.setId(id);
        return eventRepository.save(event);
    }
}
