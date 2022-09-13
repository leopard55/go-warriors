package graphics;

import lombok.Data;

/**
 * @Descriptoin: TODO
 * @Author: leopard
 * @CreateDate: 2022-03-04 11:37
 */
@Data
public class Line extends Shape {
    private Point start;
    private Point end;
    public Line(Point start, Point end, String color) {
        super(color);
        this.start = start;
        this.end = end;
    }

    @Override
    public void draw() {
        System.out.println("draw line from "
                + start.toString()+" to "+end.toString()
                + ",using color "+super.getColor());
    }
}
