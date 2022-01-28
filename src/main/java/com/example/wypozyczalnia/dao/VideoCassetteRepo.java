package com.example.wypozyczalnia.dao;

import com.example.wypozyczalnia.dao.entity.VideoCassette;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoCassetteRepo  extends CrudRepository <VideoCassette,Long> {
}
