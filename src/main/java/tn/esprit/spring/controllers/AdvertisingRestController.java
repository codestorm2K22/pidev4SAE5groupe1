package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entites.Advertising;
import tn.esprit.spring.services.IAdvertisingService;

@RestController
public class AdvertisingRestController {
	

	@Autowired
	IAdvertisingService AdvertisingService; // interface
	
	@GetMapping("/retrieveAllAdvertisings")
	@ResponseBody
	//http://localhost:8089/SpringMVC/retrieveAllAdvertisings
	public List<Advertising> getAdvertisings(){
		List<Advertising> list =  AdvertisingService.retrieveAllAdvertisings();
		return list;
	}
	

	@GetMapping("/retrieveAdvertising/{Advertising-id}")
	@ResponseBody
	//http://localhost:8089/SpringMVC/retrieveAdvertising/{Advertising-id}
	public Advertising retrieveAdvertising(@PathVariable("Advertising-id") Long AdvertisingId){
		Advertising c =  AdvertisingService.retrieveAdvertising(AdvertisingId);
		return c;
	}
	
	
	@PostMapping("/addAdvertising")
	@ResponseBody
	//http://localhost:8089/SpringMVC/addAdvertising
	public Advertising addAdvertising (@RequestBody Advertising newAdvertising) {
		return AdvertisingService.addAdvertising(newAdvertising);
		
	}
	
	//http://localhost:8089/SpringMVC/modifyAdvertising
	@PutMapping("/modifyAdvertising")
	@ResponseBody
	public Advertising modifyAdvertising (@RequestBody Advertising Advertising) {
		return AdvertisingService.updateAdvertising(Advertising);
		
	}
	
	//http://localhost:8089/SpringMVC/deleteAdvertising/{Advertising-id}
	@DeleteMapping("/deleteAdvertising/{Advertising-id}")
	@ResponseBody
	public void deleteAdvertising (@PathVariable("Advertising-id") Long AdvertisingId) {
		 AdvertisingService.deleteAdvertisingById(AdvertisingId);
	}
	
	
	
}
