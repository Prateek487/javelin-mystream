package com.javelin.mystream.contollers;

import com.javelin.mystream.models.Genre;
import com.javelin.mystream.services.GenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("genre")
public class GenreController {

    @Autowired
    private GenreServiceImpl  genreService;

    @GetMapping("genres")
    public List<Genre> getAllGenres(){
        return genreService.findAllGenre();
    }

    @GetMapping("{id}")
    public Optional<Genre> getGenreById(@PathVariable Long id){
        return genreService.findGenreById(id);
    }

    @PostMapping("save")
    public Genre saveGenre(@RequestBody Genre genre){
        return genreService.saveGenre(genre);
    }
}
