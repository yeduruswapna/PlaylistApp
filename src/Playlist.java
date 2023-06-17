import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class Playlist {
    private String title;
    private List<Song>songs;
    private ListIterator<Song> itr;
    private boolean wasNext;

    public Playlist(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
        this.itr= songs.listIterator();
        this.wasNext= false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
    public String addSongFromAlbum(Album album, String songName){
        //check whether song exists in album, and store result in optional
        Optional<Song> songOptional = album.searchSong(songName);
        if(songOptional.isEmpty()){
            return "Song Not Found In Album";
        }
        Song songInAlbum= songOptional.get(); // get the song from optional and add to playlist
        this.songs.add(songInAlbum);
        itr= songs.listIterator();
        return "Song Added Successfully";
    }

    public String playNext(){
        if(wasNext){

        }
        if(!wasNext) {
            wasNext = true;
            itr.next();
        }
        if(itr.hasNext()){
            wasNext=true;
            Song song= itr.next();
            return "Next Song is: " + song;
        }
        return "You Have Reached End Of Playlist";
    }

    public String playPrevious(){
        if(!wasNext){

        }
        if(wasNext) {
            wasNext = false;
            itr.previous();
        }
        if(itr.hasPrevious()){
            wasNext=false;
            Song song= itr.previous();
            return "Previous Song is: " + song;
        }
        return "You Have Reached Start Of Playlist";
    }
    public String playCurrentSong(){
        if(wasNext) {
            wasNext = false;
            return "Current Song is: " + itr.previous();
        }
        wasNext=true;
        return "Current Song is: " + itr.next();
    }
}