package br.com.heycristhian.store.controller.dto;

public class InfoOrderDTO {

	private Long id;
	public Integer preparationTime;

	public Integer getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(Integer preparationTime) {
		this.preparationTime = preparationTime;
	}

	public Long getId() {
		return id;
	}

}
