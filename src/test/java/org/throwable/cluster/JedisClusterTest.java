package org.throwable.cluster;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.throwable.Application;
import org.throwable.annotation.EnableRedisCluster;
import redis.clients.jedis.JedisCluster;

/**
 * @author throwable
 * @version v1.0
 * @function
 * @since 2017/5/11 11:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@EnableRedisCluster
public class JedisClusterTest {

    @Autowired
    private JedisCluster jedisCluster;

    @Test
    public void testJedisCluster() throws Exception {
        jedisCluster.set("foo", "bar");
        System.out.println("get foo :" + jedisCluster.get("foo"));
    }
}
