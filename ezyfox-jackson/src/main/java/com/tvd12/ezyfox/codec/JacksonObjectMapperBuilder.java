package com.tvd12.ezyfox.codec;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.tvd12.ezyfox.builder.EzyBuilder;
import com.tvd12.ezyfox.entity.EzyArray;
import com.tvd12.ezyfox.entity.EzyObject;

public class JacksonObjectMapperBuilder implements EzyBuilder<ObjectMapper> {

	public static JacksonObjectMapperBuilder newInstance() {
		return new JacksonObjectMapperBuilder();
	}
	
	@Override
	public ObjectMapper build() {
		return new ObjectMapper()
				.registerModule(newModule());
	}
	
	protected Module newModule() {
		SimpleModule module = new SimpleModule();
		module.addSerializer(new JacksonArraySerializer(EzyArray.class));
		module.addSerializer(new JacksonObjectSerializer(EzyObject.class));
		return module;
	}
	
}
