package test;

import cat.Cat;
import cat.CatCompareStrategyOfAge;
import cat.CatCompareStrategyOfHeight;
import cat.CatCompareStrategyOfWeight;
import compare.Compartor;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(15, 2, 4), new Cat(16,1,3), new Cat(14,3,2)};
        Compartor<Cat> comparator = new Compartor<>();
        // 按年龄排序
        comparator.sort(cats, new CatCompareStrategyOfAge());
        System.out.printf("按年龄排序:");
        System.out.println(Arrays.toString(cats));
        // 按身高排序
        comparator.sort(cats, new CatCompareStrategyOfHeight());
        System.out.printf("按身高排序:");
        System.out.println(Arrays.toString(cats));
        // 按体重排序
        comparator.sort(cats, new CatCompareStrategyOfWeight());
        System.out.printf("按体重排序:");
        System.out.println(Arrays.toString(cats));
    }
}
