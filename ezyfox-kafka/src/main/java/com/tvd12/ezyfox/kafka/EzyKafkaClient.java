package com.tvd12.ezyfox.kafka;

import java.util.concurrent.Future;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

import com.tvd12.ezyfox.kafka.message.EzyKafkaMessage;
import com.tvd12.ezyfox.util.EzyFlushable;
import com.tvd12.ezyfox.util.EzyShutdownable;

public interface EzyKafkaClient extends EzyFlushable, EzyShutdownable {

	Future<?> send(EzyKafkaMessage message);
	
	RecordMetadata sync(EzyKafkaMessage message);
	
	void async(EzyKafkaMessage message, Callback callback);
	
}
