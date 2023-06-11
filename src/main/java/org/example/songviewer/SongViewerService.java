package org.example.songviewer;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SongViewerService {

    private final List<SongFetchable> songFetchable;

    SongViewerService(List<SongFetchable> songFetchable) {
        this.songFetchable = songFetchable;
    }

//    private final SongFetchable songFetchable;
//
//    SongViewerService(SongFetchable songFetchable) {
//        this.songFetchable = songFetchable;
//    }

    public List<Song> viewAllSongs() {
        List<Song> songsToView = new ArrayList<>();
        songFetchable.forEach(
                songService -> songsToView.addAll(songService.fetchAllSongs())
        );
//        songsToView.addAll(songFetchable.fetchAllSongs());
        return songsToView;
    }
}
