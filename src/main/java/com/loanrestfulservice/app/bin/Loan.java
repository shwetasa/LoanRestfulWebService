
package com.loanrestfulservice.app.bin;

import java.util.ArrayList;
import java.util.List;

public class Loan {

    private int creditScore;
    private String carManufacturer;
    private int carModelYear;
    private List<BankAndInterest> bankAndInterest;

    public int getCreditScore() {
        return creditScore;
    }

    /**
     * Sets the value of the creditScore property.
     * 
     */
    public void setCreditScore(int value) {
        this.creditScore = value;
    }

    /**
     * Gets the value of the carManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarManufacturer() {
        return carManufacturer;
    }

    /**
     * Sets the value of the carManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarManufacturer(String value) {
        this.carManufacturer = value;
    }

    /**
     * Gets the value of the carModelYear property.
     * 
     */
    public int getCarModelYear() {
        return carModelYear;
    }

    /**
     * Sets the value of the carModelYear property.
     * 
     */
    public void setCarModelYear(int value) {
        this.carModelYear = value;
    }

  
    public List<BankAndInterest> getBankAndInterest() {
        if (bankAndInterest == null) {
            bankAndInterest = new ArrayList<BankAndInterest>();
        }
        return this.bankAndInterest;
    }

}
