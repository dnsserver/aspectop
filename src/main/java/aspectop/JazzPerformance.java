package aspectop;

import org.springframework.stereotype.Component;

@Component
public class JazzPerformance implements Performance {
	@Override
	public void perform() {
		System.out.println("Doing Jazz.");
	}
}
