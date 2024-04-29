package Structural.Facade;

import java.io.File;

public class Client {
    public static void main(String[] args) {
        Facade converter = new Facade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
