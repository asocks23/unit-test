package org.zzia.info.junit.lesson05;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SpyingAnnotaionTest {
    @Spy
    private List<String> list = new ArrayList<>();

    @Test
    public void testSpy(){
        list.add("Mockito");
        list.add("PowerMock");
        //对部分方法进行mock，如果某个方法不mock则执行真实的方法，方法mock了，则按照mock的方式执行
        when(list.isEmpty()).thenReturn(true);
        when(list.size()).thenReturn(0);
        assertThat(list.get(0),equalTo("Mockito"));
        assertThat(list.get(1),equalTo("PowerMock"));
        assertThat(list.isEmpty(),equalTo(true));
        assertThat(list.size(),equalTo(0));
    }
}
