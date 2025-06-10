package p10designpattern;

//Target Interface
interface Media {
	void play(String filename);
}

//Adaptee class
class LegacyAudioPlayer {
	void playAudio(String filename) {
		System.out.println("Playing audio file: " + filename);
	}
}

//Adapter class
class AudioAdapter implements Media {
	private LegacyAudioPlayer legacyAudioPlayer;

	public AudioAdapter(LegacyAudioPlayer legacyAudioPlayer) {
		this.legacyAudioPlayer = legacyAudioPlayer;
	}

	@Override
	public void play(String filename) {
		legacyAudioPlayer.playAudio(filename);
	}
}

public class P5Adapter {
	public static void main(String[] args) {
		// Create an instance of the Adaptee
		LegacyAudioPlayer legacyAudioPlayer = new LegacyAudioPlayer();

		// Create an Adapter for the Adaptee
		Media mediaPlayer = new AudioAdapter(legacyAudioPlayer);

		// Client code uses the Target interface
		mediaPlayer.play("song.mp3");
	}
}
