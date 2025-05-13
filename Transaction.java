package com.tns.banking.entities;
import java.time.LocalDateTime;

public class Transaction {
	private static int idCounter = 1;
	private int transactionID;
	private int accountID;
	private String type;
	private double amount;
	private LocalDateTime timestamp;
	public Transaction(int accountID, String type, double amount) {
		this.transactionID = idCounter++;
		this.accountID = accountID;
		this.type = type;
		this.amount = amount;
		this.timestamp = LocalDateTime.now();
	}
	public int getTransactionID() { return transactionID; }
	public int getAccountID() { return accountID; }
	public String getType() { return type; }
	public double getAmount() { return amount; }
	public LocalDateTime getTimestamp() { return timestamp; }
}