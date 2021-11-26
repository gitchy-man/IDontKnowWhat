package fr.kindevelopment.idontknow;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class SomethingIDontKnowTest {

	@Test
	public void sayIDontKnow () {
		assertTrue("I don't know".equals(SomethingIDontKnow.sayIDontKnow()));		
	}
}
