package lichtman.Spirograph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class SpirographControllerTest {

    @Test
    void draw() {
        //given
        SpirographView sv = mock();
        SpirographController sc = new SpirographController(sv);
        int largeR = 200;
        int smallR = 75;
        int penDistance = 55;
        int numSteps = 8000;
        double anglePerStep = 0.007;

        //when
        sc.draw(largeR, smallR, penDistance, numSteps, anglePerStep);

        //then
        verify(sv).setSpirographModel(new SpirographModel(
                largeR, smallR, penDistance, numSteps, anglePerStep
        ));
    }
}