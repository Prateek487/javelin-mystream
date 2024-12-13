package com.javelin.mystream.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.javelin.mystream.repositories.VideoRepository;

import com.javelin.mystream.models.Video;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoRepository videoRepository;

    @Override
    public List<Video> findAllVideos(){
        return videoRepository.findAll();
    }

    @Override
    public Optional<Video> findVideo(Long id) {
        return videoRepository.findById(id);
    }

    @Override
    public Video saveVideo(Video video) {
        return videoRepository.save(video);
    }
}
