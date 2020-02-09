package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.config.AppConfig;
import pl.sda.customer.CustomerDaoImpl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerDaoImpl customerDao = context.getBean(CustomerDaoImpl.class);
        System.out.println(Arrays.toString(customerDao.findAll().toArray()));
    }
}
