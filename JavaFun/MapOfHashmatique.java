import java.util.HashMap;
public class MapOfHashmatique{
        // TrackHashMap 
        static HashMap<String, String> tracklist = new HashMap();
        public static void main(String[] args){
        // adding  track list    
        tracklist.put("Higher We Go ", "I'ma put these racks in your face");
        tracklist.put("Supaster", "Brand new cars (skrrt, yeah), we buy the bar now (woo)");
        tracklist.put("Narcos", "Trapping like the narco (narco) got dope like Pablo (Pablo)");
        tracklist.put("BBO", "AP on me, iced out, tennis chains, iced out (ice)Whole pointers 'round my neck, lookin' like a lighthouse (shine)");
        // pull out one sone BBO
        String pulledOutSong = tracklist.get("BBO");
        // Display in the console 
        System.out.println("Pulled Out Song:  " + pulledOutSong);

        // loops
        // HashMap. Entry  Need to be in my for loop
        // tells the for loop what data type
        // entrySet() get keys and values
        // display  Title and lyric of the hashMap
        for(HashMap.Entry<String,String> track:  tracklist.entrySet()){
            System.out.println(" Title : " + track.getKey() + " Lyrics:" + track.getValue());
        }

    }
}