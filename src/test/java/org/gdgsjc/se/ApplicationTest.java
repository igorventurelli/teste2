package org.gdgsjc.se;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Test
    public void applicationContextLoaded() {

    }

    @Test
    public void applicationContextTest() {
        Application.main(new String[] {});
    }
}
