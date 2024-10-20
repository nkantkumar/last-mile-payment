package sg.npayment.geek;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MockitoAnnotationsInitWithMockitoJUnitRuleUnitTest {
    @Spy
    List<String> spiedList = new ArrayList<String>();
    @Spy
    List<String> spiedList1 = new ArrayList<String>();



    @Test
    public void whenUseSpyAnnotation_thenSpyIsInjectedCorrectly1() {
        spiedList1.add("one");
        spiedList1.add("two");


        Mockito.verify(spiedList1).add("one");
        Mockito.verify(spiedList1).add("two");

        assertEquals(2, spiedList1.size());

        Mockito.doReturn(100).when(spiedList1).size();


        assertEquals(100, spiedList1.size());
    }
    @Test
    public void whenNotUseMockAnnotation_thenCorrect() {
        List mockList = Mockito.mock(ArrayList.class);

        mockList.add("one");
        Mockito.verify(mockList).add("one");
        assertEquals(0, mockList.size());

        Mockito.when(mockList.size()).thenReturn(100);
        assertEquals(100, mockList.size());
    }

    @Test
    public void whenUseSpyAnnotation_thenSpyIsInjectedCorrectly() {
        spiedList.add("one");
        spiedList.add("two");

        Mockito.verify(spiedList).add("two");
        Mockito.verify(spiedList).add("one");

        assertEquals(2, spiedList.size());

        Mockito.doReturn(100).when(spiedList).size();
        assertEquals(100, spiedList.size());
    }

    @Test
    public void whenNotUseCaptorAnnotation_thenCorrect() {
        List mockList = Mockito.mock(List.class);
        ArgumentCaptor<Integer> arg = ArgumentCaptor.forClass(Integer.class);

        mockList.add(2);
        Mockito.verify(mockList).add(arg.capture());

        assertEquals(2, arg.getValue());
    }

}
