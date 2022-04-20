package com.leopard.part2.classes;

/**
 * @Title: com.leopard.base.ATextBox
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2022/4/16 13:44
 * @Version: 1.0
 */
public class ATextBox {
    private String text = ""; // no NullPointerException

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void clear() {
        text = null;
    }
}

class Main1 {
    public static void main(String[] args) {
        ATextBox textBox = new ATextBox();
        System.out.println(textBox.getText().toUpperCase());

        ATextBox textBox1 = new ATextBox();
        ATextBox textBox2 = textBox1;
        textBox2.setText("hello world");
        System.out.println(textBox1.getText());
    }
}
