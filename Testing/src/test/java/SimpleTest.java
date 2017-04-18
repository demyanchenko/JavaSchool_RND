import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

/**
 * Created by 8 on 18.04.2017.
 */
@RunWith(Parameterized.class)
public class SimpleTest {


    public static int anyVariable;

    @Parameterized.Parameter(0)
    public int par0;

    @Parameterized.Parameter(1)
    public int par1;

    @Parameterized.Parameter(2)
    public int par2;

    @Parameterized.Parameters
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,2,3},
                {0,1,1},
                {1,3,6} // закладываем ошибку в цифрах, такоой тест не должен проходить (1+3 не равно 4)
        });
    }

    @BeforeClass
    public static void setUp(){
        System.out.println("before");
        anyVariable = 5;
    }

    @Test
    public void test1(){
        System.out.println("test1");
        Assert.assertTrue("message", anyVariable==5);
    }

    @Test
    public void test2(){
        System.out.println("test2");
        Assert.assertTrue("any parameters is not correct", par0+par1==par2);
    }
}
