package com.ri.paramconverter.resource;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

@Provider
public class AccountNoParamConverterProvider implements ParamConverterProvider {

	@Override
	public <Object> ParamConverter<Object> getConverter(Class<Object> rawType, Type genericType,
			Annotation[] annotations) {
		ParamConverter<Object> paramConverter = null;

		System.out.println("getConverter()");
		if (rawType.isAssignableFrom(AccountNo.class)) {
			paramConverter = (ParamConverter<Object>) new AccountNoParamConverter();
		}
		return paramConverter;
	}

}
