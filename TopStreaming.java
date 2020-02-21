/** Class: CISC 3130

 * Section: MY9

 * EmplId: 23583219

 * Name: Bryan Brathwaite
 
 * Professor Katherine Chuang

*/

public class TopStreaming {
		  private String position;
		  private String trackname;
		  private String artist;
		  private int streams;
		 // default constructor
		  public TopStreaming () {
		  }
		 // constructor
		  public TopStreaming(String position, String trackname, String artist, int streams) {
		    this.position = position;
		    this.trackname = trackname;
		    this.artist = artist;
		    this.streams = streams;
		  }
		 //getter and setter methods
		  public String getposition() {
		    return position;
		  }
		 
		  public void setposition(String position) {
		    this.position = position;
		  }
		 
		  public String getTrackname() {
		    return trackname;
		  }
		 
		  public void setTrackname(String trackname) {
		    this.trackname = trackname;
		  }
		 
		  public String getArtist() {
		    return artist;
		  }
		 
		  public void setArtist(String artist) {
		    this.artist = artist;
		  }
		 
		  public int getStreams() {
		    return streams;
		  }
		 
		  public void setStreams(int streams) {
		    this.streams = streams;
		  }
		 
		  @Override
		  // what should print to output
		  public String toString() {
		    return " [position=" + position + ", trackname=" + trackname + ", artist=" + artist + ", streams=" + streams + "]";
		  }
		 
		}

