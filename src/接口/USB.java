package 接口;

public interface USB {
    void open();
    void close();
}
class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标开启");
    }
    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }
}
class KeyBoard implements USB{
    @Override
    public void open() {
        System.out.println("键盘打开");
    }
    @Override
    public void close() {

        System.out.println("键盘关闭");

    }

}
class NoteBook {

    public void run(){

        System.out.println("笔记本运行");

    }

    public void useUSB(USB usb){


        if (usb != null){

            usb.open();

            usb.close();

        }

    }

    public void shutDown(){

        System.out.println("笔记本电脑关闭");

    }

}

