package com.paneedah.weaponlib.config.novel;

import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.client.config.ConfigGuiType;
import net.minecraftforge.fml.client.config.DummyConfigElement;

import java.lang.reflect.Field;

public class SynchronizedConfigElement extends DummyConfigElement {
	
	private Field relatedField;
	private String registryName;

	public SynchronizedConfigElement(Field relatedField, String name, String registryName, Object defaultValue, ConfigGuiType typeOfParameter, String langKey) {
		super(name, defaultValue, typeOfParameter, langKey);
		this.relatedField = relatedField;
		this.registryName = registryName;
	}
	
	public SynchronizedConfigElement(Field relatedField, String name, String registryName, Object defaultValue, ConfigGuiType typeOfParameter, String langKey, Object minValue, Object maxValue) {
		super(name, defaultValue, typeOfParameter, langKey, null, null, minValue, maxValue);
		this.relatedField = relatedField;
		this.registryName = registryName;
	}
	
	
	
	@Override
	public boolean requiresMcRestart() {
		return super.requiresMcRestart();
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return I18n.format(registryName);
	}
	
	@Override
	public String getQualifiedName() {
		// TODO Auto-generated method stub
		return super.getQualifiedName();
	}
	
	@Override
	public void set(Object value) {
		
		// Sync value with config
		ModernConfigManager.updateField(this.relatedField, value);
		
		this.value = value;
		
		super.set(value);
	}
	
	@Override
	public void set(Object[] aVal) {
		System.out.println("CEO 2");
		// TODO Auto-generated method stub
		super.set(aVal);
	}
	
	

}
