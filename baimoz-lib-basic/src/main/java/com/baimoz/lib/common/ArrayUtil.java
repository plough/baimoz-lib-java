package com.baimoz.lib.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 与数组有关的工具类
 * @author zgtian
 */
public class ArrayUtil {

    /**
     * 根据自定义规则，对一个数组进行过滤，返回过滤后的结果。
     * @param arr 源数组
     * @param template 用于指明数组元素的类型
     * @param validator 自定义规则
     * @return 过滤后的数组
     */
    public static <T> T[] filter(T[] arr, T[] template, Validator<T> validator) {
        List<T> res = new ArrayList<>();
        for (T element : arr) {
            if (validator.isValid(element)) {
                res.add(element);
            }
        }
        return res.toArray(template);
    }

    public interface Validator<T> {
        /**
         * 定义规则，判断一个元素是否合法
         * @param element 待验证的元素
         * @return 元素是否合法
         */
        boolean isValid(T element);
    }
}
