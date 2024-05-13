public class sortPractice {
	public static int[] sort(int[] arr) {
		for( int i=0; i<arr.length; i++ ) {
			for( int j=i+1; j<arr.length; j++ ) {
				if( arr[i] > arr[j] ) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 9, 2, 55, -1, 333, 20};
		
		int[] newArr = sort(arr);
		for( int t : newArr ) {
			System.out.print(t + " ");
		}
	}
}
