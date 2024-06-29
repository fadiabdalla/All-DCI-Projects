package interfaces_music_streaming_exercise;

public class StreamingService implements MusicPlayer {

    private String currentlyPlayingSong;
    private String playbackStatus;

    @Override
    public void play(String song) {
        currentlyPlayingSong = song;
        playbackStatus = "Streaming";
        System.out.println("Streaming song: " + currentlyPlayingSong + " (Status: " + playbackStatus + ")");
    }

    @Override
    public void pause() {
        playbackStatus = "Paused";
        System.out.println("Streaming is paused. (Status: " + playbackStatus + ")");
    }

    @Override
    public void stop() {
        playbackStatus = "Stopped";
        System.out.println("Streaming has stopped. (Status: " + playbackStatus + ")");
    }
}