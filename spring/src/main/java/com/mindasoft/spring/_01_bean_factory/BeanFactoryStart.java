package com.mindasoft.spring._01_bean_factory;

import com.mindasoft.spring.LearningBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * BeanFactory {@link org.springframework.beans.factory.BeanFactory}
 *   是spring中最基本、最重要的一个接口，它定义个IOC内容的最基本功能.
 *   IoC容器的初始化包括BeanDefinition的Resource定位、载入和注册这三个基本的过程
 *
 * @author: huangmin
 * @email: huangmin@mgtv.com
 * @date: 2018/6/21 17:03
 * @version: 1.0.0
 */
public class BeanFactoryStart {

    public static void main(String[] args) {
        // 1、指定 bean 定义的xml
        Resource resouce = new ClassPathResource("beans.xml");

        // 2、加载和注册
        BeanFactory factory = new XmlBeanFactory(resouce);
        // 3、获取Bean时，实例化，注入、依赖
        LearningBean bean = (LearningBean) factory.getBean("mybean");
        System.out.println(bean.getName());

    }
}
