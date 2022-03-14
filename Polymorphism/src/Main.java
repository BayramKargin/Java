public class Main {

    public static void main(String[] args) {
        BaseLogger[] loggers=new BaseLogger[]{new DatabaseLogger(),new ConsoleLogger(),new FileLogger(),new EmailLogger()};
        for (BaseLogger logger:loggers){
            logger.log("log mesajı");
        }
        System.out.println("---------------------------------------");
        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
