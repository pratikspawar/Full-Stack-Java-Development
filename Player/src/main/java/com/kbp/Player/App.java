package com.kbp.Player;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
    	Criket ct=context.getBean("criket",Criket.class);
    	ct.getWorout();
    	ct.getDiet();
    	System.out.println(ct.getMatchTime());
    }
}
