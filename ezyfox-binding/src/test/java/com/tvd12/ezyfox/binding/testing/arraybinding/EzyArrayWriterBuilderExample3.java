package com.tvd12.ezyfox.binding.testing.arraybinding;

import org.testng.annotations.Test;

import com.tvd12.ezyfox.binding.EzyMarshaller;
import com.tvd12.ezyfox.binding.impl.EzyArrayWriterBuilder;
import com.tvd12.ezyfox.binding.impl.EzySimpleBindingContext;
import com.tvd12.ezyfox.entity.EzyArray;

public class EzyArrayWriterBuilderExample3 {

	@Test
	public void test() throws Exception {
		EzySimpleBindingContext context = EzySimpleBindingContext.builder()
				.scan("com.tvd12.ezyfox.binding.testing.arraybinding")
				.build();
		EzyMarshaller marshaller = context.newMarshaller();
		EzyArrayWriterBuilder.setDebug(true);
		EzyArray array = marshaller.marshal( new ClassB());
		System.out.println(array);
	}
}
