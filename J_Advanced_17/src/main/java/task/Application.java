package task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UnivercityService service = ctx.getBean(UnivercityService.class);
		
		Univercity univercity = new Univercity(4, 10, 6500, "Lviv");
		Univercity univercity2 = new Univercity(3, 8, 4000, "Ternopil");
		
		service.save(univercity);
		service.save(univercity2);
		
		System.out.println(service.findAll());
		
		service.deleteById(1);
	}

}
