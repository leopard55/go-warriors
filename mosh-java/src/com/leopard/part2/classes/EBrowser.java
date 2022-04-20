package com.leopard.part2.classes;

/**
 * @Title: Coupling 耦合
 * @Description: Reducing coupling  减少耦合。抽象的原则，减少隐藏不必要的细节
 * @Author: lz
 * @CreateDate: 2022/4/18 21:24
 * @Version: 1.0
 */
public class EBrowser {
    // 导航
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);

    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) { // 细节，隐藏，减少耦合点。
        return "127.0.0.1";
    }
}
class Main4 {
    public static void main(String[] args) {
        EBrowser browser = new EBrowser();
        browser.navigate("");
    }
}
