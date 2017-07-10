package com.shrenit.lightsequences.lights;

/**
 * @author schohan
 * 
 *         Interface : Defines methods to be implemented by Implementing Algorithm Objects.
 *
 */
public interface LightSequenceAlgorithm {

	/**
	 * 
	 * @param lightRack
	 * 
	 */
	public void switchLights(LightRack lightRack);

	/**
	 * 
	 * @return int
	 */
	public int getLightDuration();

}
