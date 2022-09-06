package org.zzia.info.junit.controller;

import org.zzia.info.junit.dao.AccountDao;
import org.zzia.info.junit.entity.Account;

public class AccountLoginController {
    private AccountDao accountDao ;
    public String login(String name ,String password){
        Account account = accountDao.findAccount(name, password);
        if(account==null){
            return "login failure";
        }else {
            return "login success";
        }

    }

    public AccountLoginController(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
