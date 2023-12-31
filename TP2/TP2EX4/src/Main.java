public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Queen");
        Artist artist2 = new Artist("The Beatles");
        Artist artist3 = new Artist("The Rolling Stones");
        Artist artist4 = new Artist("The Who");
        Artist artist5 = new Artist("Pink Floyd");
        Song song1 = new Song("Bohemian Rhapsody", 355, artist1);
        Song song2 = new Song("Another One Bites the Dust", 216, artist1);
        Song song3 = new Song("We Will Rock You", 122, artist1);
        Song song4 = new Song("Hey Jude", 431, artist2);
        Song song5 = new Song("Yesterday", 124, artist2);
        Song song6 = new Song("Let It Be", 243, artist2);
        Song song7 = new Song("Gimme Shelter", 272, artist3);
        Song song8 = new Song("Paint It Black", 226, artist3);
        Song song9 = new Song("Sympathy for the Devil", 382, artist3);


        Album album1 = new Album("Album 1");
        album1.addSong("Bohemian Rhapsody", artist1, 355);
        album1.addSong("Another One Bites the Dust", artist1, 216);
        album1.addSong("We Will Rock You", artist1, 122);
        album1.addSong("Hey Jude", artist2, 431);
        PremiumUser user = new PremiumUser("issra", "issra.brini@gmail.com", "1234");
        user.addSongToPlaylist(song1);
        user.addSongToPlaylist(song2);
        user.addSongToPlaylist(song3);
        user.printPlaylist();
        user.shuffle();
        FreeUser user1 = new FreeUser("amin", "amin@gmail.com", "1234");
        user1.addSongToPlaylist(song3);
        user1.addSongToPlaylist(song4);
        user1.addSongToPlaylist(song5);
        user1.printPlaylist();
        user1.shuffle();



    }
}