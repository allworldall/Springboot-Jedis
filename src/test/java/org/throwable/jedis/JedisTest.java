package org.throwable.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author throwable
 * @version v1.0
 * @function
 * @since 2017/5/10 20:00
 */
public class JedisTest {

    @Test
    public void testJedis()throws Exception{
        Jedis jedis = new Jedis("localhost",6379);
        jedis.set("foo","bar");
        System.out.println("get foo from redis:" + jedis.get("foo"));
    }
}
