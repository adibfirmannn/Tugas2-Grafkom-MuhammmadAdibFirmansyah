import java.awt.*;
import java.awt.geom.*;

public class Exercise33 extends Frame {

    Exercise33() {
        addWindowListener(new MyFinishWindow());
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        BasicStroke bs = new BasicStroke(3.0f);
        g2d.setStroke(bs);

        GeneralPath carPath = new GeneralPath();

        carPath.moveTo(60, 120);
        carPath.lineTo(80, 120);
        carPath.quadTo(90, 140, 100, 120);
        drawControlPoint(g2d, 90, 140);

        carPath.lineTo(160, 120);
        carPath.quadTo(170, 140, 180, 120);
        drawControlPoint(g2d, 170, 140);

        carPath.lineTo(200, 120);
        carPath.curveTo(195, 100, 200, 80, 160, 80);
        drawControlPoint(g2d, 195, 100);
        drawControlPoint(g2d, 200, 80);

        carPath.lineTo(110, 80);
        carPath.lineTo(90, 100);
        carPath.lineTo(60, 100);
        carPath.lineTo(60, 120);

        float[] dashPattern = { 5, 5 };
        BasicStroke dashedStroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 10.0f,
                dashPattern, 0.0f);
        g2d.setStroke(dashedStroke);

        // Connect quadratic control points
        g2d.drawLine(80, 120, 90, 140);
        g2d.drawLine(160, 120, 170, 140);

        // Connect cubic control points
        g2d.drawLine(200, 120, 195, 100);
        g2d.drawLine(160, 80, 200, 80);

        g2d.draw(carPath);

        drawSimpleCoordinateSystem(200, 150, g2d);

    }

    public static void drawControlPoint(Graphics2D g2d, int x, int y) {
        int size = 6;
        g2d.setColor(Color.BLACK);
        g2d.fillOval(x - size / 2, y - size / 2, size, size);
    }

    public static void drawSimpleCoordinateSystem(int xmax, int ymax,
            Graphics2D g2d) {
        int xOffset = 30;
        int yOffset = 50;
        int step = 20;
        String s;

        Font fo = g2d.getFont();

        g2d.setFont(new Font("sansserif", Font.PLAIN, 9));

        g2d.drawLine(xOffset, yOffset, xmax, yOffset);

        for (int i = xOffset + step; i <= xmax; i = i + step) {
            g2d.drawLine(i, yOffset - 2, i, yOffset + 2);
            g2d.drawString(String.valueOf(i - xOffset), i - 5, yOffset - 7);
        }

        g2d.drawLine(xOffset, yOffset, xOffset, ymax);

        s = "  ";
        for (int i = yOffset + step; i <= ymax; i = i + step) {
            g2d.drawLine(xOffset - 2, i, xOffset + 2, i);
            if (i > 99) {
                s = "";
            }
            g2d.drawString(s + String.valueOf(ymax - i), xOffset - 25, i + 5);
        }

        g2d.setFont(fo);
    }

    public static void main(String[] argv) {
        Exercise33 f = new Exercise33();
        f.setTitle("Exercise 3.3");
        f.setSize(250, 200);
        f.setVisible(true);
    }
}
