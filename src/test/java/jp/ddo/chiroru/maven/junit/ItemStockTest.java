package jp.ddo.chiroru.maven.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * <p>
 * {@link Enclosed} テストランナーによるテストプログラムの構造化のサンプルです。
 * </p>
 * @author chiroru
 *
 */
@RunWith(Enclosed.class)
public class ItemStockTest {

    public static class 空の場合 {
        ItemStock stock;

        @Before
        public void setUp() throws Exception {
            stock = new ItemStock();
        }

        @Test
        public void size_Aが0を返す() throws Exception {
            assertThat(stock.size("A"), is(0));
        }

        @Test
        public void contains_Aはfalseを返す() throws Exception {
            assertThat(stock.contains("A"), is(false));
        }
    }

    public static class 商品Aを1件ふくむ場合 {
        ItemStock stock;

        @Before
        public void setUp() throws Exception {
            stock = new ItemStock();
            stock.add("A", 1);
        }

        @Test
        public void size_Aが1を返す() throws Exception {
            assertThat(stock.size("A"), is(1));
        }

        @Test
        @Category(Verify.class)
        public void contains_Aはtrueを返す() throws Exception {
            assertThat(stock.contains("A"), is(true));
        }
    }
}
