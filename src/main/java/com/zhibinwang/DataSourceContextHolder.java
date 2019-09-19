package com.zhibinwang;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author 花开
 * @create 2019-09-12 0:12
 * @desc
 **/
@Component
@Lazy(false)
public class DataSourceContextHolder {

    // 采用ThreadLocal 保存本地多数据源
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    // 设置数据源类型
    public static void setDbType(String dbType) {
        contextHolder.set(dbType);
    }

    public static String getDbType() {
        return contextHolder.get();
    }

    public static void clearDbType() {
        contextHolder.remove();
    }


}
