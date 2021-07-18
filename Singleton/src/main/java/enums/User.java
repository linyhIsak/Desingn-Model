package enums;

/**
 * 通过枚举实现单例模式，可有效防止反射和序列化的"破坏"
 */
public class User {

    // 构造函数私有化
    private User() {
    }

    // 定义一个枚举类
    enum SingletonEnum {
        // 创建一个枚举对象，该对象天生为单例
        INSTANCE;
        private User user;

        // 私有化枚举的构造函数
        private SingletonEnum() {
            user = new User();
        }

        public User getInstnce() {
            return user;
        }
    }

    // 对外暴露一个获取User对象的静态方法
    public static User getInstance() {
        return SingletonEnum.INSTANCE.getInstnce();
    }

    // 测试
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(User.getInstance().hashCode());
            }).start();
        }
    }
}
