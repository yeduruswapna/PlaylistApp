import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Album album1= new Album("Gloria", "Sam Smith");

//        Song song1= new Song("Unholy", "Sam Smith", 2);
//        album1.addSong(song1);
        album1. addSong(new Song("Unholy", "Sam Smith", 2));
        album1. addSong(new Song("Perfect", "Sam Smith", 3));
        album1. addSong(new Song("Gloria", "Sam Smith", 2));

        Album album2= new Album("Honestly", "Nevermind");

        album2. addSong(new Song("Her Loss", "Drake", 1));
        album2. addSong(new Song("Views", "Drake", 1));
        album2. addSong(new Song("Take Care", "Drake", 2));

        Playlist myPlayList= new Playlist(("myPlayList"));

        myPlayList.addSongFromAlbum(album1, "Unholy");
        myPlayList.addSongFromAlbum(album1, "Gloria");
        myPlayList.addSongFromAlbum(album2, "Her Loss");
        myPlayList.addSongFromAlbum(album2, "Take Care");

        System.out.println(myPlayList.playCurrentSong());
        System.out.println(myPlayList.playPrevious());
        System.out.println(myPlayList.playNext());
        System.out.println(myPlayList.playNext());
        System.out.println(myPlayList.playPrevious());
        System.out.println(myPlayList.playNext());
    }
}