import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class exam2_mock extends EasyMockSupport {

    exam2 examMock;

    @Before
    public void setUp() {
        examMock = EasyMock.partialMockBuilder(exam2.class).addMockedMethods("squareCalc", "getDigit").createMock();
    }
    @Test
    public void testExam(){
        EasyMock.expect(examMock.squareCalc(121)).andReturn(11);
        EasyMock.expect(examMock.getDigit(11)).andReturn(1);
        replayAll();
        assertTrue(examMock.exam(121));
        verifyAll();
    }

}