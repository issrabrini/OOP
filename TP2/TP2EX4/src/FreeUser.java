public class FreeUser implements User{
    private String name;
    private String email;
    private String password;
    private Playlist playlist;
    public FreeUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.playlist = new Playlist(this);
    }
    public void listenToSong(Song song) {
        System.out.println("You are listening to " + song.getTitle() + " by " + song.getArtist().getName());
    }
    public void addSongToPlaylist(Song song) {
        this.playlist.addSong(song);
    }
    public void removeSongFromPlaylist(Song song) {
        this.playlist.removeSong(song);
    }
    public void printPlaylist() {
        this.playlist.printSongs();
    }
    public Song shuffle() {
        return playlist.shuffle();
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}
