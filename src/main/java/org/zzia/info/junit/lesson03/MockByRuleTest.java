package org.zzia.info.junit.lesson03;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.zzia.info.junit.common.dao.AccountDao;
import org.zzia.info.junit.common.entity.Account;

import static org.mockito.Mockito.mock;

/**
 * mock的第三种方式
 */
public class MockByRuleTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @Test
    public void testMock(){
        AccountDao dao = mock(AccountDao.class);
        Account account = dao.findAccount("a", "b");
        System.out.println(account);
    }
}
