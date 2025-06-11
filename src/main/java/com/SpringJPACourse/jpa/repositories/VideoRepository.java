package com.SpringJPACourse.jpa.repositories;

import com.SpringJPACourse.jpa.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
