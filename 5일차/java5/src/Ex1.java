// check answer.. -> java.lang.Error
import java.lang.*;

public class Ex1 {
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length]; // 3
		
		for( int i=0; i<commands.length; i++ ) {
			int x = commands[i][0];
			int y = commands[i][1];
			
			// ex) 2번째부터 5번째까지 자르면 총 4개의 버퍼가 필요하므로.
			int[] temp = new int[y-x+1];
			int idx = 0;
			for( int j=x-1; j<y; j++ ) {
				temp[idx++] = array[j];
				// System.out.print(array[j] + " "); // 여기까지 테스트 성공.
			}
			sort(temp);
			answer[i] = temp[commands[i][2]-1];
		}
		return answer;
	}
	
	public static int[] sort(int[] arr) { // 선택정렬
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
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] newArray = solution(array, commands);
		for( int t : newArray ) {
			System.out.print(t + " ");
		}
	}
}