package sec07.exam08_abstract_class;

public class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void Internetsearch() {
		System.out.println("인터넷 검색을 합니다.");;
	}
}
