package jp.ddo.chiroru.maven.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ItemStockIntegrationTest {

    @Test
    public void test()
            throws Exception {
        ItemStock stock = new ItemStock();
        stock.add("A", 1);
        assertThat(stock.size("A"), is(1));
    }
}
