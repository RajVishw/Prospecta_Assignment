package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Entry {
	
	
	@Id
	@JsonProperty("API")
	private String api;
	
	@JsonProperty("Description")
	private String description;
	
	@JsonProperty("Auth")
	private String auth;
	
	@JsonProperty("HTTPS")
	private boolean hTTPS;
	
	@JsonProperty("Cors")
	private String cors;
	
	@JsonProperty("Category")
	private String category;

	public Entry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entry(String api, String description, String auth, boolean hTTPS, String cors, String category) {
		super();
		this.api = api;
		this.description = description;
		this.auth = auth;
		this.hTTPS = hTTPS;
		this.cors = cors;
		this.category = category;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public boolean ishTTPS() {
		return hTTPS;
	}

	public void sethTTPS(boolean hTTPS) {
		this.hTTPS = hTTPS;
	}

	public String getCors() {
		return cors;
	}

	public void setCors(String cors) {
		this.cors = cors;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
