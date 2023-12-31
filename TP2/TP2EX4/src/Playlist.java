import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> playlist;
    private User owner;
    public Playlist(User owner) {
        this.owner = owner;
        this.playlist = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        if (!playlist.contains(song)) {
            this.playlist.add(song);
        }
    }

    public void removeSong(Song song) {
        if (playlist.contains(song)) {
            this.playlist.remove(song);
        }
    }

    public void printSongs() {
        for (Song song : playlist) {
            System.out.println(song.toString());
        }
    }
    public Song shuffle() {
       if(owner instanceof PremiumUser) {
           return playlist.get((int) (Math.random() * playlist.size()));
       }
       else {
           System.out.println("You need to be a premium user to shuffle your playlist");
           return playlist.get(0);
       }
    }
}
