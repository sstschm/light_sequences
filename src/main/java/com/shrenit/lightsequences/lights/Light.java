package com.shrenit.lightsequences.lights;

/**
 * 
 * @author schohan
 * 
 *         Model of the Light.
 */
public class Light {

	private int lightNo;
	private Colours colour;
	private boolean switchedOn;

	/**
	 * Constuctor()
	 * 
	 * @param lightNo
	 * @param colour
	 * @param switchedOn
	 */
	public Light(int lightNo, Colours colour, boolean switchedOn) {
		this.lightNo = lightNo;
		this.colour = colour;
		this.switchedOn = switchedOn;
	}

	/**
	 * @return boolean
	 *         Getter for switchedOn.
	 */
	public boolean isSwitchedOn() {
		return switchedOn;
	}

	/**
	 * @param switchedOn
	 *            Setter for switchOn.
	 *
	 */
	public void setSwitchedOn(boolean switchedOn) {
		this.switchedOn = switchedOn;
	}

	/**
	 * @return int
	 *         Getter for LightNo
	 */
	public int getLightNo() {
		return lightNo;
	}

	/**
	 * @return
	 * 		Getter for Colour.
	 */
	public Colours getColour() {
		return colour;
	}

	@Override
	public String toString() {
		return "Light [lightNo=" + lightNo + ", colour=" + colour + ", switchedOn=" + switchedOn + "]";
	}

}
