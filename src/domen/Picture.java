package domen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.flickr4java.flickr.tags.Tag;

public class Picture {

	private String id;
	//private String owner;
	private String title;
	public ArrayList<Tag> tags;
	//private String location;
	private Date [] dates;
	
	public Picture (String i, String t){
		id = i;
		//owner = o;
		title = t;
		tags = new ArrayList<Tag>();
		//location = l;
		dates = new Date[2];
	}

	/*public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}*/

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/*public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}*/

	public Date[] getDates() {
		return dates;
	}

	public void setDates(Date[] dates) {
		this.dates = dates;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Picture [id=" + id + ",  title=" + title
				+ ", tags=" + tags + ", dates="
				+ Arrays.toString(dates) + "]";
	}

	public ArrayList<Tag> getTags() {
		return tags;
	}

	public void setTags(ArrayList<Tag> tags) {
		this.tags = tags;
	}
	
	
}
