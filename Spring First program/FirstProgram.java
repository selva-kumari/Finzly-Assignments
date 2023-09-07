package com.selva.SpringProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstProgram {
    @RequestMapping("name")
	String getName() {
	    return "Finzly";
}
    @RequestMapping("num")
    int getNume() {
    	return 8;
    }
    
	@RequestMapping("new")
	
	List<String> getList(){
    List<String> list=new ArrayList<>();
	list.add("kiddo");
	list.add("cringe");
	list.add("vjselva");

	return list;
	}
	@RequestMapping("map")
	HashMap<Integer,String> getMap(){
	HashMap<Integer,String>map=new HashMap<>();
	map.put(101,"selva");
	map.put(102,"vjselva");
	return map;
	
	}
	
	
	
    
    
}
