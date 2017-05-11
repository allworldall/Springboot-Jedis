package org.throwable.pool;

import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;

/**
 * @author throwable
 * @version v1.0
 * @function
 * @since 2017/5/10 21:00
 */
public class BaseObjectPoolableFactory implements PooledObjectFactory<BaseObject> {

    @Override
    public PooledObject<BaseObject> makeObject() throws Exception {
        System.out.println("call makeObject");
        BaseObject baseObject = new BaseObject();
        baseObject.setNum(1);
        return new DefaultPooledObject<>(baseObject);
    }

    @Override
    public void destroyObject(PooledObject<BaseObject> p) throws Exception {
        System.out.println("call destroyObject");
        BaseObject baseObject = p.getObject();
        baseObject.setNum(0);
        baseObject.setActive(false);
    }

    @Override
    public boolean validateObject(PooledObject<BaseObject> p) {
        System.out.println("call validateObject");
        return p.getObject().getNum() > 0;
    }

    @Override
    public void activateObject(PooledObject<BaseObject> p) throws Exception {
        System.out.println("call activateObject");
        p.getObject().setActive(true);
    }

    @Override
    public void passivateObject(PooledObject<BaseObject> p) throws Exception {
        System.out.println("call passivateObject");
    }
}
