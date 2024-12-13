package com.javelin.mystream.services;

import com.javelin.mystream.models.Content;

import java.util.List;
import java.util.Optional;

public interface ContentService {
    Content saveContent(Content content);

    List<Content> findAllContent();

    Optional<Content> findContentById(Long id);
}
