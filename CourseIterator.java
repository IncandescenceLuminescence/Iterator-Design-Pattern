package csce247.assignments.iterator;
import java.util.Iterator;
public class CourseIterator implements Iterator{
	private Assignment[]assignments;
	private int position=0;
	public CourseIterator(Assignment[]assignments) {
		this.assignments=assignments;
	}	
	public boolean hasNext() {
		if(position>=assignments.length||assignments[position]==null)		
			return false;
		else
			return true;		
	}	
	public Assignment next() {
		Assignment assignment=assignments[position];
		if(position<=assignments.length) {			
			position++;		
			return assignment;
		}
		else
			return null;
	}
}
