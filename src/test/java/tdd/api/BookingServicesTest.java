package tdd.api;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import tdd.api.service.BookingService;

@RunWith(SpringRunner.class)
public class BookingServicesTest {


    @TestConfiguration
    static class BookingServiceTesteConfiguration {
    
        @Bean
        public BookingService bookingService(){
            return new BookingService();
        }

        
    }

    @Autowired
    BookingService BookingService;


    @Test
    public void BookingServiceDaysCalculator(){
        String name= "Jose";
        int  days = BookingService.daysCalculatorWrithDatabase(name);

        Assertions.assertThat(days);
    }
    
}
