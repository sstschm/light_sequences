package com.shrenit.lightsequences.lights;

/**
 * 
 * @author schohan
 * 
 *         Main Program :
 *         Reads the algorithm name and calls the Factory to create the corresponding Algorithm Object.
 *         Passes this object together with the Light Rack to the AlgorithmController where it manages the
 *         execution of the algorithm.
 *
 */
public class LightSequenceApp {

	public static void main(final String[] args) {

		String sequenceAlgorithm = "";
		if (args.length != 1) {
			System.out.println(
					"Sequence Algorithm not provided. Please supply one of [ Sequence | Colour | Alternate ]...");
			System.exit(1);
		} else {
			sequenceAlgorithm = args[0];
		}

		// Create Factory to determine the Sequence Algorithm Strategy
		LightSequenceAlgorithm algorithmStrategy = LightSequenceAlgorithmFactory
				.buildAlgorithmStrategy(sequenceAlgorithm);

		// Build the Light Rack housing the lights (Light).
		final LightRack lightRack = new LightRack(20);

		// Execute the chosen Sequence Algorithm.
		AlgorithmController algorithmController = new AlgorithmController(algorithmStrategy, lightRack);
		algorithmController.execute();

	}
}
