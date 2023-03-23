package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {
    @Test
    public void testgetInstance(){
        EmailService es = EmailService.getInstance();
        assertTrue(es instanceof EmailService);
    }

    @Test(expected = RuntimeException.class)
    public void testsendEmail(){
        Order or=new Order(10,"book",250);
        EmailService.getInstance().sendEmail(or);
    }

    @Test
    public void testsendEmailBoolean(){
        Order or=new Order(10,"book",250);
        assertTrue(EmailService.getInstance().sendEmail(or, "Ruthless People"));
    }



}