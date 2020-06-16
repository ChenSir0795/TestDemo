package ½Ó¿Ú;

public class B {
	    public static void main(String[] args) {

	        NoteBook nb = new NoteBook();

	        nb.run();

	        Mouse m = new Mouse();

	        nb.useUSB(m);

	        KeyBoard kb = new KeyBoard();

	        nb.useUSB(kb);

	        nb.shutDown();
	    }
	}

