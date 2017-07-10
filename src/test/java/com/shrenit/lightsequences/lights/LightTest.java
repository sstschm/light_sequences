package com.shrenit.lightsequences.lights;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author schohan
 *
 */
public class LightTest {

	/**
	 * Test method for
	 * {@link com.shrenit.lightsequences.lights.Light#Light(int, com.shrenit.lightsequences.lights.Colours, boolean)}.
	 */
	@Test
	public void testLight() {
		Light light1 = new Light(1, Colours.RED, false);
		assertThat(light1, instanceOf(Light.class));
	}

	/**
	 * Test method for {@link com.shrenit.lightsequences.lights.Light#isSwitchedOn()}.
	 */
	@Test
	public void testIsSwitchedOn() {
		Light light1 = new Light(1, Colours.RED, true);
		assertTrue(light1.isSwitchedOn());
	}

	/**
	 * Test method for {@link com.shrenit.lightsequences.lights.Light#setSwitchedOn(boolean)}.
	 */
	@Test
	public void testSetSwitchedOn() {
		Light light1 = new Light(1, Colours.RED, true);
		assertTrue(light1.isSwitchedOn());
		light1.setSwitchedOn(false);
		assertFalse(light1.isSwitchedOn());
	}

}
