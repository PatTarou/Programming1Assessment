import java.io.File;
import java.io.LineNumberReader;

public class duration{
    int hours;
    int minutes;
    int seconds;

    public duration(int hour, int minute, int second) {
        hours = hour;
        minutes = minute;
        seconds = second;
    }

    public int getHour(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    public static void main(String[] args) {
        File textFile = new File("albums.txt");
        long fileLength = textFile;
        System.out.println(fileLength);
    }
}
