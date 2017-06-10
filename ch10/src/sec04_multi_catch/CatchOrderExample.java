package sec04_multi_catch;

public class CatchOrderExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값이 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} catch(Exception e) {
			System.out.println("일반 오류");
		} finally {
			System.out.println("다시 실행하세요");
		}
		
	}

}
