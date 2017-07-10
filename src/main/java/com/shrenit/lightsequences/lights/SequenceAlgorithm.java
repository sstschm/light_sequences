package com.shrenit.lightsequences.lights;

/**
 * @author schohan
 * 
 *         SequenceAlgorithm : Lights alternate on & off based on a sequential ordering.
 *
 */
public class SequenceAlgorithm implements LightSequenceAlgorithm {

	// public static final int LIGHT_DURATION = 500;
	private int currentLight = 0;
	private int lightDuration;

	/**
	 * Construtor
	 */
	public SequenceAlgorithm() {
		this.lightDuration = 500;
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
	 * based on the position of lights.
	 */
	@Override
	public void switchLights(LightRack lightRack) {
		System.out.println("Inside Sequence Algorithm...");

		Light light = lightRack.getLight(currentLight);
		if (light.isSwitchedOn()) {
			light.setSwitchedOn(false);
			currentLight = (currentLight + 1) % lightRack.getRackSize();
			light = lightRack.getLight(currentLight);
		}
		light.setSwitchedOn(true);
	}
}
