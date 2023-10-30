package suite1.exercises.chapter6.slider;

import suite1.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testSlideToWholeNumber(){
        String value = "4";
        var sliderPage = homePage.clickHorizonalSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");
    }
}
