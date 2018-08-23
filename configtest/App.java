package configtest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App {
	public static void main(String[] args) {
	    
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
    Hello obj = (Hello) context.getBean("hellojava");
    obj.sayHello();
	}
}