package com.tvd12.ezyfox.mapping.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.tvd12.ezyfox.entity.EzyObject;

public class EzyObjectSerializer extends StdSerializer<EzyObject> {
	private static final long serialVersionUID = 1033303749441882688L;
	
	public EzyObjectSerializer(Class<EzyObject> t) {
		super(t);
	}

	@Override
	public void serialize(EzyObject value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.getCodec().writeValue(gen, value.toMap());
	}
	
}
