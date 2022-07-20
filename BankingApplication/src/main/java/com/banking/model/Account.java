package com.banking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

//import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Component
@Table(name="Account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Account_Id")
	private long accountId;
	
	
	@NotBlank(message="Account number required")
	@Size(min=10,max=10,message="Account number must have ten digits")
	@Column(name="Account_Number" ,unique=true)
	private long accountNumber;
	
	@Column(name="Account_Status")
	private String accountStatus;
	
	@Column(name="Account_Type")
	private String accountType;
	
	@Min(value=1,message="Must be greater than zero")
	@Column(name="Account_Balance")
	private int accountBalance;
	
	
	@Past(message="Enter a Valid Date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
	@Column(name="DOB",columnDefinition = "DATE")
	private Date dob;
	
    @NotNull
    @Column(name="EMAIL")
    private String email;
    
    @Size(min=10,max=10,message="Phone number should contain 10 digits")
    @Pattern(regexp="(0/91)?[6-9][0-9]{9}" ,message="Enter valid mobile number")
    @Column(name="Phone_Number")
    private String phoneNumber;
    
    @Min(value=1000,message ="MAB must be $1000 and above")
    @Column(name="Monthly_Average_Balance")
    private int mab;

    @Column(name="Tax_Id")
    private String taxId;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getMab() {
		return mab;
	}

	public void setMab(int mab) {
		this.mab = mab;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	
	
    
    
    
   
	

}
