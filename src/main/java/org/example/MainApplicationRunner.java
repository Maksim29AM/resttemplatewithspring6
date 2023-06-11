package org.example;

import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.example.songviewer.Song;
import org.example.songviewer.SongViewerService;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class MainApplicationRunner {

    private final SongViewerService songViewerService;

    MainApplicationRunner(SongViewerService songViewerService) {
        this.songViewerService = songViewerService;
    }

    public void run() {
        List<Song> songs = songViewerService.viewAllSongs();
        log.info(songs);
    }
}
