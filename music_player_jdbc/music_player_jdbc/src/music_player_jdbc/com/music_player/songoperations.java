package music_player_jdbc.com.music_player;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

public class songoperations {
	private static FileReader fr;
	private static String filepath = "E:\\WEJE3\\music_player_jdbc\\src\\music_player_jdbc\\"
			+ "com\\music_player\\db_info.properties";
	private static song s = new song();
	private static Connection conn;
	private static PreparedStatement ps;
	private static int result;
	private static Properties pr;
	private static ResultSet rs;
	private static String query;
	private static Scanner scan = new Scanner(System.in);

	static {
		try {
			fr = new FileReader(filepath);
			pr = new Properties();

			pr.load(fr);

			Class.forName(pr.getProperty("driverpath"));
			conn = DriverManager.getConnection(pr.getProperty("dburl"), pr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editsong(int l) {
		try {
			int m = allsongs();
			switch (l) {
			case 1: {
				System.out.println("enter the new singer name");
				query = "update song " + "set singer = '" + scan.next() + "' where id = ?";
				break;
			}
			case 2: {
				System.out.println("enter the new album name");
				query = "update song " + "set album = '" + scan.next() + "' where id = ?";
				break;
			}
			case 3: {
				System.out.println("enter the new duration ");
				query = "update song " + "set duration = " + scan.nextLong() + " where id = ?";
				break;
			}
			default:
				System.out.println("wrong input");
				break;
			}

			ps = conn.prepareStatement(query);
			ps.setInt(1, m);

			result = ps.executeUpdate();
			System.out.println("Songs edited");

		} catch (InputMismatchException e) {
			System.out.println("INVALID INPUT \nPLEASE TRY AGAIN");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}

	public void removesong() {
		try {
			int z = allsongs();

			int d = 0;
			query = "delete from song where id = ?";

			ps = conn.prepareStatement(query);
			ps.setInt(1, z);
			result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("Songs deleted");
			} else {
				System.out.println("song is not present");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}

	}

	public void close() {
		try {
			if (conn != null) {
				ps.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (fr != null) {
				fr.close();
			}
			if (rs != null) {
				rs.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int allsongs() {
		try {
			query = "select * from song";

			ps = conn.prepareStatement(query);

			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("press " + rs.getInt(1) + " for " + rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return scan.nextInt();
	}

	public void playallsong() {
		try {

			query = "select * from song";

			ps = conn.prepareStatement(query);

			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Song " + rs.getString(2) + " is playing now");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}

	public void choosesong() {
		try {
			int z = this.allsongs();
			query = "select * from song where id =" + z;
			ps = conn.prepareStatement(query);

			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Song " + rs.getString(2) + " is playing now");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}

	public void randomsong() {
		try {

			query = "select * from song where id = " + Math.round(10 * Math.random());

			ps = conn.prepareStatement(query);

			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Song " + rs.getString(2) + " is playing now");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}

	}

	public void addsong() {
		try {

			query = "insert into song values " + "(?,?,?,?)";

			ps = conn.prepareStatement(query);

			System.out.println("ENTER THE SONG ID");
			s.setId(scan.nextInt());
			System.out.println("ENTER THE SINGER NAME");
			s.setSinger(scan.next());
			System.out.println("ENTER THE ALBUM NAME");
			s.setAlbum(scan.next());
			System.out.println("ENTER THE DURATION");
			s.setDuration(scan.nextLong());

			ps.setInt(1, s.getId());
			ps.setString(2, s.getSinger());
			ps.setString(3, s.getAlbum());
			ps.setLong(4, s.getDuration());

			result = ps.executeUpdate();
			System.out.println("Songs Stored");

		} catch (SQLException e) {
			System.out.println("ERROR SONGS CANT HAVE SAME ID ");
			System.out.println("PLEASE TRY AGAIN");
			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println("INVALID INPUT \nPLEASE TRY AGAIN");
		} finally {
			this.close();
		}
	}
}