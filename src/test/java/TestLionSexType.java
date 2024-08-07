import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class TestLionSexType {

    private String sexLion;
    private boolean hasMane;

    public TestLionSexType(String sexLion, boolean hasMane) {
        this.sexLion = sexLion;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters (name = "{index}:пол животного ({0}) ")
    public static Object[][] TestGetFoodLion() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"КотикКиборг", false},
        };
    }

    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetFoodLion() throws Exception {
        try {
            Lion lion = new Lion(sexLion, feline);
            Assert.assertEquals(hasMane, lion.doesHaveMane());
        } catch (Exception e) {
            //ловим исключение
        }
    }

}