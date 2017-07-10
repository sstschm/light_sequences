package com.shrenit.lightsequences.lights;

/**
 * @author schohan
 * 
 *         AlternateAlgorithm : Strategy which alternates the execution of the Sequence & Colour strategies.
 *
 */
public class AlternateAlgorithm implements LightSequenceAlgorithm {

	private int lightDuration;
	private String nextAlgorithm = "Sequence";
	private int executionCount = 0;

	private LightSequenceAlgorithm sequenceAlgorithm;
	private LightSequenceAlgorithm colourAlgorithm;

	/**
	 * Constructor
	 */
	public AlternateAlgorithm() {
		this.lightDuration = 30000;
		sequenceAlgorithm = LightSequenceAlgorithmFactory.buildAlgorithmStrategy("Sequence");
		colourAlgorithm = LightSequenceAlgorithmFactory.buildAlgorithmStrategy("Colour");
	}

	/**
	 * getLightDuration() : returns the Light Duration for the algorithm currently running.
	 */
	@Override
	public int getLightDuration() {
		return (nextAlgorithm.equals("Sequence") ? sequenceAlgorithm.getLightDuration()
				: colourAlgorithm.getLightDuration());
	}

	/**
	 * switchLights() : Given the Light Rack, switches the current light in the process on or off,
	 * depending on the algorithm running.
	 */
	@Override
	public void switchLights(LightRack lightRack) {
		executionCount++;
		System.out.println("Running the " + nextAlgorithm + " algorithm...count: " + executionCount);

		if (nextAlgorithm.equals("Sequence")) {
			sequenceAlgorithm.switchLights(lightRack);

			if (isDurationLimit(sequenceAlgorithm)) {
				nextAlgorithm = "Colour";
				executionCount = 0;
			}
		} else {
			colourAlgorithm.switchLights(lightRack);

			if (isDurationLimit(colourAlgorithm)) {
				nextAlgorithm = "Sequence";
				executionCount = 0;
			}
		}

	}

	private boolean isDurationLimit(LightSequenceAlgorithm algorithm) {
		return ((executionCount * algorithm.getLightDuration()) == this.lightDuration);
	}
}
