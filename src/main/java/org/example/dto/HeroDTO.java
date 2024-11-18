package org.example.dto;

public class HeroDTO {

	private long id;
	private String name;
	private String aka;

	public HeroDTO(String name, String aka) {
		this.name = name;
		this.aka = aka;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAka() {
		return aka;
	}

	public void setAka(String aka) {
		this.aka = aka;
	}
}

