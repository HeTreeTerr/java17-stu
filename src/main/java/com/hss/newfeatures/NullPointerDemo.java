package com.hss.newfeatures;

/**
 * <p>
 *  jdk14 优化了空指针异常信息
 * </p>
 *
 * @author Hss
 * @date 2026-07-12
 */
public class NullPointerDemo {

    private record Company(String name){}

    private record Department(Company company){}

    private record Employee(Department department){}

    public static void main(String[] args) {
        Department department = new Department(null);
        Employee employee = new Employee(department);

        System.out.println(employee.department().company().name());
        /*
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.hss.newfeatures.NullPointerDemo$Company.name()"
            because the return value of "com.hss.newfeatures.NullPointerDemo$Department.company()" is null
	        at com.hss.newfeatures.NullPointerDemo.main(NullPointerDemo.java:23)
         */
    }
}
