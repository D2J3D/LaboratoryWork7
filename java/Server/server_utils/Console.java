package Server.server_utils;



import java.util.Scanner;

public class Console extends Thread{
    private static final Scanner sc = new Scanner(System.in);
    @Override
    public void run(){
        while(true){
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")){
                System.out.println("Сервер - всё");

                System.exit(0);
            }
        }
    }
}
