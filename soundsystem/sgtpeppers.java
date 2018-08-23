package soundsystem;
import org.springframework.stereotype.Component;
@Component
public class sgtpeppers implements CompactDiscs{
	String title="yesterday";
	String artist="beatles";
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(title+" by "+artist);
	}
}
