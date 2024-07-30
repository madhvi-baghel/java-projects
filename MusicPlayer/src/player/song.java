package player;
public class song {
	private int song_id;
	private String name;
	private String singer;
	private String movie_album;
	private double duration;
	public int getSong_id() {
		return song_id;
	}
	public void setSong_id(int song_id) {
		this.song_id = song_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getMovie_album() {
		return movie_album;
	}
	public void setMovie_album(String movie_album) {
		this.movie_album = movie_album;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "song [song_id=" + song_id + ", name=" + name + ", singer=" + singer + ", movie_album=" + movie_album
				+ ", duration=" + duration + "]";
	}
	
    
}
