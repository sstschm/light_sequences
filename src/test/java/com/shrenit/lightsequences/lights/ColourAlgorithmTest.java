package com.shrenit.lightsequences.lights;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author schohan
 *
 */
public class ColourAlgorithmTest {

	private LightRack lightRack;

	@Before
	public void setup() {
		lightRack = new LightRack(5);
	}

	/**
	 * Test method for
	 * {@link com.shrenit.lightsequences.lights.ColourAlgorithm#switchLights(com.shrenit.lightsequences.lights.LightRack)}
	 * .
	 */
	@Test
	public void testSwitchLights() {
		LightSequenceAlgorithm algorithm = new ColourAlgorithm();

		// 1st Change to Lights
		algorithm.switchLights(lightRack);

		// Assertions to show only a single colour lights are on.
		assertTrue(lightRack.getLight(0).isSwitchedOn()); // on
		assertFalse(lightRack.getLight(1).isSwitchedOn()); // off
		assertFalse(lightRack.getLight(2).isSwitchedOn()); // off
		assertTrue(lightRack.getLight(3).isSwitchedOn()); // on
		assertFalse(lightRack.getLight(4).isSwitchedOn()); // off

		// Confirm the Colour of Lights that are on / off.
		assertEquals("Light Colour is " + Colours.RED, "RED", lightRack.getLight(0).getColour().toString());
		assertEquals("Light Colour is " + Colours.GREEN, "GREEN", lightRack.getLight(1).getColour().toString());
		assertEquals("Light Colour is " + Colours.WHITE, "WHITE", lightRack.getLight(2).getColour().toString());
		assertEquals("Light Colour is " + Colours.RED, "RED", lightRack.getLight(3).getColour().toString());
		assertEquals("Light Colour is " + Colours.GREEN, "GREEN", lightRack.getLight(4).getColour().toString());

		// 2nd Change of Lights
		algorithm.switchLights(lightRack);

		// Assertions to show a different colour lights are on.
		assertFalse(lightRack.getLight(0).isSwitchedOn()); // off
		assertTrue(lightRack.getLight(1).isSwitchedOn()); // on
		assertFalse(lightRack.getLight(2).isSwitchedOn()); // off
		assertFalse(lightRack.getLight(3).isSwitchedOn()); // off
		assertTrue(lightRack.getLight(4).isSwitchedOn()); // on

		// Confirm the Colour of Lights that are on / off.
		assertEquals("Light Colour is " + Colours.RED, "RED", lightRack.getLight(0).getColour().toString());
		assertEquals("Light Colour is " + Colours.GREEN, "GREEN", lightRack.getLight(1).getColour().toString());
		assertEquals("Light Colour is " + Colours.WHITE, "WHITE", lightRack.getLight(2).getColour().toString());
		assertEquals("Light Colour is " + Colours.RED, "RED", lightRack.getLight(3).getColour().toString());
		assertEquals("Light Colour is " + Colours.GREEN, "GREEN", lightRack.getLight(4).getColour().toString());

	}

}
