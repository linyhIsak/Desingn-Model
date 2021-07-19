package cat;

import strategy.CompareStrategy;

/**
 * 对"猫咪"这个类声明一个年龄比较策略
 */
public class CatCompareStrategyOfAge implements CompareStrategy<Cat> {
    @Override
    public int strategy(Cat a, Cat b) {
        if (a.age < b.age) return -1;
        if (a.age > b.age) return 1;
        return 0;
    }
}
