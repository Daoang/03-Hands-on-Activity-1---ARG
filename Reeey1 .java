import java.util.LinkedList;

public class Reeey1 {
    public static void main(String[] args){
        // Name of the songs
        LinkedList songs = new LinkedList();
        songs.add("Maybe this time"); // 1
        songs.add("Palagi"); // 2
        songs.add("Huling Sandali"); // 3
        songs.add("Pagsamo"); // 4
        songs.add("Kundiman"); // 5
        
        // Name of the artists
        LinkedList artists = new LinkedList();
        artists.add("Michael Martin Murphey"); // 1
        artists.add("TJ Monterde"); // 2
        artists.add("December Avenue"); // 3
        artists.add("Arthur Nery"); // 4
        artists.add("Silent Sanctuary"); // 5
        
        
        LinkedList playlist = new LinkedList();
        for (int i = 0; i < songs.size(); i++) {
            playlist.add(songs.get(i) + " - " + artists.get(i));
        }
        
       
        System.out.println(songs);
        System.out.println(artists);
        
        
        for (Object song : playlist) {
            System.out.println(song);
        }
    }
}
