package com.shrenit.lightsequences.lights;

import java.util.ArrayList;
import java.util.List;

/**
 * @author schohan
 * 
 *         Model of a Light Rack ( Housing for Lights).
 */
public class LightRack implements Rack {

	final private int rackSize;

	private List<Light> lightsRack;

	/**
	 * Constructor() : Sets up the light rack with the given number of Lights.
	 * 
	 * @param racksize
	 * 
	 */
	LightRack(final int racksize) {
		rackSize = racksize;

		lightsRack = new ArrayList<>();

		int coloursIdx;
		// Create lightsRack and add lights to it.
		// Each light is setup with the LightNo, Colour and being switched off.
		for (int i = 0; i < rackSize; i++) {

			coloursIdx = (i + 1) % Colours.COUNT;
			if (coloursIdx == 0) {
				coloursIdx = Colours.COUNT;
			}
			lightsRack.add(new Light(i + 1, Colours.fromValue(coloursIdx), false));
		}

	}

	/**
	 * @return int
	 *         Getter for RackSize.
	 */
	@Override
	public int getRackSize() {
		return lightsRack.size();
	}

	/**
	 * @return List
	 *         Getter for the List of Lights (lightRack).
	 */
	@Override
	public List<Light> getLightRack() {
		return lightsRack;
	}

	/**
	 * @return Light
	 *         Getter for Light, given a position.
	 */
	public Light getLight(int lightpos) {
		return getLightRack().get(lightpos);
	}

}
