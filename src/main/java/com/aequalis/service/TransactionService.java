/**
 * 
 */
package com.aequalis.service;

import java.util.List;

import com.aequalis.model.Transaction;
import com.aequalis.model.User;

/**
 * @author anand
 *
 */
public interface TransactionService {
	public void addTransaction(Transaction transaction);
	
	public List<Transaction> findByUser(User user);
	
	public List<Transaction> findByCutomeraddress(String cutomeraddress);
}
