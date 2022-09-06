package org.zzia.info.junit.lesson03;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class DeepMockTest {
    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
    private Lesson03Service lesson03Service;
    @Mock
    private Lesson03 lesson03 ;
    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    /**
     * 深度mock 没有stubbing 报错
     */
    @Test
    public void testDeep(){
        lesson03Service.getLesson03().foo();
    }

    /**
     * 通过stubbing深度mock
     */
    @Test
    public void testDeep2(){
        when(lesson03Service.getLesson03()).thenReturn(lesson03);
        lesson03.foo();
    }

    /**
     * 通过在@mock注解上加Answers.RETURN_DEEP_STUBS mock注解的是宿主类，宿主的依赖类会通过深度注解注入
     */
    @Test
    public void testDeep3(){
        lesson03Service.getLesson03().foo();
    }
}
