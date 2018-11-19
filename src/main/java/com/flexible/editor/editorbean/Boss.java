package com.flexible.editor.editorbean;

public class Boss {
	private String name;
	private Car car = new Car();

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Boss{" +
				"name='" + name + '\'' +
				", car=" + car +
				'}';
	}
}
