package com.tvd12.ezyfox.mapping.jackson;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.tvd12.ezyfox.builder.EzyBuilder;
import com.tvd12.ezyfox.entity.EzyArray;
import com.tvd12.ezyfox.entity.EzyObject;

public class EzyObjectMapperBuilder implements EzyBuilder<ObjectMapper> {

	public static EzyObjectMapperBuilder objectMapperBuilder() {
		return new EzyObjectMapperBuilder();
	}
	
	@Override
	public ObjectMapper build() {
		return new ObjectMapper()
				.registerModule(newModule());
	}
	
	protected Module newModule() {
		SimpleModule module = new SimpleModule();
		module.addSerializer(new EzyArraySerializer(EzyArray.class));
		module.addSerializer(new EzyObjectSerializer(EzyObject.class));
		return module;
	}
	
}
