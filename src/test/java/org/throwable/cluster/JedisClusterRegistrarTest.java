package org.throwable.cluster;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.throwable.Application;
import org.throwable.annotation.EnableRedisCluster;

/**
 * @author throwable
 * @version v1.0
 * @function
 * @since 2017/5/11 11:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@EnableRedisCluster
public class JedisClusterRegistrarTest {

    @Test
    public void testRegistrar()throws Exception{
        System.out.println("ssss");
    }
}
