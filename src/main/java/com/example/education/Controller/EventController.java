package com.example.education.Controller;

import com.example.education.Services.EventServices;
import com.example.education.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/event")
public class EventController {
    @Autowired
    public EventServices eventServices;

    @PostMapping("post-event")
    public Event addEvent(@RequestBody Event event){
        return eventServices.createEvent(event);

    }


    @GetMapping("/get-event")
    public List<Event> findAll(){
        return eventServices.findAll();
}
@GetMapping("/count-event")
    public long countCitizen(){
        return eventServices.countEvents();
}
   @DeleteMapping("/event/{id}")
    public void deleteEvent(@PathVariable Integer id){
        eventServices.deleteEvent(id);
}
  @PutMapping("/update/{id}")
    public Event updateEvent(@RequestBody Event event,@PathVariable Integer id){
        event.setId(id);
        return eventServices.updateEvent(event, id);
}




}
