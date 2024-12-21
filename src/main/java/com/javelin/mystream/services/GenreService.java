package com.javelin.mystream.services;

import com.javelin.mystream.models.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService {

    List<Genre> findAllGenre();

    Optional<Genre> findGenreById(Long id);

    Genre saveGenre(Genre genre);
}
