package sec067exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordianl = today.ordinal();
		System.out.println(ordianl);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		Week weekDay = Week.valueOf("SUNDAY");
		if(weekDay == Week.SUNDAY || weekDay == Week.SATURDAY) {
			System.out.println("주말이군요");
		} else {
			System.out.println("평일이군요");
		}
		
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
