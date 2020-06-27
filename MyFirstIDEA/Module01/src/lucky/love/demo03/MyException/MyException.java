package lucky.love.demo03.MyException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) throws RegisterException {
        //1. 数据库储存已经注册的用户名
        ArrayList<String> users = new ArrayList<>();
        users.add("aaa");
        users.add("bbb");
        users.add("ccc");

        //2. 获取新的用户名
        Scanner scanner = new Scanner(System.in);
        String newUser = scanner.next();

        //3. 判断是否存在
        if (users.contains(newUser)) {
            throw new RegisterException("用户名已存在");
        } else {
            System.out.println("注册成功！！");
        }
    }

}
