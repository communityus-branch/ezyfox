package com.tvd12.ezyfox.hazelcast.testing;

import org.testng.annotations.Test;

import com.tvd12.ezyfox.hazelcast.annotation.EzyMapServiceAutoImpl;
import com.tvd12.ezyfox.hazelcast.impl.EzySimpleServiceImplementer;
import com.tvd12.ezyfox.reflect.EzyClass;

public class EzySimpleServiceImplementerTest extends HazelcastBaseTest {

	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void test() {
		EzySimpleServiceImplementer implementer = 
				new EzySimpleServiceImplementer(new EzyClass(ClassA.class));
		implementer.implement(HZ_INSTANCE);
	}
	
	@Test(expectedExceptions = {IllegalStateException.class})
	public void test2() {
		EzySimpleServiceImplementer implementer = 
				new EzySimpleServiceImplementer(new EzyClass(InterfaceA.class));
		implementer.implement(null);
	}
	
	@EzyMapServiceAutoImpl("a")
	public static class ClassA {
		
	}
	
	@EzyMapServiceAutoImpl("a")
	public static interface InterfaceA {
		
	}
	
}
