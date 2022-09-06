/**
 * mock对象的3种方式
 * 方式1：@RunWith(MockitoJUnitRunner.class) 和 mock()方法
 * 方式2：MockitoAnnotations.initMocks(this); 和 @mock注解 此时不需要@Runwith的注解了
 * 方式3：@Rule 也不需要@Runwith注解
 *  public MockitoRule mockitoRule = MockitoJUnit.rule();
 */

package org.zzia.info.junit.lesson03;