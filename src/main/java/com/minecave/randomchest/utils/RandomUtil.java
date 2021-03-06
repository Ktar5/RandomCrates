package com.minecave.randomchest.utils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtil {

	/**
	 * Returns a freshly seeded ThreadLocalRandom instance for random usage
	 * Is much better than the Random class.
	 *
	 * @return re-seeded ThreadLocalRandom instance
	 */
	public static ThreadLocalRandom random() {
		return ThreadLocalRandom.current();
	}
}
