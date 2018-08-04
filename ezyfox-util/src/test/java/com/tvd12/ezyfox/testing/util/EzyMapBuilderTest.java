package com.tvd12.ezyfox.testing.util;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.tvd12.ezyfox.util.EzyMapBuilder;
import com.tvd12.test.base.BaseTest;

public class EzyMapBuilderTest extends BaseTest {

	@Test
	public void test() {
		EzyMapBuilder.mapBuilder()
				.map(new HashMap<>())
				.put("a", "b")
				.putAll(new HashMap<>())
				.build();
		new EzyMapBuilder()
			.build();
	}
	
}
