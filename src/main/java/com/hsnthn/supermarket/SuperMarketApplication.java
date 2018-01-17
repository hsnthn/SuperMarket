package com.hsnthn.supermarket;

import com.hsnthn.supermarket.constant.Constants;
import com.hsnthn.supermarket.service.order.OrderServiceImpl;
import com.hsnthn.supermarket.service.order.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@PropertySource("classpath:message.properties")
@SpringBootApplication
public class SuperMarketApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderService orderService;

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(SuperMarketApplication.class, args);
    }

    @Override
    public void run(final String... strings) throws Exception {
        System.out.println(environment.getProperty(Constants.WELCOME));
        while (true) {
            System.out.println(environment.getProperty(Constants.PRESS_9_FOR_SEARCH));
            System.out.println(environment.getProperty(Constants.PRESS_8_FOR_SEARCH));
            System.out.println(environment.getProperty(Constants.PRESS_ANY_KEY_FOR_EXIT_EXCEPT_9_AND_8));
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            final String key = bufferedReader.readLine();
            try {
                if (environment.getProperty(Constants.INPUT_9).equals(key)) {
                    searchCustomerByName();
                } else if (environment.getProperty(Constants.INPUT_8).equals(key)) {
                    //TODO: order
                } else {
                    System.exit(Constants.DEFAULT_0);
                }
            } catch (final Exception e) {
                LOGGER.error(e.getMessage(), e);
            } finally {
                bufferedReader.close();
            }
        }
    }

    private void searchCustomerByName() throws Exception {
        System.out.println(environment.getProperty(Constants.SEARCH_CUSTOMER_BY_NAME));
        try (final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            //TODO: search customer by name
        }
    }
}