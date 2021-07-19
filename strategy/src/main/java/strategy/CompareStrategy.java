package strategy;

/**
 * 声明一个比较策略
 */
public interface CompareStrategy<T> {

    int strategy(T a, T b);

}
