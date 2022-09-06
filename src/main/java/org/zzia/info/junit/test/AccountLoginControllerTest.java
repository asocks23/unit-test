package org.zzia.info.junit.test;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.zzia.info.junit.controller.AccountLoginController;
import org.zzia.info.junit.dao.AccountDao;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
import org.zzia.info.junit.entity.Account;
@RunWith(MockitoJUnitRunner.class)
public class AccountLoginControllerTest {
    private AccountDao accountDao ;
    private AccountLoginController accountLoginController ;
    @Before
    public void setUp(){
        this.accountDao = Mockito.mock(AccountDao.class);
        accountLoginController = new AccountLoginController(accountDao) ;
    }
    @Test
    public void testLogin() {
        when(accountDao.findAccount(anyString(),anyString())).thenReturn(new Account());
//        String login = accountLoginController.login("a", "b");
        assertThat(accountLoginController.login("a", "b"),equalTo("login success"));
    }
}