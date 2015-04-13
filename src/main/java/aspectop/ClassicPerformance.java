package aspectop;

import org.springframework.stereotype.Component;

@Component
public class ClassicPerformance implements Performance {

	@Override
	public void perform() {
		System.out.println("Doing classic music");
	}

}
