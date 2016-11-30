package me.lv.spring.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionBean {
	private String name = "no property";
	private List<String> listProperty = null;
	private Map<String, String> mapProperty = null;

	public void sayHello() {
		System.out.println("from ConnectionBean : " + name);
	}

	public void listProperties() {
		System.out.println("List Properties : " + Arrays.toString(listProperty.toArray()));
	}

	public void mapProperties() {
		for (Entry<String, String> entry : mapProperty.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getListProperty() {
		return listProperty;
	}

	public void setListProperty(List<String> listProperty) {
		this.listProperty = listProperty;
	}

	public Map<String, String> getMapProperty() {
		return mapProperty;
	}

	public void setMapProperty(Map<String, String> mapProperty) {
		this.mapProperty = mapProperty;
	}

}
