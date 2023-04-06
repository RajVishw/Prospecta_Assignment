package com.example.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ApiDataModel {
	private int count;
	private List<Entry> entries;
	public ApiDataModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiDataModel(int count, List<Entry> entries) {
		super();
		this.count = count;
		this.entries = entries;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Entry> getEntries() {
		return entries;
	}
	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
	
	
}
