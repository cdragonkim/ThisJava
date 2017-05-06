package sec06.exam08_advanced_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("종합 점수 : " + sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("평균 점수 : " + avg);
	}

}
