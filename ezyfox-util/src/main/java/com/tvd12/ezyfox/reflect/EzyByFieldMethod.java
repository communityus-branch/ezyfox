package com.tvd12.ezyfox.reflect;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

import com.tvd12.ezyfox.reflect.EzyGenericElement;
import com.tvd12.ezyfox.reflect.EzyKnownTypeElement;
import com.tvd12.ezyfox.reflect.EzyMethod;

public abstract class EzyByFieldMethod 
		extends EzyMethod 
		implements EzyGenericElement, EzyKnownTypeElement {

	public EzyByFieldMethod(Method method) {
		super(method);
	}
	
	public String getFieldName() {
		String name = method.getName();
		name = name.substring(3);
		return name.substring(0, 1).toLowerCase() + name.substring(1);
	}
	
	public boolean isMapType() {
		return Map.class.isAssignableFrom(getType());
	}
	
	public boolean isCollection() {
		return Collection.class.isAssignableFrom(getType());
	}

}
