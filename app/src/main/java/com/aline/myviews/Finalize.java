package com.aline.myviews;

/**
 * 对象回收时假设A对象已经不可达，不会立即回收，如果有定义finalize方法会执行finalize方法，
 * 判断该方法中是否重新关联可达对象，如果没有重新关联或者没有定义finalize则进入回收阶段
 */
public class Finalize {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();

    }
}
