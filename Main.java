
public class Main {

	public static void main(String[] args) {
//		int n = 2;
//		int t = 4;
//		int m = 2;
//		int p = 1; // return 0111

//		int n = 16;
//		int t = 16;
//		int m = 2;
//		int p = 1; // return 02468ACE11111111
		
		int n = 16;
		int t = 16;
		int m = 2;
		int p = 2; // return 13579BDF01234567
		
		System.out.println(new Solution().solution(n, t, m, p));
	}

}

class Solution {
	
	/* n : 진법 2 ~ 16
	 * t : 미리구할 숫자의 갯수
	 * m : 게임참가인원
	 * p : 튜브의 순서
	 * */
	public String solution(int n, int t, int m, int p) {
		StringBuilder answer = new StringBuilder();
		StringBuilder answerSheet = new StringBuilder();
		
		int num = 0;
		while (answerSheet.length() <= t*m) {
			String numStr = Integer.toString(num, n);
			answerSheet.append(numStr);
			num++; // n집법으로 만들어 낼 수
		}
		
		
		String answerStr = answerSheet.toString();
		for (int i = 0; i < t; i++) {
			int idx = p-1 + i*m;
			answer.append(answerStr.charAt(idx));
		}
		
		return answer.toString().toUpperCase();
	}
}