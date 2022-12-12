import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class exam2_mock extends EasyMockSupport {

    exam2 ex;

    @Before
    public void setUp() {
        ex = EasyMock.partialMockBuilder(exam2.class).addMockedMethods("squareCalc", "getDigit").createMock();
    }
    @Test
    public void testExam(){
        EasyMock.expect(ex.squareCalc(121)).andReturn(11);
        EasyMock.expect(ex.getDigit(11)).andReturn(1);
        replayAll();
        assertTrue(ex.exam(121));
        verifyAll();
    }

}