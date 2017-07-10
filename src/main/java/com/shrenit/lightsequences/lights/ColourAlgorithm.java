package com.shrenit.lightsequences.lights;

/**
 * @author schohan
 * 
 *         ColourAlgorithm : Lights alternate on & off based on Colour.
 *
 */
public class ColourAlgorithm implements LightSequenceAlgorithm {

	private int currentLight = 0;
	private int lightDuration;

	/**
	 * Construtor
	 */
	public ColourAlgorithm() {
		this.lightDuration = 1000;
	}

	/**
	 * getLightDuration() : returns the Light Duration.
	 */
	@Override
	public int getLightDuration() {
		return this.lightDuration;
	}

	/**
	 * switchLights() : Given the Light Rack, switches the current light in the process on or off,
	 * based on the Colour of lights algorithm.
	 */
	@Override
	public void switchLights(LightRack lightRack) {
		System.out.println("Inside Colour Algorithm...");

		int coloursIdx = currentLight % Colours.COUNT;
		Colours colour = Colours.fromValue(coloursIdx + 1);

		for (Light light : lightRack.getLightRack()) {
			light.setSwitchedOn(light.getColour() == colour);
		}
		++currentLight;
	}
}
