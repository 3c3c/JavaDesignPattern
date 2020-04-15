package com.example.structuraldesignpatterns.proxypattern;

import java.util.Objects;

public class CommandExecutorProxy implements CommandExecutor {

    //是否是系统管理员
    private Boolean isAdmin;
    //命令执行器
    private CommandExecutor commandExecutor;


    public CommandExecutorProxy(String user,String password) {
        if(Objects.equals(user,"admin")){
            isAdmin = true;
        }
        if(Objects.equals(user,"admin") && Objects.equals(password,"123123")){
            commandExecutor = new CommandExecutorImpl();
        }
    }

    @Override
    public void runCommand(String cmd) throws Exception {
            if(isAdmin){
                commandExecutor.runCommand(cmd);
            }else{
                if(cmd.startsWith("rm")){
                    throw new Exception("非系统管理员不能执行删除操作");
                }else{
                    commandExecutor.runCommand(cmd);
                }
            }
    }
}
