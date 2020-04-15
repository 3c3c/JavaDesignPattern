package com.example.structuraldesignpatterns.adapterdesignpattern;

/**
 * 适配器实现之一
 * 创建Socket对象获取插座的电压
 */
public class SocketObjectAdapterImpl implements SocketAdapter {
    //对适配器使用合成的方式
    private Socket sock = new Socket();
    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }
    @Override
    public Volt get12Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,10);
    }
    @Override
    public Volt get3Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,40);
    }
    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
