package com.javelin.mystream.services;

import com.javelin.mystream.models.Content;
import com.javelin.mystream.repositories.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContentServiceImpl implements ContentService{

    @Autowired
    private ContentRepository contentRepository;

    @Override
    public Content saveContent(Content content) {
        return contentRepository.save(content);
    }

    @Override
    public List<Content> findAllContent() {
        return contentRepository.findAll();
    }

    @Override
    public Optional<Content> findContentById(Long id) {
        return contentRepository.findById(id);
    }
}
