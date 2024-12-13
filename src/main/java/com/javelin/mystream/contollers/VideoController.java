package com.javelin.mystream.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import com.javelin.mystream.models.Video;

import com.javelin.mystream.services.VideoServiceImpl;

@RestController
@RequestMapping("video")
public class VideoController {

    @Autowired
    private VideoServiceImpl videoService;

    @GetMapping("videos")
    public List<Video> getAllVideos(){
        return videoService.findAllVideos();
    }

    @GetMapping("{id}")
    public Optional<Video> getAllVideos(@PathVariable Long id){
        return videoService.findVideo(id);
    }

    @PostMapping("save")
    public Video saveVideo(@RequestBody Video video){
        return videoService.saveVideo(video);
    }
}
