package amazonPage;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IExplore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.iedriver().setup();
		
		Driver drive = new Driver();
	}

}
