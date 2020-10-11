package br.com.heycristhian.provider.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class InfoProvider {

	@Id
	private String id;

	private String name;

	private String state;

	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String estado) {
		this.state = estado;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String endereco) {
		this.address = endereco;
	}

}
