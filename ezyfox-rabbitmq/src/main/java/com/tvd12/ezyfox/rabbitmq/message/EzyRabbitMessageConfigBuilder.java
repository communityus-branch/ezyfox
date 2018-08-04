package com.tvd12.ezyfox.rabbitmq.message;

import com.tvd12.ezyfox.builder.EzyBuilder;

public class EzyRabbitMessageConfigBuilder implements EzyBuilder<EzyRabbitMessageConfig> {

	protected Class<?> bodyType;
	
	public static EzyRabbitMessageConfigBuilder messageConfigBuilder() {
		return new EzyRabbitMessageConfigBuilder();
	}
	
	public EzyRabbitMessageConfigBuilder bodyType(Class<?> bodyType) {
		this.bodyType = bodyType;
		return this;
	}
	
	@Override
	public EzyRabbitMessageConfig build() {
		EzyRabbitSimpleMessageConfig config = new EzyRabbitSimpleMessageConfig();
		config.setBodyType(bodyType);
		return config;
	}
	
}
