import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;
    private String albumName;
    private Artist artist;
    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new ArrayList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void addSong(String title, Artist artist, int songLength) {
        if (!findSong(title)&&artist.equals(this.artist)) {
            this.songs.add(new Song(title, songLength, artist));
        }
    }

    private boolean findSong(String title) {
        return songs.contains(title);
    }
    public void removeSong(String title) {
        if (findSong(title)) {
            this.songs.remove(title);
        }
    }
    public String printSongs() {
        for (Song song : songs) {
            return(song.toString());
        }
        return null;
    }
}
