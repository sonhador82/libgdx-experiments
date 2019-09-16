import java.awt.*;
import com.badlogic.gdx.math.*;

import java.util.ArrayList;

public class DrawingPlane extends Component {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Vector2[] items = prep_points();
        draw_points(g2d, items);
        draw_bspline(g2d, items);
        draw_bezier(g2d, items);

    }
    private void draw_points(Graphics2D g2d, Vector2[] points){
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(2));
        for (Vector2 point : points) {
            int x = (int) Math.ceil(point.x);
            int y = (int) Math.ceil(point.y);
            g2d.drawLine(x, y, x, y);
        }
    }

    private void draw_bezier(Graphics2D g2d, Vector2[] points) {

        g2d.setStroke(new BasicStroke(2));
        Vector2 out_vect = new Vector2();
        Vector2 tmp_vect = new Vector2();
        Vector2 p0 = new Vector2(50, 50);
        Vector2 p1 = new Vector2(80, 80);
        Vector2 p2 = new Vector2(100, 50);
        Vector2 p3 = new Vector2(120, 80);
        g2d.setColor(Color.BLUE);
        g2d.drawLine((int) p0.x, (int) p0.y, (int) p0.x, (int) p0.y);
        g2d.drawLine((int) p1.x, (int) p1.y, (int) p1.x, (int) p1.y);
        g2d.drawLine((int) p2.x, (int) p2.y, (int) p2.x, (int) p2.y);
        g2d.drawLine((int) p3.x, (int) p3.y, (int) p3.x, (int) p3.y);

        int x,y;
        for (int i=0; i<100; i++){
            float cur_pos = (float) (i*0.01);
            g2d.setColor(Color.GREEN);
            Bezier.cubic(out_vect, cur_pos, p0, p1, p2, p3, tmp_vect);
            x = (int) out_vect.x;
            y = (int) out_vect.y;
            g2d.drawLine(x, y, x, y);

            g2d.setColor(Color.ORANGE);
            Bezier.quadratic(out_vect, cur_pos, p0, p1, p2, tmp_vect);
            x = (int) out_vect.x;
            y = (int) out_vect.y;
            g2d.drawLine(x, y, x, y);
        }
    }

    private void draw_bspline(Graphics2D g2d, Vector2[] points) {
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(2));
        Vector2 out_vect = new Vector2();
        Vector2 tmp_vect = new Vector2();
        for (int i = 0; i < 100; i++) {
            float cur_pos = (float) (i * 0.01);
            BSpline.cubic(out_vect, cur_pos, points, false, tmp_vect);
            int x = (int) out_vect.x;
            int y = (int) out_vect.y;
            g2d.drawLine(x, y, x, y);
            System.out.println(cur_pos);

        }
    }

    public Vector2[] prep_points(){
        ArrayList<Vector2> someVector = new ArrayList<>();
        Vector2 v1 = new Vector2(10, 10);
        Vector2 v2 = new Vector2(50, 50);
        Vector2 v3 = new Vector2(70, 60);
        Vector2 v4 = new Vector2(100, 100);
        Vector2 v5 = new Vector2(150, 50);
        Vector2 v6 = new Vector2(170, 70);
        Vector2 v7 = new Vector2(200, 100);
        someVector.add(v1);
        someVector.add(v2);
        someVector.add(v3);
        someVector.add(v4);
        someVector.add(v5);
        someVector.add(v6);

        someVector.add(v7);
        someVector.add(v7);
        someVector.add(v7);

        Vector2[] items = someVector.toArray(new Vector2[someVector.size()]);
        return items;
    }
}
