package com.tvd12.ezyfox.mapping.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.tvd12.ezyfox.entity.EzyArray;

public class EzyArraySerializer extends StdSerializer<EzyArray> {
	private static final long serialVersionUID = 47227884568344818L;
	
	public EzyArraySerializer(Class<EzyArray> t) {
		super(t);
	}

	@Override
	public void serialize(EzyArray value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.getCodec().writeValue(gen, value.toList());
	}
	
	

}
