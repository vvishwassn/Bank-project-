package com.tns.banking.services;
import java.util.Collection;
import java.util.List;
import com.tns.banking.entities.*;

public interface BankingService {
	void addCustomer(Customer customer);
	void addAccount(Account account);
	void addTransaction(Transaction transaction);
	void addBeneficiary(Beneficiary beneficiary);

	Customer findCustomerById(int id);
	Account findAccountById(int id);
	Transaction findTransactionById(int id);
	Beneficiary findBeneficiaryById(int id);

	Collection<Account> getAllAccounts();
	Collection<Customer> getAllCustomers();
	Collection<Transaction> getAllTransactions();
	Collection<Beneficiary> getAllBeneficiaries();

	List<Account> getAccountsByCustomerId(int customerId);
	List<Transaction> getTransactionsByAccountId(int accountId);
	List<Beneficiary> getBeneficiariesByCustomerId(int customerId);
}
