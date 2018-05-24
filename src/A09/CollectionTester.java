package A09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

public class CollectionTester {
	public static void main(String[] args) {
		int[] dims = {1000, 5000, 10000, 20000, 40000, 100000}; 
		
		double[][] arrayListValues = new double[6][3];
		double[][] linkedListValues = new double[6][3];
		double[][] stackValues = new double[6][3];
		double[][] treeSetValues = new double[6][3];
		
		for(int i=0; i<dims.length; i++) {
			int DIM = dims[i];
			
			//System.out.printf("%15s %8d", "Collection", DIM);
			
			Collection<Integer> col;
			
			col = new ArrayList<Integer>();
			arrayListValues[i] = checkPerformance(col, DIM);
			
			col = new LinkedList<Integer>();
			linkedListValues[i] = checkPerformance(col, DIM);
			
			col = new Stack<Integer>();
			stackValues[i] = checkPerformance(col, DIM);
			
			col = new TreeSet<Integer>();
			treeSetValues[i] = checkPerformance(col, DIM);
		}
		
//		System.out.println("ArrayList: ");
//		System.out.println(Arrays.toString(arrayListValues));
//		System.out.println("LinkedList: ");
//		System.out.println(Arrays.toString(linkedListValues));
//		System.out.println("Stack: ");
//		System.out.println(Arrays.toString(stackValues));
//		System.out.println("TreeSet: ");
//		System.out.println(Arrays.toString(treeSetValues));
		
		
		System.out.println("---------------------------------");
		System.out.printf("%-15s", "Collection");
		for(int i=0; i<dims.length; i++) {
			System.out.printf(" %-12d", dims[i]);
		}
		System.out.println();
		
		System.out.println("ArrayList");
		System.out.printf("%-15s", "add");
		for(int i=0; i<dims.length; i++) {
			System.out.printf(" %-12f", arrayListValues[i][0]);
		}
		System.out.println();
		System.out.printf("%-15s", "search");
		for(int i=0; i<dims.length; i++) {
			System.out.printf(" %-12f", arrayListValues[i][1]);
		}
		System.out.println();
		System.out.printf("%-15s", "remove");
		for(int i=0; i<dims.length; i++) {
			System.out.printf(" %-12f", arrayListValues[i][2]);
		}
		System.out.println();
		
		System.out.println("LinkedList");
		System.out.printf("%-15s", "add");
		for(int i=0; i<dims.length; i++) {
			System.out.printf(" %-12f", linkedListValues[i][0]);
		}
		System.out.println();
		System.out.printf("%-15s", "search");
		for(int i=0; i<dims.length; i++) {
			System.out.printf(" %-12f", linkedListValues[i][1]);
		}
		System.out.println();
		System.out.printf("%-15s", "remove");
		for(int i=0; i<dims.length; i++) {
			System.out.printf(" %-12f", linkedListValues[i][2]);
		}
		System.out.println();
		
		System.out.println("Stack");
		System.out.printf("%-15s", "add");
		for(int i=0; i<dims.length; i++) {
			System.out.printf(" %-12f", stackValues[i][0]);
		}
		System.out.println();
		System.out.printf("%-15s", "search");
		for(int i=0; i<dims.length; i++) {
			System.out.printf(" %-12f", stackValues[i][1]);
		}
		System.out.println();
		System.out.printf("%-15s", "remove");
		for(int i=0; i<dims.length; i++) {
			System.out.printf(" %-12f", stackValues[i][2]);
		}
		System.out.println();
		
		System.out.println("TreeSet");
		System.out.printf("%-15s", "add");
		for(int i=0; i<dims.length; i++) {
			System.out.printf(" %-12f", treeSetValues[i][0]);
		}
		System.out.println();
		System.out.printf("%-15s", "search");
		for(int i=0; i<dims.length; i++) {
			System.out.printf(" %-12f", treeSetValues[i][1]);
		}
		System.out.println();
		System.out.printf("%-15s", "remove");
		for(int i=0; i<dims.length; i++) {
			System.out.printf(" %-12f", treeSetValues[i][2]);
		}
		System.out.println();
		
	}
	private static double[] checkPerformance(Collection<Integer> col, int DIM) {
		double[] ret = new double[3];
		Iterator<Integer> iterator;
		double start, stop, delta;
		// Add
		start = System.nanoTime(); // clock snapshot before
		for(int i=0; i<DIM; i++ )
			col.add( i );
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop-start)/1e6; // convert to milliseconds
		ret[0] = delta;
//		System.out.println(col.size()+ ": Add to " +
//		col.getClass().getSimpleName() +" took " + delta + "ms");
		// Search
		start = System.nanoTime(); // clock snapshot before
		for(int i=0; i<DIM; i++ ) {
			int n = (int) (Math.random()*DIM);
			if (!col.contains(n))
				System.out.println("Not found???"+n);
		}
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
		ret[1] = delta;
//		System.out.println(col.size()+ ": Search to " +
//		col.getClass().getSimpleName() +" took " + delta + "ms");
		// Remove
		start = System.nanoTime(); // clock snapshot before
		iterator = col.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
		ret[2] = delta;
//		System.out.println(col.size() + ": Remove from "+
//		col.getClass().getSimpleName() +" took " + delta + "ms");		
//		
		return ret;
	}
}
