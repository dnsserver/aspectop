package aspectop;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectOpApplication implements CommandLineRunner{

    public static void main(String[] args) {
    	SpringApplication app = new SpringApplication(AspectOpApplication.class);
        app.setShowBanner(false);
        app.run(args);
    }

    @Resource(name="jazzPerformance")
    Performance jp;
    
    @Resource(name="classicPerformance")
    Performance cp;
    
    
	@Override
	public void run(String... arg0) throws Exception {
		cp.perform();
		
		jp.perform();
	}
}
