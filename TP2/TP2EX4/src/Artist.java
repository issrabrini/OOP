import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Album> albums;
    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<Album>();
    }
    public String getName() {
        return name;
    }
    public void addAlbum(String albumName) {
        if (!findAlbum(albumName)) {
            this.albums.add(new Album(albumName));
        }
    }
    private boolean findAlbum(String albumName) {
        return albums.contains(albumName);
    }
    public void removeAlbum(String albumName) {
        if (findAlbum(albumName)) {
            this.albums.remove(albumName);
        }
    }
    public String printAlbums() {
        for (Album album : albums) {
            return(album.printSongs());
        }
        return null;
    }
    public String toString() {
        return this.name;
    }
}
