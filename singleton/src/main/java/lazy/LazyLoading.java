package lazy;

/**
 * 懒汉式-单例模式(可通过序列化和反射破坏"单例")
 * 可能会造成线程不安全问题
 */
public class LazyLoading {

    private static LazyLoading LAZY_LOADING;

    // 构造器私有化
    private LazyLoading() {

    }

    public static LazyLoading getLazyLoading(){
        if(LAZY_LOADING == null){
            synchronized (LazyLoading.class){
                if(LAZY_LOADING == null){
                    LAZY_LOADING = new LazyLoading();
                }
            }
        }
        return LAZY_LOADING;
    }

    // 测试
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(LazyLoading.getLazyLoading().hashCode());
            }).start();
        }
    }
}
