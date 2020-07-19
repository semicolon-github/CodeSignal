import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
	public static void main(String[] args) {
		int[] a = {2,1,3,5,3,2};
		
		int firstDuplicate = firstDuplicate(a);
		System.out.println(firstDuplicate);
		
	}
	
	public static int firstDuplicate(int[] a) {
	    Set<Integer> set = new HashSet<>();
	    for (int i=0; i < a.length ; i++ ) {
	        if(!set.add(a[i])) {
	        	return a[i];
	        }
	    }
	    return -1;
	}
}
