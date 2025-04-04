import java.util.ArrayList;

public class MusicLibrary {


    private ArrayList<String> tracks;
    private ArrayList<String> playlists;

    public MusicLibrary() {
        this.tracks = new ArrayList<>();
        this.playlists = new ArrayList<>();

    }

    public void addTrack(String track) {
        if (!tracks.contains(track)) {
            tracks.add(track);

        } else{
            System.out.println("Track already exists in this library");
        }

    }
    public void createPlaylist(String playlist) {
        if (!playlists.contains(playlist)) {
            playlists.add(playlist);

        }else {
            System.out.println("Playlist already exists in this library");
        }
    }
    public void removeTrack(String track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("Track does not exist in this library");
        }
    }


    public void removePlaylist(String playlist) {
        if (playlists.contains(playlist)) {
            playlists.remove(playlist);

        } else {
            System.out.println("Playlist does not exist in this library");

        }
    }

    public void searchTracks(String search) {
        System.out.println("Searching for " + search);
        for (String track : tracks) {
            if (track.toLowerCase().contains(search.toLowerCase())) {
                System.out.println(track);
            }
        }
    }
}

//createPlaylist - creates a new playlist (checks existence using a loop)
//findPlaylist - helper method to find a playlist by name (uses a loop)
//addTrackToPlaylist - adds a track to a specific playlist
//displayPlaylist - displays the contents of a playlist
//displayAllPlaylists - displays a list of all playlists using a for-each loop
//In the example in the main method, we show how to