/**
 * 
 */
package com.shrenit.lightsequences.lights;

import org.junit.Before;
import org.junit.Test;

/**
 * @author schohan
 *
 */
public class AlternateAlgorithmTest {

	private LightRack lightRack;

	@Before
	public void setup() {
		lightRack = new LightRack(3);
	}

	/**
	 * Test method for
	 * {@link com.shrenit.lightsequences.lights.AlternateAlgorithm#switchLights(com.shrenit.lightsequences.lights.LightRack)}
	 * .
	 */
	@Test
	public void testSwitchLights() {
		LightSequenceAlgorithm algorithm = new AlternateAlgorithm();

		// algorithm.switchLights(lightRack);

		// fail("Not yet implemented"); // TODO
	}

}
