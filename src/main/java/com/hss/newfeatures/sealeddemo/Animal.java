package com.hss.newfeatures.sealeddemo;

/**
 * <p>
 *  sealed 限制继承类
 *  1、子类继承了限制继承类后，需要被final修饰。
 *  2、父类和子类必须在同一个包中
 *  优点：安全、可控
 * </p>
 *
 * @author Hss
 * @date 2026-07-12
 */
public abstract sealed class Animal permits Dog,Cat {

    /**
     * 获取名称
     * @return
     */
    public String getName(){
        return "Animal";
    }
}
