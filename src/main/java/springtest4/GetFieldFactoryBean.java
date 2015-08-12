package springtest4;

import java.lang.reflect.Field;

import org.springframework.beans.factory.FactoryBean;

public class GetFieldFactoryBean implements FactoryBean<Object> {

	private String targetClass;
	
	private String targetField;
	
	public void setTargetClass(String targetClass) {
		this.targetClass = targetClass;
	}
	
	public void setTargetField(String targetField) {
		this.targetField = targetField;
	}
	
	@Override
	public Object getObject() throws Exception {
		Class<?> clazz = Class.forName(targetClass);
		Field field = clazz.getField(targetField);
		return field.get(null);
	}

	@Override
	public Class<? extends Object> getObjectType() {
		return Object.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
