package com.wolken.gallery;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.gallery.DI.Photos;

import org.springframework.beans.factory.BeanFactory;


public class Gallary {
	public static void main( String[] args )
    {
      Resource resource=new ClassPathResource("gallary.xml");
     BeanFactory beanFactory=new XmlBeanFactory(resource); 
     Photos Ph=(Photos) beanFactory.getBean("PhotosName");
     Ph.PrintName();
     Photos Photos=(Photos) beanFactory.getBean("PhotosDetails");
     Photos.PrintName();
     
    }
}