package com.tvd12.ezyfox.hazelcast.entity;

import com.tvd12.ezyfox.hazelcast.entity.EzyAbstractAccount;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EzyMongoAccount extends EzyAbstractAccount {
	private static final long serialVersionUID = 3884020036545997524L;
	
	private Long id;
	
}
