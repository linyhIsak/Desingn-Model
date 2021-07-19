package cat;

import strategy.CompareStrategy;

/**
 * 对"猫咪"这个类声明一个身高比较策略
 */
public class CatCompareStrategyOfHeight implements CompareStrategy<Cat> {
    @Override
    public int strategy(Cat a, Cat b) {
        if (a.height < b.height) return -1;
        if (a.height > b.height) return 1;
        return 0;
    }
}
