package com.loanrestfulservice.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loanrestfulservice.app.bin.Carloan;
import com.loanrestfulservice.app.bin.CarloanRequest;
import com.loanrestfulservice.app.bin.CarloanResponse;
import com.loanrestfulservice.app.utility.CarLoanUtility;

@RestController
public class LoanController {
	@RequestMapping(value = "/getLoanRequest/{creditScore}/{carManufacturer}/{carModelYear}/{monthlySalary}", method = RequestMethod.GET,headers="Accept=text/xml", produces={"text/xml"})
	public  ResponseEntity<CarloanResponse> getCarLoan(@PathVariable int creditScore,@PathVariable String carManufacturer, @PathVariable int carModelYear,@PathVariable int monthlySalary)
	{
		Carloan returnCarloan = null;
		CarloanResponse carloanResponse = new CarloanResponse();
		try {
			returnCarloan = CarLoanUtility.getCarLoan(creditScore, carManufacturer, carModelYear,monthlySalary);
			carloanResponse.setCarloan(returnCarloan);
		} catch (Exception e) {
			carloanResponse.setError("Bad request:Exception");
			return new ResponseEntity<CarloanResponse>(carloanResponse, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<CarloanResponse>(carloanResponse, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getCarLoan", method = RequestMethod.POST,produces={"application/xml"},headers="Accept=text/xml,")
	public ResponseEntity<CarloanResponse> getCarLoanForCustomer(@RequestBody CarloanRequest carloanRequest)
	{
		Carloan returnCarloan;
		CarloanResponse carloanResponse = new CarloanResponse();
		try {
			returnCarloan = CarLoanUtility.getCarLoan(carloanRequest.getCreditScore(), carloanRequest.getCarManufacturer(), carloanRequest.getCarModelYear(),carloanRequest.getMonthlySalary());
			carloanResponse.setCarloan(returnCarloan);
		} catch (Exception e) {
			carloanResponse.setError("Bad request:Exception");
			return new ResponseEntity<CarloanResponse>(carloanResponse, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<CarloanResponse>(carloanResponse, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/sendEmail/{bookName}/{profEmailId}/{bookPublication}", method = RequestMethod.GET,headers="Accept=text/xml", produces={"text/xml"})
	public  String sendEmail(@PathVariable int creditScore,@PathVariable String carManufacturer, @PathVariable int carModelYear,@PathVariable int monthlySalary)
	{
		String message = null;
		try {
			
		} catch (Exception e) {
			
		}
		return message;
	}
	
}
