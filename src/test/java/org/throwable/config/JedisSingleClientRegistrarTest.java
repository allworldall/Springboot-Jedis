package org.throwable.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.throwable.Application;
import org.throwable.annotation.EnableRedisClient;

import static org.junit.Assert.*;

/**
 * @author throwable
 * @version v1.0
 * @function
 * @since 2017/5/11 20:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@EnableRedisClient
public class JedisSingleClientRegistrarTest {

    @Autowired
    @Qualifier(value = "redisTemplate")
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void testRedisTemplate() throws Exception {
        redisTemplate.opsForValue().set("foo", "bar");
        assertEquals(redisTemplate.opsForValue().get("foo"), "bar");
    }

}