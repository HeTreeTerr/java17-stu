package com.hss.newfeatures;

/**
 * <p>
 *  record 用于简洁地定义不可变的数据载体类
 * </p>
 *
 * @author Hss
 * @date 2026-07-12
 */
public class RecordDemo {

    public record UserRecord_V15(Long userId,String userName) {}

    /**
     * 主类
     * @param args
     */
    public static void main(String[] args) {
        UserRecord_V15 record1 = new UserRecord_V15(1L, "hss");
        UserRecord_V15 record2 = new UserRecord_V15(1L, "hss");

        System.out.println(record1);
        System.out.println(record2);

        System.out.println(record1.equals(record2));
    }
}
