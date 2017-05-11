package org.throwable.pool;

/**
 * @author throwable
 * @version v1.0
 * @function
 * @since 2017/5/10 20:57
 */
public class BaseObject {

    private int num;
    private boolean active;

    public BaseObject() {
        this.active = true;
        System.out.println("new BaseObject()...");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "BaseObject{" +
                "num=" + num +
                ", active=" + active +
                '}';
    }
}
