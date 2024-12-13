package com.javelin.mystream.services;

import com.javelin.mystream.models.Video;

import java.util.List;
import java.util.Optional;

public interface VideoService {
    List<Video> findAllVideos();

    Optional<Video> findVideo(Long id);

    Video saveVideo(Video video);
}
