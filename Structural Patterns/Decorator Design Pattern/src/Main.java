import decotor.SenderNameDecorator;
import server.MessagingService;
import server.SmsMessagingService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MessagingService smsMessagingService = new SmsMessagingService();

        smsMessagingService.sendMessage("Hello ! you have a new message");
        System.out.println();
        MessagingService senderNameWithMessagingService = new SenderNameDecorator(new SmsMessagingService(), "Maleesha");
        senderNameWithMessagingService.sendMessage("Hello! i ', add sender name");
    }
}