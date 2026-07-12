package com.hss.newfeatures;

/**
 * <p>
 *
 * </p>
 *
 * @author Hss
 * @date 2026-07-12
 */
public class InstanceofDemo {

    /**
     * 变量类型匹配
     * @param o
     */
    private void patternMatch_V8(Object o){
        if(o instanceof Integer){
            Integer i = (Integer)o;
            System.out.println("Integer:" + i.intValue());
        }else if(o instanceof String){
            String s = (String)o;
            System.out.println("String:" + s.charAt(0));
        }
    }

    /**
     * 变量类型匹配
     * @param o
     */
    private void patternMatch_V17(Object o){
        if(o instanceof Integer i){
            System.out.println("Integer:" + i.intValue());
        }else if(o instanceof String s){
            System.out.println("String:" + s.charAt(0));
        }
    }

    public static void main(String[] args) {
        InstanceofDemo demo = new InstanceofDemo();
        //Object o = Integer.valueOf(0);
        Object o = new String("K");

        //demo.patternMatch_V8(o);
        demo.patternMatch_V17(o);
    }
}
