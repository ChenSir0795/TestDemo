package �ӿ�;

public interface USB {
    void open();
    void close();
}
class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("��꿪��");
    }
    @Override
    public void close() {
        System.out.println("���ر�");
    }
}
class KeyBoard implements USB{
    @Override
    public void open() {
        System.out.println("���̴�");
    }
    @Override
    public void close() {

        System.out.println("���̹ر�");

    }

}
class NoteBook {

    public void run(){

        System.out.println("�ʼǱ�����");

    }

    public void useUSB(USB usb){


        if (usb != null){

            usb.open();

            usb.close();

        }

    }

    public void shutDown(){

        System.out.println("�ʼǱ����Թر�");

    }

}

