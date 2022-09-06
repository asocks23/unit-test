package org.zzia.info.junit.common.controller;

import org.zzia.info.junit.common.entity.Account;
import org.zzia.info.junit.common.dao.AccountDao;

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
