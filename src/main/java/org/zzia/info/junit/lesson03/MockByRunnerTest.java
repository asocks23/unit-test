package org.zzia.info.junit.lesson03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.zzia.info.junit.common.dao.AccountDao;
import org.zzia.info.junit.common.entity.Account;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class MockByRunnerTest {
    @Test
    public void testMock(){
        AccountDao accountDao = mock(AccountDao.class);
        Account account = accountDao.findAccount("a", "b");
        System.out.println(account);
    }

}
