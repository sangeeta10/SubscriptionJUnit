/**
 * Created by sangeshi on 1/30/2015.
 */
import org.junit.* ;
import static org.junit.Assert.* ;

public class SubscriptionTest {
    @Test
    public void test_returnEuro() {
        System.out.println("Test if pricePerMonth returns Euro...") ;
        Subscription S = new Subscription(200,2) ;
        assertEquals(1.0,S.pricePerMonth(),0.0); ;
    }

    @Test
    public void test_roundUp() {
        System.out.println("Test if pricePerMonth rounds up correctly...") ;
        Subscription S = new Subscription(200,2) ;
        assertEquals(100,S.pricePerMonth(),0.0); ;
    }
}
