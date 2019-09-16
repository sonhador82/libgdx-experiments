import com.badlogic.gdx.math.*;

import java.util.ArrayList;

public class TestBezier {
    public static void main(String[] args) {

        ArrayList<Vector2> someVector = new ArrayList<>();

        Vector2 v1 = new Vector2(0, 0);
        Vector2 v2 = new Vector2(10, 3);
        Vector2 v3 = new Vector2(30, 20);
        Vector2 v4 = new Vector2(50, 10);
        someVector.add(v1);
        someVector.add(v2);
        someVector.add(v3);
        someVector.add(v4);
        Vector2[] items = someVector.toArray(new Vector2[someVector.size()]);

        Vector2 out_vect = new Vector2();
        Vector2 tmp_vect = new Vector2();


        for (int i = 0; i<10; i++){
            float cur_pos = (float) (i*0.1);
            BSpline.cubic(out_vect, cur_pos, items, false, tmp_vect);
            System.out.println("cubic");
            System.out.println(out_vect);
            BSpline.cubic_derivative(out_vect, cur_pos, items,false, tmp_vect);
            System.out.println("cubic-derivative");
            System.out.println(out_vect);
        }

        System.out.println("End");



    }
}