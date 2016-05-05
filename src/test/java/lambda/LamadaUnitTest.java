package lambda;

import org.junit.Test;

/**
 * Created by huoquanfu on 2016/4/27.
 */
public class LamadaUnitTest {

    @Test
    public void Test() {
        LamadaInList.TestAggrateFunction();
        LamadaInList.TestForeach();

        //整数数组,转为字符串
        LamadaInList.TestIntListToString();

        LamadaInString.Test();

        LamadaInFunction.Test();
    }

}
