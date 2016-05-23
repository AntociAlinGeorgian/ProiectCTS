package clase;

import interfete.IModTratament;

public class Injectabil implements IModTratament{

	@Override
	public void tratament() {
		System.out.println("Pacientului i s-a administrat un tratament injectabil");
	}

}
