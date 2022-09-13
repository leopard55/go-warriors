package graphics;

import lombok.Data;

/**
 * @Descriptoin: TODO
 * @Author: leopard
 * @CreateDate: 2022-03-04 10:20
 */
@Data
public class Shape {
    private static final String DEFAULT_COLOR = "black";
    private String color;
    public Shape() {
        this(DEFAULT_COLOR);
    }
    public Shape(String color) {
        this.color = color;
    }
    public void draw() {
        System.out.println("draw shape");
    }


}
