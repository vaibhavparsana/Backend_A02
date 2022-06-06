package com.example.assignment02.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment02.model.Album;
import com.example.assignment02.service.AlbumService;

@RestController
@RequestMapping("/api")
public class AlbumResource {
    @Autowired
    private AlbumService albumService;

    @GetMapping("/album")
    public Album getAlbum() {
        return albumService.getAlbum();
    }

    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album) {
       return albumService.saveAlbum(album);   
    }

    @GetMapping("/album/{albumId}")
    public Album getAlbumbyId(@PathVariable("albumId") int albumId){
        return albumService.getAlbumById(albumId);
    }

    @PutMapping("/album/{albumId}")
    public Album updateAlbum(@PathVariable("albumId") int albumId, @RequestBody Album album) {
        return albumService.updateAlbum(albumId, album);
    }
    

    @DeleteMapping("/album") 
    public Album deleteAlbum(@RequestParam("albumId") int albumId){
        return albumService.deleteAlbum(albumId);
    } 
}
