package Teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestSuite;
import junit.textui.TestRunner;


@RunWith(Suite.class)
@SuiteClasses({ TestClinica.class, TestPacient.class,TestDoctor.class,TestCardiologie.class,TestProgramari.class})
public class RulareTeste {
	public static void main(String [] args){
		TestSuite teste = new TestSuite();
		TestRunner.run(teste);
	}
}
