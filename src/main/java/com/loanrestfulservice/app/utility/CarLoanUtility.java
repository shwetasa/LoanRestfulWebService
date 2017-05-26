package com.loanrestfulservice.app.utility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.loanrestfulservice.app.bin.BankAndInterest;
import com.loanrestfulservice.app.bin.Carloan;

@Component
public class CarLoanUtility {
	public static Carloan getCarLoanForHonda(int creditScore, String carManufacturer, int carModelYear, int monthlySalary) {
		Carloan loan = new Carloan();
		loan.setCarManufacturer(carManufacturer);
		loan.setCarModelYear(carModelYear);
		loan.setCreditScore(creditScore);
		loan.setLoanDuration(6);
		List<BankAndInterest> bankAndInterestList = new ArrayList<BankAndInterest>();
		BankAndInterest bankAndInterest = new BankAndInterest();
		BankAndInterest bankAndInterest1 = new BankAndInterest();
		if(monthlySalary >2000 && carModelYear > 2008){
			if (creditScore > 700) {
				bankAndInterest.setBankName("University of Michigan Credit Union");
				bankAndInterest.setInterestRate(2.5);
				bankAndInterest1.setBankName("Bank Of America");
				bankAndInterest1.setInterestRate(3.5);
			} else if(creditScore > 500) {
				bankAndInterest.setBankName("University of Michigan Credit Union");
				bankAndInterest.setInterestRate(3.5);
				bankAndInterest1.setBankName("Bank Of America");
				bankAndInterest1.setInterestRate(5.5);
			}else {
				bankAndInterest.setBankName("Synovus Financial");
				bankAndInterest.setInterestRate(11.5);
				bankAndInterest1.setBankName("Doral Financial");
				bankAndInterest1.setInterestRate(12.5);
			}
		}else if(monthlySalary >2000 && carModelYear < 2008){
				bankAndInterest.setBankName("University of Michigan Credit Union");
				bankAndInterest.setInterestRate(6.5);
				bankAndInterest1.setBankName("Bank Of America");
				bankAndInterest1.setInterestRate(7.5);
			}
			else {
			bankAndInterest.setBankName("Doral Financial");
			bankAndInterest.setInterestRate(11.5);
			bankAndInterest1.setBankName("Synovus Financial");
			bankAndInterest1.setInterestRate(12.5);
		}
		loan.setCreditScore(creditScore);
		List<BankAndInterest> existingBankAndInterest = loan.getBankAndInterest();
		existingBankAndInterest.add(bankAndInterest);
		existingBankAndInterest.add(bankAndInterest1);
		bankAndInterestList.add(bankAndInterest);
		return loan;
	}

	public static Carloan getCarLoanForToyota(int creditScore, String carManufacturer, int carModelYear, int monthlySalary) {
		Carloan loan = new Carloan();
		loan.setCarManufacturer(carManufacturer);
		loan.setCarModelYear(carModelYear);
		loan.setCreditScore(creditScore);
		loan.setLoanDuration(6);
		List<BankAndInterest> bankAndInterestList = new ArrayList<BankAndInterest>();
		BankAndInterest bankAndInterest = new BankAndInterest();
		BankAndInterest bankAndInterest1 = new BankAndInterest();
		if(monthlySalary >2000 && carModelYear > 2008){
			if (creditScore > 700 ) {
				bankAndInterest.setBankName("University of Michigan Credit Union");
				bankAndInterest.setInterestRate(3.5);
				bankAndInterest1.setBankName("Bank Of America");
				bankAndInterest1.setInterestRate(4.5);
			} else if(creditScore > 500){
				bankAndInterest.setBankName("University of Michigan Credit Union");
				bankAndInterest.setInterestRate(4.5);
				bankAndInterest1.setBankName("Bank Of America");
				bankAndInterest1.setInterestRate(6.5);
			}else {
				bankAndInterest.setBankName("Synovus Financial");
				bankAndInterest.setInterestRate(12.5);
				bankAndInterest1.setBankName("Doral Financial");
				bankAndInterest1.setInterestRate(13.5);
			}
		}else if(monthlySalary >2000 && carModelYear < 2008){
			bankAndInterest.setBankName("University of Michigan Credit Union");
			bankAndInterest.setInterestRate(7.5);
			bankAndInterest1.setBankName("Bank Of America");
			bankAndInterest1.setInterestRate(8.5);
		}else {
			bankAndInterest.setBankName("Synovus Financial");
			bankAndInterest.setInterestRate(12.5);
			bankAndInterest1.setBankName("Doral Financial");
			bankAndInterest1.setInterestRate(13.5);
		}
		loan.setCreditScore(creditScore);
		List<BankAndInterest> existingBankAndInterest = loan.getBankAndInterest();
		existingBankAndInterest.add(bankAndInterest);
		existingBankAndInterest.add(bankAndInterest1);
		bankAndInterestList.add(bankAndInterest);
		return loan;
	}

	public static Carloan getCarLoanForOtherBrands(int creditScore, String carManufacturer, int carModelYear,int monthlySalary) {
		Carloan loan = new Carloan();
		loan.setCarManufacturer(carManufacturer);
		loan.setCarModelYear(carModelYear);
		loan.setCreditScore(creditScore);
		loan.setLoanDuration(6);
		List<BankAndInterest> bankAndInterestList = new ArrayList<BankAndInterest>();
		BankAndInterest bankAndInterest = new BankAndInterest();
		BankAndInterest bankAndInterest1 = new BankAndInterest();
		bankAndInterest.setBankName("University of Michigan Credit Union");
		bankAndInterest.setInterestRate(10.5);
		bankAndInterest1.setBankName("Bank Of America");
		bankAndInterest1.setInterestRate(11.5);
		loan.setCreditScore(creditScore);
		List<BankAndInterest> existingBankAndInterest = loan.getBankAndInterest();
		existingBankAndInterest.add(bankAndInterest);
		existingBankAndInterest.add(bankAndInterest1);
		bankAndInterestList.add(bankAndInterest);
		return loan;
	}

	public static Carloan getCarLoan(int creditScore, String carManufacturer, int carModelYear, int monthlySalary) {
		Carloan loan = new Carloan();
		if (carManufacturer.equalsIgnoreCase("Honda")) {
			loan = getCarLoanForHonda(creditScore, carManufacturer, carModelYear,monthlySalary);
		} else if (carManufacturer.equalsIgnoreCase("Toyota")) {
			loan = getCarLoanForToyota(creditScore, carManufacturer, carModelYear,monthlySalary);
		} else {
			loan = getCarLoanForOtherBrands(creditScore, carManufacturer, carModelYear,monthlySalary);
		}
		return loan;
	}

}
