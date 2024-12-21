package com.javelin.mystream.contollers;

import com.javelin.mystream.models.*;
import com.javelin.mystream.repositories.GenreRepository;
import com.javelin.mystream.services.ContentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("content")
public class ContentController {

    @Autowired
    private ContentServiceImpl contentService;
    @Autowired
    private GenreRepository genreRepository;

    @GetMapping("contents")
    public List<Content> getAllContent(){
        return contentService.findAllContent();
    }

    @GetMapping("{id}")
    public Optional<Content> getContentById(@PathVariable Long id){
        return contentService.findContentById(id);
    }

    @PostMapping("save")
    public Content saveContent(@RequestBody ContentDTO contentDTO){
        Content content = new Content();

        content.setName(contentDTO.getName());
        content.setDescription(contentDTO.getDescription());
        content.setType(contentDTO.getType());
        content.setReleaseDate(contentDTO.getReleaseDate());
        content.setImage(contentDTO.getImage());
        content.setDetail(contentDTO.getDetail());

        Set<Genre> genres = contentDTO.getGenres().stream().map(genreDTO -> {
            return genreRepository.findById(genreDTO.getId()).orElseGet(() -> {
                Genre genre = new Genre();
                genre.setName(genreDTO.getName());
                return genreRepository.save(genre);
            });
        }).collect(Collectors.toSet());

        content.setGenres(genres);

        return contentService.saveContent(content);
    }
}
