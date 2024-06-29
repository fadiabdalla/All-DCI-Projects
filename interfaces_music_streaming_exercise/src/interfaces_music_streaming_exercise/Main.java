package interfaces_music_streaming_exercise;

public class Main {

	public static void main(String[] args) {

		MusicPlayer mediaPlayer = new MediaPlayer();
		MusicPlayer streamingService = new StreamingService();
		
		mediaPlayer.play("Real Love");
		mediaPlayer.pause();
		mediaPlayer.stop();
		
		
		streamingService.play("She is gone");
		streamingService.pause();
		streamingService.stop();
		
		
	}

}
