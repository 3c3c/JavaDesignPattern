package com.example.structuraldesignpatterns.proxypattern;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
        System.out.println(cmd+"被执行了");
    }
}
