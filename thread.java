package thread;

public class thread {

	public static void main(String[] args) {
		Even evenThread = new Even();
        Odd oddThread = new Odd();

        evenThread.start();
        oddThread.start();

	}

}
