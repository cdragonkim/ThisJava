package sec04_multi_catch;

public class MultiCatchExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개값이 부족하거나 숫자 변환할 수 없음");
		} catch(Exception e) {
			System.out.println("일반 오류");
		} finally {
			System.out.println("다시 실행하세요");
		}
		
	}

}
