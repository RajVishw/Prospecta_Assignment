package com.example.Services;

import java.util.List;

import com.example.Exception.CategoryException;
import com.example.model.Entry;
import com.example.model.ResultDto;

public interface ProspectaServices {
	List<ResultDto> getTitleAndDesc(String category) throws CategoryException;
	public String saveEntry(Entry entry);
}
