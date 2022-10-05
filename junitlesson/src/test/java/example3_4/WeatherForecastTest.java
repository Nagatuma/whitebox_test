package example3_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeatherForecastTest {
    WeatherForecast forecast = new WeatherForecast();

    /**
    テストケースNo1-1
    降水確率50％を検証する。
    trueが帰ってくればテストOK
    **/
    @Test
    public void checkUmbrella_1_1() {
        boolean result;
        result=false;
        try {
            result = forecast.check(50);
        } catch (RainyException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
        assertTrue(result);
    }
}







