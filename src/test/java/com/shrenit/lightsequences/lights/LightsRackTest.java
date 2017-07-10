package com.shrenit.lightsequences.lights;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class LightsRackTest {

	@Test
	public void testLightRack() {
		LightRack lightRack = new LightRack(10);
		assertThat(lightRack, instanceOf(LightRack.class));
	}

	@Test
	public void testGetRackSize() {
		LightRack lightRack = new LightRack(5);
		assertEquals(5, lightRack.getRackSize());
	}

	@Test
	public void testGetLightRack() {
		LightRack lightRack = new LightRack(5);
		assertThat(lightRack.getLightRack(), instanceOf(List.class));
	}

	@Test
	public void testGetLight() {
		LightRack lightRack = new LightRack(5);
		assertThat(lightRack.getLight(0), instanceOf(Light.class));
	}

	@Test
	public void testColourOfLights() {
		LightRack lightRack = new LightRack(5);
		int currentLight = 0;
		int coloursIdx = currentLight % Colours.COUNT;
		Colours colour = Colours.fromValue(coloursIdx + 1);

		assertThat(lightRack.getLight(currentLight).getColour(), is(colour));
	}

}
