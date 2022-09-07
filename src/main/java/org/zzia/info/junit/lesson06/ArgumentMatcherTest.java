package org.zzia.info.junit.lesson06;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ArgumentMatcherTest {
    @Test
    public void testComplex() {
        List<Integer> list = mock(ArrayList.class);
        when(list.get(0)).thenReturn(100);
        assertThat(list.get(0),equalTo(100));
    }

    @Test
    public void testComplex2() {
        List<Integer> list = mock(ArrayList.class);
        when(list.get(eq(0))).thenReturn(100);
        assertThat(list.get(0),equalTo(100));
        assertThat(list.get(1),nullValue());
    }

    /**
     * isA()
     */
    @Test
    public void testComplex3() {
        Foo foo = mock(Foo.class);
        when(foo.function(Mockito.isA(Parent.class))).thenReturn(100);
        int result = foo.function(new Child1());
        assertThat(result,equalTo(100));

        int result2 = foo.function(new Child2());
        assertThat(result2,equalTo(100));
    }

    /**
     * isA()
     */
    @Test
    public void testComplex4() {
        Foo foo = mock(Foo.class);
        when(foo.function(Mockito.isA(Child1.class))).thenReturn(100);
//        int result = foo.function(new Child1());
//        assertThat(result,equalTo(100));

        int result2 = foo.function(new Child2());
        assertThat(result2,equalTo(100));
    }

    /**
     * any()
     */
    @Test
    public void testComplex5() {
        Foo foo = mock(Foo.class);
        when(foo.function(Mockito.any(Child1.class))).thenReturn(100);
//        int result = foo.function(new Child1());
//        assertThat(result,equalTo(100));

        int result2 = foo.function(new Child2());
        assertThat(result2,equalTo(100));
    }


    static class Foo{
        int function(Parent p){
            return p.work();
        }
    }
    interface Parent{
        int work();
    }
    class  Child1 implements Parent{

        @Override
        public int work() {
            return 0;
        }
    }
    class  Child2 implements Parent{

        @Override
        public int work() {
            return 0;
        }
    }
}