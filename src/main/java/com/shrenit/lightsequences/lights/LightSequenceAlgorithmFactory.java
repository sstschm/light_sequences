package com.shrenit.lightsequences.lights;

/**
 * @author Shrenit Chohan
 *
 *         Factory Class : Responsible for instantiating the selected algorithm, given the name of the algorithm.
 */
public class LightSequenceAlgorithmFactory {

	public static LightSequenceAlgorithm buildAlgorithmStrategy(String sequenceAlgorithm) {
		LightSequenceAlgorithm strategy = null;
		sequenceAlgorithm = sequenceAlgorithm.toUpperCase();

		switch (sequenceAlgorithm) {
		case "SEQUENCE":
			strategy = new SequenceAlgorithm();
			break;

		case "COLOUR":
			strategy = new ColourAlgorithm();
			break;

		case "ALTERNATE":
			strategy = new AlternateAlgorithm();
			break;

		default:
			throw new IllegalArgumentException("Unable to build a strategy for " + sequenceAlgorithm);
		}
		return strategy;
	}

}
