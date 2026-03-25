import javax.swing.*;

public class SpirographController {
    private final SpirographView sv;

    public SpirographController(SpirographView sv) {
        this.sv = sv;
    }

    public void draw(int largeR, int smallR, int pd, int ns, double aps) {
        //SpirographModel newSM = new SpirographModel(largeR, smallR, pd, ns, aps);
        sv.setSpirographModel(new SpirographModel(
                largeR, smallR, pd, ns, aps));
    }
}
