package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scene scene = context.getBean("sceneBean", Scene.class);
        scene.draw();
        context.close();
    }
}
