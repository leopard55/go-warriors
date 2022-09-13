package javacore.array1;

/**
 * @Title: TestModel
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2021/6/13 11:23
 * @Version: 1.0
 */
public class TestModel {
    public static void main(String[] args) {
        // 泛型类
        Model<String> model = new Model<String>();
        model.test("123");

        Model<Integer> model2 = new Model<>();
        model2.test(123);
    }
}
