public class Song {
    private String title;
    private Artist artist;
    private int songLength;

    public Song(String title, int songLength, Artist artist) {
        this.title = title;
        this.songLength = songLength;
        this.artist = artist;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }

    public Artist getArtist() {
        return artist;
    }
    public int getSongLength() {
        return songLength;
    }
    public String toString() {
        return title + " - " + artist.toString() + " : " + songLength + " seconds";
    }
}
