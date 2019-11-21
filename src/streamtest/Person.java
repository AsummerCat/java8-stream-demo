package streamtest;

class Person {
	String name;
	String com;
	Integer age;
	Integer house;

	public Person(String name, String com, Integer age, Integer house) {
		this.name = name;
		this.com = com;
		this.age = age;
		this.house = house;
	}

	public Integer getHouse() {
		return house;
	}

	public void setHouse(Integer house) {
		this.house = house;
	}

	public Person() {
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, String com, Integer age) {
		this.name = name;
		this.com = com;
		this.age = age;
	}

	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", com='" + com + '\'' +
				", age=" + age +
				", house=" + house +
				'}';
	}
}