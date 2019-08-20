package com.snail.commons.observer;

import com.snail.commons.methodpost.ThreadMode;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * date: 2019/8/9 12:46
 * author: zengfansheng
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Observe {
    ThreadMode value() default ThreadMode.UNSPECIFIED;
}
