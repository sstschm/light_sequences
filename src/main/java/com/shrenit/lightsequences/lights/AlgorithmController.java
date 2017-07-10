package com.shrenit.lightsequences.lights;

/**
 * 
 * @author schohan
 * 
 *         Context Object as part of the Strategy Pattern.
 *         Controls/invokes the selected Algorithm (strategy) objects.
 * 
 */
public final class AlgorithmController {

	private final LightSequenceAlgorithm algorithm;
	private final LightRack lightRack;

	/**
	 * 
	 * Constructor
	 * 
	 * @param algorithm
	 * @param lightRack
	 */
	public AlgorithmController(LightSequenceAlgorithm algorithm, LightRack lightRack) {
		this.algorithm = algorithm;
		this.lightRack = lightRack;
	}

	/**
	 * execute() : Invoke algorithm and cycle through Lights until program is interrupted.
	 */
	public final void execute() {

		while (true) {
			algorithm.switchLights(lightRack); // turn on off lights.
			displayLightRack(); // current status of lightRack.
			try {
				Thread.sleep(algorithm.getLightDuration());
			} catch (InterruptedException e) {
				e.printStackTrace(System.err);
			}
		}

	}

	/**
	 * displayLightRack() : Display Lights on/off.
	 */
	private void displayLightRack() {
		for (Light light : lightRack.getLightRack()) {
			System.out.println("Light " + light.getLightNo() + ": " +
					light.getColour() + " " +
					(light.isSwitchedOn() ? "on" : "off"));
		}
		System.out.println();
	}

}
