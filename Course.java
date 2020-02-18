package csce247.assignments.iterator;
import java.util.Iterator;
public class Course {
	private String name="Software Engineering";
	private String title="CSCE 247";
	static final int max=5;
	int num=0;
	Assignment[]assignments;
	public Course(String title,String name) {
		assignments=new Assignment[max];
	}	
	public void addAssignment(String name,String description,String topic,int points) {
		Assignment assignment=new Assignment(name,description,topic,points);
		if(num<max) {		
		assignments[num]=assignment;		
		num++;	
		}
		else {					
			Assignment[]newAssignments=new Assignment[max*2];
			System.arraycopy(assignments,0,newAssignments,0,max);
			assignments=newAssignments;			
			newAssignments[num]=assignment;
			num++;
		}
	}		
	public CourseIterator createIterator() {
		return new CourseIterator(assignments);
	}
	public double getAssignmentWeights() {	
		return 100.0/num;
	}
	public String toString() {
		return title+": "+name;
	}		
	private void growArray() {			
		Assignment[]newAssignments=new Assignment[max*2];
		System.arraycopy(assignments,0,newAssignments,0,max);
		assignments=newAssignments;		
		num++;
	}	
}
