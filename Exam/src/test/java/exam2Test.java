import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class exam2Test extends TestCase {
    int n;
    boolean expected;
    exam2 exam;

    @Before
    public void setUp() throws Exception {
        exam= new exam2();
    }
    @Parameterized.Parameters
    public static Collection<Object[]> numbers() {
        return List.of(new Object[][]{
                {0, true},
                {1, true},
                {2, false},
                {3, false},
                {4, false},
                {5, false},
                {6, false},
                {7, false},
                {8, false},
                {9, true},
                {10, false},
                {34, false},
                {567, false},
                {5890, false},
                {123456, false},
                {121,false}

        });
    }

        public exam2Test(int n, boolean expected) {
            this.n = n;
            this.expected = expected;
        }
        @Test
        public void TestExam() {
            assertEquals(expected, exam.exam(n));
        }
        @After
        public void tearDown() throws Exception {
            exam=null;
        }

}






