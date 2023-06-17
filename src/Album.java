import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Album {
    private String title;
    private String artist;
    private List<Song> songsList;
    public Album(){

    }

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songsList = new ArrayList<>();
    }

    public Album(String title, String artist, List<Song> songsList) {
        this.title = title;
        this.artist = artist;
        this.songsList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongList() {
        return songsList;
    }

    public void setSongList(List<Song> songList) {
        this.songsList = songList;
    }
    public String addSong(Song song){
        if(this.findSong(song)) {
            return "Song Already Exists";
        }
        songsList.add(song);
        return "Song Added Successfully";
    }

    private boolean findSong(Song songToFind) {
        for(Song song: songsList){
            if(song.getName().equals(songToFind.getName())) {
                return true;
            }
        }
        return false;
    }

    public Optional<Song> searchSong(String songName) {
        for(Song song: songsList){
            if(song.getName().equals(songName)) {
                return Optional.of(song);
            }
        }
        return Optional.empty();
    }
}
