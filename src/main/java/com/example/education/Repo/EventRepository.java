package com.example.education.Repo;

import com.example.education.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EventRepository  extends JpaRepository<Event,Integer> {
}
