package com.shrenit.lightsequences.lights;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author schohan
 *
 */
public class LightSequenceAlgorithmFactoryTest {

	/**
	 * Test method for
	 * {@link com.shrenit.lightsequences.lights.LightSequenceAlgorithmFactory#buildAlgorithmStrategy(java.lang.String)}.
	 */
	@Test
	public void testBuildSequenceAlgorithm() {
		LightSequenceAlgorithm algorithm = LightSequenceAlgorithmFactory.buildAlgorithmStrategy("Sequence");
		assertThat(algorithm instanceof LightSequenceAlgorithm, is(true));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testBuildSequenceAlgorithmException() {
		LightSequenceAlgorithm algorithm = LightSequenceAlgorithmFactory.buildAlgorithmStrategy("Flicker");
	}
}
