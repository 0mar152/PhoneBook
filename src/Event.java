import java.util.Date;
import java.util.Scanner;
public class Event implements Comparable<Event>{
	private String title;
	private Date date;
	private String time;
	private String location;
	public String contact;
	private Scanner input;
	@SuppressWarnings("deprecation")
	public Event() {

	}
	public Event(String title, String date, String time, String location, String contact) {
		super();
		this.title = title;
		this.date = new Date(date);
		this.time = time;
		this.location = location;
		this.contact = contact;
		input = new Scanner(System.in);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(String string) {
		this.date = new Date(string);
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContact() {
		return contact;
	}
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	public int compareTo(Event e) {
        try {
            return (this.title.compareToIgnoreCase(e.title));
        }
        catch (Exception t)
        {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }}
