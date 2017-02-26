package com.luoamin.observer.test1;
/**
 * jdk支持观察者模式的代码，有观察者和被观察者。
 * @author john
 *
 */
public class JdkObserverSupportParse {
	/*
	//观察者接口，每一个观察者都必须实现这个接口
	public interface Observer {
    //这个方法是观察者在观察对象产生变化时所做的响应动作，从中传入了观察的对象和一个预留参数
    void update(Observable o, Object arg);

}
	
	import java.util.Vector;

//被观察者类
public class Observable {
    //这是一个改变标识，来标记该被观察者有没有改变
    private boolean changed = false;
    //持有一个观察者列表
    private Vector obs;
    
    public Observable() {
    obs = new Vector();
    }
    //添加观察者，添加时会去重
    public synchronized void addObserver(Observer o) {
        if (o == null)
            throw new NullPointerException();
    if (!obs.contains(o)) {
        obs.addElement(o);
    }
    }
    //删除观察者
    public synchronized void deleteObserver(Observer o) {
        obs.removeElement(o);
    }
    //notifyObservers(Object arg)的重载方法
    public void notifyObservers() {
    notifyObservers(null);
    }
    //通知所有观察者，被观察者改变了，你可以执行你的update方法了。
    public void notifyObservers(Object arg) {
        //一个临时的数组，用于并发访问被观察者时，留住观察者列表的当前状态，这种处理方式其实也算是一种设计模式，即备忘录模式。
        Object[] arrLocal;
    //注意这个同步块，它表示在获取观察者列表时，该对象是被锁定的
    //也就是说，在我获取到观察者列表之前，不允许其他线程改变观察者列表
    synchronized (this) {
        //如果没变化直接返回
        if (!changed)
                return;
            //这里将当前的观察者列表放入临时数组
            arrLocal = obs.toArray();
            //将改变标识重新置回未改变
            clearChanged();
        }
        //注意这个for循环没有在同步块，此时已经释放了被观察者的锁，其他线程可以改变观察者列表
        //但是这并不影响我们当前进行的操作，因为我们已经将观察者列表复制到临时数组
        //在通知时我们只通知数组中的观察者，当前删除和添加观察者，都不会影响我们通知的对象
        for (int i = arrLocal.length-1; i>=0; i--)
            ((Observer)arrLocal[i]).update(this, arg);
    }

    //删除所有观察者
    public synchronized void deleteObservers() {
    obs.removeAllElements();
    }

    //标识被观察者被改变过了
    protected synchronized void setChanged() {
    changed = true;
    }
    //标识被观察者没改变
    protected synchronized void clearChanged() {
    changed = false;
    }
    //返回被观察者是否改变
    public synchronized boolean hasChanged() {
    return changed;
    }
    //返回观察者数量
    public synchronized int countObservers() {
    return obs.size();
    }
}
	
	
	当然，这样做还有问题，就是jdk没有做好观察者的update方法的异常处理问题，比如：
	for (int i = arrLocal.length-1; i>=0; i--)
            ((Observer)arrLocal[i]).update(this, arg);
	如果一个update方法执行抛出异常，就会导致其他观察者无法被通知，所以保险的处理方式就是在for循环里面
	加上try catch块对他进行异常处理，即使一个update方法抛出异常，也不会影响其他观察者被通知，就如：
	for (int i = arrLocal.length-1; i>=0; i--){
            try {
                ((Observer)arrLocal[i]).update(this, arg);
            } catch (Throwable e) {e.printStackTrace();}
        }
        
        
        
        
	 * */

}
