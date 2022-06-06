package com.example.assignment02.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment02.model.Album;
import com.example.assignment02.repository.AlbumRepository;


@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;
    public Album getAlbum() {
        return albumRepository.getAlbum();
    }

    public Album saveAlbum(Album album) {
        return albumRepository.saveAlbum(album);
    }

    public Album getAlbumById(int albumId) {
        return albumRepository.getAlbumById(albumId);
    }

    public Album updateAlbum(int albumId, Album album) {
        return albumRepository.updateAlbum(albumId, album);
    }

    public Album deleteAlbum(int albumId) {
        return albumRepository.deleteAlbum(albumId);
    }
    
}
