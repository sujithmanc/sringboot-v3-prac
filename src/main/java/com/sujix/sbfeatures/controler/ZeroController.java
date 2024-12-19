package com.sujix.sbfeatures.controler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ZeroController {

	@RequestMapping("/zero/{id}")
	public Map<String, String> getValues(@RequestHeader("love") String love, @PathVariable int id, @RequestParam String name) {
		System.out.printf("Path Variable %d, Request Param %s, Love is %s%n%n",id, name, love);
		Map<String, String> map = new HashMap<>();
		map.put("Name", "Sujith");
		map.put("Age", "25");
		map.put("Salary", "43_000");
		return map;
	}
	
	@PostMapping("/zeor/save")
	public void save(@RequestParam("file") MultipartFile file) {
		System.out.println(file);
	}
}
