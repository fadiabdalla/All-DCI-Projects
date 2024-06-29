package interfaces_music_streaming_exercise;

public class MediaPlayer implements MusicPlayer {

    private String currentlyPlayingSong;
    private String playbackStatus;


    @Override
    public void play(String song) {
        currentlyPlayingSong = song;
        playbackStatus = "Playing";
        System.out.println("Playing song: " + currentlyPlayingSong + " (Status: " + playbackStatus + ")");
    }

    @Override
    public void pause() {
        playbackStatus = "Paused";
        System.out.println("The song is paused. (Status: " + playbackStatus + ")");
    }

    @Override
    public void stop() {
        playbackStatus = "Stopped";
        System.out.println("The playback is stopped. (Status: " + playbackStatus + ")");
    }
}