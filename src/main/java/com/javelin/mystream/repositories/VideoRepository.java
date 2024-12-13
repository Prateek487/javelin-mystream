package com.javelin.mystream.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javelin.mystream.models.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
}
