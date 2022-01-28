package com.example.wypozyczalnia.manager;

import com.example.wypozyczalnia.dao.VideoCassetteRepo;
import com.example.wypozyczalnia.dao.entity.VideoCassette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VideoCassetteManager {

    private VideoCassetteRepo videoCassetteRepo;

    @Autowired
    public VideoCassetteManager(VideoCassetteRepo videoCassetteRepo) {
        this.videoCassetteRepo = videoCassetteRepo;
    }

    public Optional <VideoCassette> findById(long id) {
        return videoCassetteRepo.findById(id);
    }

    public Iterable <VideoCassette> findAll() {
        return videoCassetteRepo.findAll();
    }

    public VideoCassette save(VideoCassette videoCassette) {
        return videoCassetteRepo.save(videoCassette);
    }

    public void deleteById(long id) {
        videoCassetteRepo.deleteById(id);
    }

    @EventListener (ApplicationReadyEvent.class)
    public void fillDB() {
        save(new VideoCassette(1L,"The Fast and the Furious", LocalDate.of(2001,6,18)));
        save(new VideoCassette(2L,"2 Fast 2 Furious", LocalDate.of(2003,6,3)));
        save(new VideoCassette(3L,"The Fast and the Furious: Tokyo Drift", LocalDate.of(2006,6,4)));
        save(new VideoCassette(4L,"Fast & Furious", LocalDate.of(2009,4,3)));
        save(new VideoCassette(5L,"Fast Five", LocalDate.of(2011,4,15)));
        save(new VideoCassette(6L,"Fast Furious 6", LocalDate.of(2013,5,22)));
        save(new VideoCassette(7L,"Furious Seven", LocalDate.of(2015,3,16)));
        save(new VideoCassette(8L,"The Fate of the Furious", LocalDate.of(2017,4,14)));
        save(new VideoCassette(9L,"F9", LocalDate.of(2021,5,19)));
    }
}
