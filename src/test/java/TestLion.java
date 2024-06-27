import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.Collections;
import java.util.List;

@RunWith(Parameterized.class)
public class TestLion {

    private  String typeAnimal;
    private List<String> foodAnimal;

    public TestLion(String typeAnimal, List<String> foodAnimal) {
        this.typeAnimal = typeAnimal;
        this.foodAnimal = foodAnimal;

    }

    @Parameterized.Parameters (name = "{index}:вид животного ({0}) его пища ({1})")
    public static Object[][] testGetFoodExample() {
        //Проверяем текст вопроса и верный ответ на него
        return new Object[][]{
                {"Травоядное",
                        List.of("Трава", "Различные растения")},
                {"Хищник",
                        List.of("Животные", "Птицы", "Рыба")},
                {"Неизвестный",
                        "Неизвестный вид животного, используйте значение Травоядное или Хищник"},

        };
    }

    @Spy
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetKittenslion() throws Exception {
        feline.getKittens();
        Mockito.verify(feline).getKittens(1);
    }

    @Test
    public void testGetKittensCountLion(){
        feline.getKittens(333);
        Assert.assertEquals(333, feline.getKittens(333));

    }

    @Test
    public void testDoesHaveMane(){

    }

    @Test
    public void testGetFoodLion() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(Collections.singletonList("Хищник"));
        Assert.assertEquals(Collections.singletonList("Хищник"), cat.getFood());
    }

}
