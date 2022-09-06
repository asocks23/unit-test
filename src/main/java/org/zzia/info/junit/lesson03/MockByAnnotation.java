package org.zzia.info.junit.lesson03;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.zzia.info.junit.common.dao.AccountDao;
import org.zzia.info.junit.common.entity.Account;

/**
 * mock的第二种方式,通过注解@mock的形式，同时需要初始化宿主对象this
 * 此时测试类不需要@RunWith的注解
 */
public class MockByAnnotation {
    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    private AccountDao accountDao ;
    @Test
    public void testMock(){
        Account account = accountDao.findAccount("a", "b");
        System.out.println(account);
    }
}
