package JavaAssignment4;
import java.util.*;

public class GetHighestAndLowestInTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
	      treeSet.add(50);
	      treeSet.add(100);
	      treeSet.add(150);
	      treeSet.add(200);
	      treeSet.add(25);
	      treeSet.add(300);
	      treeSet.add(400);
	      treeSet.add(500);
	      treeSet.add(800);
	      treeSet.add(201);
	      System.out.println("TreeSet Lowest value = " + treeSet.first());
	      System.out.println("TreeSet Highest value = " + treeSet.last());

	}

}
