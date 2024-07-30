package music_player_jdbc.com.music_player;

public class song {
	private static int id;
	private static String singer;
	private static String album;
	private static long duration;

	public static int getId() {
		return id;
	}

	public static String getSinger() {
		return singer;
	}

	public static String getAlbum() {
		return album;
	}

	public static long getDuration() {
		return duration;
	}

	public static void setId(int id) {
		song.id = id;
	}

	public static void setSinger(String singer) {
		song.singer = singer;
	}

	public static void setAlbum(String album) {
		song.album = album;
	}

	public static void setDuration(long duration) {
		song.duration = duration;
	}

}
