package lichtman.spirograph;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class SpirographControllerTest {

    @Test
    void draw() {
        //given
        SpirographView sView = mock();
        SpirographController sController = new SpirographController(sView);
        double largeR = 200;
        double smallR = 75;
        double penDistance = 55;
        double numSteps = 8000;
        double anglePerStep = 0.007;

        //when
        sController.draw(largeR, smallR, penDistance, numSteps, anglePerStep);

        //then
        verify(sView).setSpirographModel(new SpirographModel(
                largeR, smallR, penDistance, numSteps, anglePerStep
        ));
    }
}