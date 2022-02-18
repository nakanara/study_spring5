package ch02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// Config 설정 파일 로드
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext("ch02");
		
		// 사용할 bean 객체, 
		// 이름과 리턴 타입 설정
		Greeter g = ctx.getBean("greeter", Greeter.class);
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		String msg = g.greet("스프링");
		System.out.println(msg);
		
		Greeter g4 = ctx.getBean("greeter1", Greeter.class);
		System.out.println(g4.greet("스프링"));
		
		
		// sysout
		System.out.println("(g1 == g2) = " + (g1 == g2));
		System.out.println("(g1 == g2) = " 
				+ (g1.hashCode() == g2.hashCode()) + " hashCode="+ g1.hashCode());
		
		Greeter g3 = new Greeter();
		System.out.println(g3.hashCode());
		
		ctx.close();
	}

}
