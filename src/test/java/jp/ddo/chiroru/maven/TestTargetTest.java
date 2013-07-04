package jp.ddo.chiroru.maven;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;
import org.junit.Test;


public class TestTargetTest {

    @Test
    public void 正しく足し算が実行される() throws Exception {
        assertThat(TestTarget.wa(1, 1), is(2));
    }
}
