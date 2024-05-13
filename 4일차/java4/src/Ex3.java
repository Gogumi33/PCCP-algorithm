// import java.util.Scanner;

public class Ex3 {
	public static int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length];
		int idx = 0;
		for( int i=0; i<num_list.length; i+=n ) {
			answer[idx++] = num_list[i];
		}
		
		int[] newList = new int[idx];
		for( int i=0; i<idx; i++ ) {
			newList[i] = answer[i];
		}
		return newList;
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Hi");
		int[] num_list = {4, 2, 6, 1, 7, 6};
		int[] newList = solution(num_list, 2);

		for( int t : newList ) {
			System.out.print(t + " ");
		}
	}
}