package com.example.creatdesignmodel.prototypepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 多例模式
 * 使用深拷贝,或者浅拷贝 拷贝一份数据然后进行
 */
public class Employees implements Cloneable {

    private List<String> empList = null;

    //添加无参构造 和有参构造
    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public void loadData(){
        empList.add("zhangsan");
        empList.add("lisi");
        empList.add("wangwu");
        empList.add("zhaoliu");
    }

    public List<String> getEmpList() {
        return empList;
    }


    @Override //此方法从Object处继承而来
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);
    }


    @Override
    public String toString() {
        return "Employees{" +
                "empList=" + empList +
                '}';
    }
}
