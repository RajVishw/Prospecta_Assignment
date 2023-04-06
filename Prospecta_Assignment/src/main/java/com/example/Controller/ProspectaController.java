package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.CategoryException;
import com.example.Services.ProspectaServices;
import com.example.model.Entry;
import com.example.model.ResultDto;

@RestController
public class ProspectaController {
	@Autowired
	ProspectaServices op;
	
	@GetMapping("/entries/{category}")
	public ResponseEntity<List<ResultDto>> getEntriesHandler(@PathVariable("category") 
	String category) throws CategoryException{
		
		 List<ResultDto> lst=op.getTitleAndDesc(category);
		 return new ResponseEntity<List<ResultDto>>(lst,HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/entries")
	public ResponseEntity<String> saveEntriesHandler(@RequestBody Entry entry) {
		String s=op.saveEntry(entry);
		return new ResponseEntity<String>(s,HttpStatus.CREATED);
	}
	
}
