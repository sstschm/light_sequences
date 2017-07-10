package com.shrenit.lightsequences.lights;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author schohan
 *
 */
public class SequenceAlgorithmTest {

	private LightRack lightRack;

	@Before
	public void setup() {
		lightRack = new LightRack(3);
	}

	/**
	 * Test method for {@link com.shrenit.lightsequences.lights.SequenceAlgorithm#getLightDuration()}.
	 */
	@Test
	public void testGetLightDuration() {

		LightSequenceAlgorithm algorithm = new SequenceAlgorithm();
		assertEquals(500, algorithm.getLightDuration());
	}

	/**
	 * Test method for
	 * {@link com.shrenit.lightsequences.lights.SequenceAlgorithm#switchLights(com.shrenit.lightsequences.lights.LightRack)}
	 * .
	 */
	@Test
	public void testSwitchLights() {
		LightSequenceAlgorithm algorithm = new SequenceAlgorithm();
		algorithm.switchLights(lightRack);
		assertTrue(lightRack.getLight(0).isSwitchedOn());
		assertFalse(lightRack.getLight(1).isSwitchedOn());
		assertFalse(lightRack.getLight(2).isSwitchedOn());

		algorithm.switchLights(lightRack);

		assertFalse(lightRack.getLight(0).isSwitchedOn());
		assertTrue(lightRack.getLight(1).isSwitchedOn());
		assertFalse(lightRack.getLight(2).isSwitchedOn());
	}

}
