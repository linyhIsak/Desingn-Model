package hungery;

/**
 * 饿汉式-单例模式(可通过序列化和反射破坏"单例")
 * 不存在线程安全问题
 */
public class HungeryLoading {

    private final static HungeryLoading HUNGERY_LOADING = new HungeryLoading();

    // 构造器私有化
    private HungeryLoading() {

    }

    public static HungeryLoading getHungeryLoading() {
        return HUNGERY_LOADING;
    }

     // 测试
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(HungeryLoading.getHungeryLoading().hashCode());
            }).start();
        }
    }
}
