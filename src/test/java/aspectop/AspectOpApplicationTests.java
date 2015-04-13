package aspectop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AspectOpApplication.class)
public class AspectOpApplicationTests {

	@Test
	public void contextLoads() {
		ClassicPerformance cp = new ClassicPerformance();
		cp.perform();
		
		JazzPerformance jp = new JazzPerformance();
		jp.perform();
	}

}
