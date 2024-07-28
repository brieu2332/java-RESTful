package com.example.santanderdevweek.service;

import com.example.santanderdevweek.data.local.Transaction;
import com.example.santanderdevweek.data.local.User;

public interface UserService {
    User getUserById(int id);
    void createUser(User user);
    void performTransaction(Transaction transaction);
}
