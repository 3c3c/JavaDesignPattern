package com.example.structuraldesignpatterns.proxypattern;

/**
 * 代理模式被使用来增强方法
 * 比如执行命令的接口,简单的实现给我们自己用还可以,但是给客户端进行使用,客户端的使用人员有可能执行删除系统文件的命令
 *
 * 所以我们使用代理模式,对执行方法增强,对执行方法进行校验,记录日志,增强使用等等
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("admin", "123123");
        try {
            executor.runCommand("tree");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
    }
}
