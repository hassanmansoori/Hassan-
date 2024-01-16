package thread;

public class Even extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
        	if (i%2==0) {
        		System.out.println("Even no. :" +i);
        	}
            
        }
    }
}

class Odd extends Thread {
    public void run() {
    	for (int j = 0; j < 20; j++) {
        	if(j%2!=0) {
        		System.out.println("Odd no. :" +j);
        	}
    }
}
}
