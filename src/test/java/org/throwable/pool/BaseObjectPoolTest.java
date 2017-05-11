package org.throwable.pool;

import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @author throwable
 * @version v1.0
 * @function
 * @since 2017/5/11 9:51
 */
public class BaseObjectPoolTest {

    private GenericObjectPool<BaseObject> pool;

    @Before
    public void setUp() throws Exception {
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        config.setMaxWaitMillis(1000);
        config.setMaxTotal(4);
        pool = new GenericObjectPool<>(new BaseObjectPoolableFactory(), config);
    }

    @Test
    public void testPool() throws Exception {
        System.out.println("maxTotal: " + pool.getMaxTotal());
        BaseObject baseObject1 = pool.borrowObject();
        BaseObject baseObject2 = pool.borrowObject();
        BaseObject baseObject3 = pool.borrowObject();
        BaseObject baseObject4 = pool.borrowObject();
        pool.returnObject(baseObject4);
        BaseObject baseObject5 = pool.borrowObject();

    }
}
