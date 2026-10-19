import java.sql.SQLOutput;

class music {
    private String songName;
    public void setSongName(String songName){
        this.songName = songName;
    }
    public String getSongName(){
        return songName;
    }
}
public class musicPlayer {
    static void main(String[] args) {
        music m = new music();
        m.setSongName("BITCH ");
        System.out.println("Song name = "+ m.getSongName());
    }
}

