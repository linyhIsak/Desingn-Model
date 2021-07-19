package cat;

import strategy.CompareStrategy;

/**
 * 对"猫咪"这个类声明一个体重比较策略
 */
public class CatCompareStrategyOfWeight implements CompareStrategy<Cat> {
    @Override
    public int strategy(Cat a, Cat b) {
        if (a.weight < b.weight) return -1;
        if (a.weight > b.weight) return 1;
        return 0;
    }
}
