package com.example.creatdesignmodel.builderpattern;

public class Computer {

    //必须的参数
    private String HDD;
    private String RAM;
    //可选的参数
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    public String getHDD() {
        return HDD;
    }
    public String getRAM() {
        return RAM;
    }
    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }
    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    //私有化构造 防止外部直接new
    private Computer() {
    }

    //提供构造方法供内部类调用创建实例
    private Computer( ComputerBuilder builder ) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    //创建ComputerBuilder静态内部类来提供Computer的实例化
    static class ComputerBuilder{
        //必填参数
        private String HDD;
        private String RAM;
        //可选的参数
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        //为必填参数提供构造
        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
            System.out.println(this.hashCode());
        }
        //为可选参数提供set方法
        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            this.isGraphicsCardEnabled = graphicsCardEnabled;
            System.out.println(this.hashCode());
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.isBluetoothEnabled = bluetoothEnabled;
            System.out.println(this.hashCode());
            return this;
        }

        //提供生成Computer的全局方法
        public Computer build(){
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
