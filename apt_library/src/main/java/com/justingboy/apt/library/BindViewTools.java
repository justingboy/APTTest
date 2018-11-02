package com.justingboy.apt.library;

import android.app.Activity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wanglin on 2018/11/1.
 */
public class BindViewTools {

    public static void bind(Activity activity) {

        Class clazz = activity.getClass();
        try {
            Class bindViewClass = Class.forName(clazz.getName() + "_ViewBinding");
            Method method = bindViewClass.getMethod("bind", activity.getClass());
            method.invoke(bindViewClass.newInstance(), activity);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String canonicalName = BindViewTools.class.getCanonicalName();
        String simpleName = BindViewTools.class.getSimpleName();
        String clsName = BindViewTools.class.getName();
        System.out.println("canonicalName = " + canonicalName);
        System.out.println("simpleName = " + simpleName);
        System.out.println("clsName = " + clsName);
    }


}
