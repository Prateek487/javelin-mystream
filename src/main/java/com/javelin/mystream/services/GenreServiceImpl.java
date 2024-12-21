package com.javelin.mystream.services;

import com.javelin.mystream.models.Genre;
import com.javelin.mystream.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreServiceImpl implements GenreService{

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public List<Genre> findAllGenre() {
        return genreRepository.findAll();
    }

    @Override
    public Optional<Genre> findGenreById(Long id) {
        return genreRepository.findById(id);
    }

    @Override
    public Genre saveGenre(Genre genre){
        return genreRepository.save(genre);
    }
}
