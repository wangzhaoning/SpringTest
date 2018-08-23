package configtest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
	  @Bean(name="hellojava")
	    public Hello helloWorld() {
	        return new HelloWorld();
	    }
	  public Hello helloWorld1() {
		  return new Hellojava();
	  }
}
