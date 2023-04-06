package com.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.Exception.CategoryException;
import com.example.Repository.ApiModelRepo;
import com.example.model.ApiDataModel;
import com.example.model.Entry;
import com.example.model.ResultDto;


@Service
public class ProspectaServiceImpl implements ProspectaServices {
	
	@Autowired
	ApiModelRepo jpa;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public List<ResultDto> getTitleAndDesc(String category) throws CategoryException {
		
		 ApiDataModel admn=	restTemplate.getForObject("https://api.publicapis.org/entries", ApiDataModel.class);
		 List<Entry> entries= admn.getEntries();
		 
		 List<ResultDto> lst= entries.stream().filter(e -> e.getCategory().equals(category))
				 .map(e -> new ResultDto(e.getApi(), e.getDescription())).toList();
			
		 if(lst.size()==0) throw new CategoryException("No Data found");
		 
		 return lst;
	}

	@Override
	public String saveEntry(Entry entry) {
		// TODO Auto-generated method stub
		 List<Entry> en= jpa.findAll();
			if(en.size()==0) {
			 ApiDataModel admn=	restTemplate.getForObject("https://api.publicapis.org/entries",
					 ApiDataModel.class);
			 
			 List<Entry> entries= admn.getEntries();
			 for(Entry enty:entries) {
				 jpa.save(enty);
			 }
			 jpa.save(entry);
			}
			else {
				jpa.save(entry);
			}
			
			
			return "Data Saved on Database";
	}

}
