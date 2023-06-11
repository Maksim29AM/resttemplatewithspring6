package org.example.songviewer;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SongViewerService {

    private final List<SongFetchable> services;

    SongViewerService(List<SongFetchable> services) {
        this.services = services;
    }

    public List<Song> viewAllSongs() {
        List<Song> songsToView = new ArrayList<>();
        services.forEach(
                service -> songsToView.addAll(service.fetchAllSongs())
        );
        return songsToView;
    }
}
