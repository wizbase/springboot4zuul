package com.hs.api.configclient.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BankAccount {
	

	private String accountId;
	private String accountName;
	private EnumAccountType accountType;
	private BigDecimal accountBlance;
	
	

	public BankAccount(String accountId, String accountName, EnumAccountType accountType, BigDecimal accountBlance) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountType = accountType;
		this.accountBlance = accountBlance;
	}



	public String getAccountId() {
		return accountId;
	}



	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}



	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public EnumAccountType getAccountType() {
		return accountType;
	}



	public void setAccountType(EnumAccountType accountType) {
		this.accountType = accountType;
	}



	public BigDecimal getAccountBlance() {
		return accountBlance;
	}



	public void setAccountBlance(BigDecimal accountBlance) {
		this.accountBlance = accountBlance;
	}



}
