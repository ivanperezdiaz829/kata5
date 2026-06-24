package software.ulpgc.kata5.application.bee;

import software.ulpgc.kata5.application.Desktop;
import software.ulpgc.kata5.application.RemoteStore;
import software.ulpgc.kata5.application.TsvMovieParser;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Desktop.create(new RemoteStore(TsvMovieParser::from)).display().setVisible(true);
    }
}