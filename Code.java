package misc;

public class main_misc2 {

	public static void main(String[] args) {
		// 
	int[] v = {2,5,1,3,4};
	System.out.println(min_bribes(v));
		
	}
	/*
	 * V is vector that indicates how much swaps each element was involved,since you can only swap with neighbors
	 * i noticed that v will be a vector composed by 1 and 2,but the ones comes in pairs for obvious reasons
	 * but the 2 comes with a pair with one,because you cant have 2 swaps and only 2 prticipants without
	 * having the situation that nulifies this count,ex: 1-->2 and 2-->1 this is 2 swaps but they wont move in the array
	 * so i dont have to count it.
	 */
	private static int mod(int x) {
		if(x < 0) {
			return -x;
		}
		return x;
	}
	private static int sum(int[]v) {
		int s = 0;
		for(int i = 0;i < v.length;i++) {
			s += v[i];
		}
		return s;
	}
	private static int min_bribes(int[]l) {
		//
		int [] v =  new int[l.length];
		for(int i = 0;i < l.length;i++) {
			v[i] = mod((i+1)-l[i]);
			if(v[i] == 3) {
				System.out.println("Too chaotic");
				return -1;
			}
		}
		return sum(v)/2;
		
		
	}
	

	}


