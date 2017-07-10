package com.shrenit.lightsequences.lights;

/**
 * 
 * @author schohan
 * 
 *         Colour : Enum Type.(at Class level).
 *
 */
public enum Colours {
	RED(1), GREEN(2), WHITE(3);

	public static int COUNT = Colours.values().length;

	private int value;

	/**
	 * Constructor()
	 */
	private Colours() {
	}

	/**
	 * Constructor() : associated with each integer values of the Enum Type.
	 */
	private Colours(int value) {
		this.value = value;
	}

	/**
	 * 
	 * @param value
	 * @return Colours Enum Type.
	 * 
	 *         Given an int returns the corresponding Enum at that position in the list.
	 */
	static Colours fromValue(int value) {
		for (Colours my : Colours.values()) {
			if (my.value == value) {
				return my;
			}
		}
		return null;
	}

	/**
	 * 
	 * @return int
	 * 
	 *         returns the integer value of the Enum Type.
	 */
	int value() {
		return value;
	}
}
