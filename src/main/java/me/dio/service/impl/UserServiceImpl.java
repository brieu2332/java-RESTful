package com.example.santanderdevweek.service;

import com.example.santanderdevweek.data.local.Transaction;
import com.example.santanderdevweek.data.local.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private static final Map<Integer, User> userRepository = new HashMap<>();
    private static final List<Transaction> transactionRepository = new ArrayList<>();
    private static int idCounter = 0;
    private static int transactionCounter = 0;

    @Override
    public User getUserById(int id) {
        return userRepository.get(id);
    }

    @Override
    public void createUser(User user) {
        userRepository.put(++idCounter, user);
    }

    @Override
    public void performTransaction(Transaction transaction) {
        // Business logic to handle the transaction
        if ("DEPOSIT".equals(transaction.getType())) {
            transaction.getToAccount().setBalance(transaction.getToAccount().getBalance() + transaction.getAmount());
        } else if ("WITHDRAW".equals(transaction.getType())) {
            transaction.getFromAccount().setBalance(transaction.getFromAccount().getBalance() - transaction.getAmount());
        } else if ("TRANSFER".equals(transaction.getType())) {
            transaction.getFromAccount().setBalance(transaction.getFromAccount().getBalance() - transaction.getAmount());
            transaction.getToAccount().setBalance(transaction.getToAccount().getBalance() + transaction.getAmount());
        }
        transaction.setId(++transactionCounter);
        transaction.setDate(new Date());
        transactionRepository.add(transaction);
    }
}
