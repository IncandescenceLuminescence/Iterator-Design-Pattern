package csce247.assignments.iterator;
public class Assignment {
	private String title,description,topic;
	private int points;
	public Assignment(String title,String description,String topic,int points) {
		this.title=title;
		this.description=description;
		this.topic=topic;
		this.points=points;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public String getTopic() {
		return topic;
	}
	public int getPoints() {
		return points;
	}
	public String toString() {
		return title+": "+description+", "+"covers: "+topic;
	}	
}
