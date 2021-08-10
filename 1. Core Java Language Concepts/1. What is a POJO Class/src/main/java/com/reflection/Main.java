package com.reflection;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 11:54 PM
*/

import com.bean.EmployeeBean;
import com.pojo.EmployeePOJO;
import org.apache.commons.beanutils.PropertyUtils;

import java.beans.PropertyDescriptor;

public class Main {
    public static void main(String[] args) {

        // Reflection with a POJO
        System.out.println(" Fields for Employee POJO are :");

        for (PropertyDescriptor propertyDescriptor :
                PropertyUtils.getPropertyDescriptors(EmployeePOJO.class)) {
            System.out.println(propertyDescriptor.getDisplayName());
        }

        System.out.println("--------------------------------------------\n");
        // Reflection with a Bean

        System.out.println(" Fields for Employee Bean are :");

        for (PropertyDescriptor propertyDescriptor :
                PropertyUtils.getPropertyDescriptors(EmployeeBean.class)) {
            System.out.println(propertyDescriptor.getDisplayName());
        }

    }
}
