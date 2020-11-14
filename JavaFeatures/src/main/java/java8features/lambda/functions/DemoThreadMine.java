package java8features.lambda.functions;

public class DemoThreadMine {
    public static void main(String pars[]) {

    	// Thread - naive way
        Thread threadInstance = new Thread(new Runnable() {
            //run --- implementation
            public void run() {
                System.out.println("Its me from thread");
            }
        });
        
        // Thread - Using Lambda
    	Thread threadInstanceLambda = new Thread(()->System.out.println("It's me from thread(Lambda)"));
    	
        threadInstance.start();
        threadInstanceLambda.start();
    }
}

