package ch02;

public class Greeter {

	private String format;
	
	public String greet(String guest) {
		return String.format(format, guest);
	}
	
	public void setFormat(String format) {
		// 동일 변수의 경우 this를 사용하여 변수의 위치를 설정
		this.format = format;
	}
	
}
