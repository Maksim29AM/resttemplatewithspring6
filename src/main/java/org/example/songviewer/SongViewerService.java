package org.example.songviewer;

import java.util.ArrayList;
import java.util.List;
import org.example.itunes.proxy.ItunesResult;
import org.example.itunes.service.ItunesService;
import org.example.sampleshawnmendes.service.ShawnMendesService;
import org.springframework.stereotype.Service;

@Service
public class SongViewerService {

    private final ItunesService itunesService;
    private final ShawnMendesService shawnMendesService;

    SongViewerService(ItunesService itunesService, ShawnMendesService shawnMendesService) {
        this.itunesService = itunesService;
        this.shawnMendesService = shawnMendesService;
    }

    public List<Song> viewAllSongs() {
        List<Song> songsToView = new ArrayList<>();
        List<ItunesResult> itunesResults = itunesService.fetchShawnMendesSongsFromItunes();
        String songs = shawnMendesService.fetchAllShawnMendesSongsFromLocalhost();
        itunesResults.forEach(
                        itunesResult -> songsToView.add(new Song(itunesResult.trackName()))
        );
        songsToView.add(new Song(songs));
        return songsToView;
    }
}
