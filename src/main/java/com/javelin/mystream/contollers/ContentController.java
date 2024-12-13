package com.javelin.mystream.contollers;

import com.javelin.mystream.models.Content;
import com.javelin.mystream.services.ContentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("content")
public class ContentController {

    @Autowired
    private ContentServiceImpl contentService;

    @GetMapping("contents")
    public List<Content> getAllContent(){
        return contentService.findAllContent();
    }

    @GetMapping("{id}")
    public Optional<Content> getContentById(@PathVariable Long id){
        return contentService.findContentById(id);
    }

    @PostMapping("save")
    public Content saveContent(@RequestBody Content content){
        return contentService.saveContent(content);
    }
}
