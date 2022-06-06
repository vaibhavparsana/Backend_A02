package com.example.assignment02.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.assignment02.model.Album;

@Repository
public class AlbumRepository {
    
    List<Album> albumList = new ArrayList();

    public Album getAlbum() {
        Album album = new Album(23456, "White House", "A song sung by singer", "whiteHouse.png" );
        return album;
    }

    public Album saveAlbum(Album album) {
        album.setAlbumId(albumList.size() + 1);
        albumList.add(album);
        return album;
    }

   

    public Album getAlbumById(int albumId) {
        for(Album album:albumList) {
            if(album.getAlbumId() == albumId) {
                return album;
            }
        }
        return null;
    }

    public Album updateAlbum(int albumId, Album album) {
        for(Album alm:albumList) {
            if(alm.getAlbumId() == albumId) {
                alm.setName(album.getName());
                alm.setCoverPicUrl(album.getCoverPicUrl());
                alm.setDescription(album.getDescription());            
                return alm;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;
        for(Album album:albumList) {
            if(album.getAlbumId() == albumId) {
                deletedAlbum = album;
                albumList.remove(album);
                return deletedAlbum;
            }
        }
        return deletedAlbum;
    }

    
}
