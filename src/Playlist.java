import javax.sound.midi.Track;
import java.util.ArrayList;

public class Playlist {
// contructors
    public Playlist(String name) {
        this.name=name;
        this.tracks=new ArrayList<Track>();
    }

    public String getName() {
        return name;
    }
    public void AddTrack(String track) {
        if(!tracks.contain(track)){
            tracks.add(track);//(checks if the track already exists using the contains method)
        } else{
            System.out.println("Track already added");
        }
    }

    public void RemoveTrack(String track) {
        tracks.remove(track);
    }
    //display --> forloop

    public void dispalyTracks() {
        System.out.println("Tracks in the playslist: "+name+", ");
        for (String track: tracks){
            System.out.println(track);
        }
    }


}

//using the contains method)
//removeTrack - removes a track from the main list and from all playlists (uses the
//remove method)
//displayTracks - displays all tracks using a for loop
//searchTracks - uses loops and find (filter method) to find tracks containing the
//given phrase