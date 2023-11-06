import java.util.Scanner;

public class EmailTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 'From' email address: ");
        String from = scanner.nextLine();

        System.out.print("Enter the 'To' email address: ");
        String to = scanner.nextLine();

        System.out.print("Enter the 'Cc' email address: ");
        String cc = scanner.nextLine();

        System.out.print("Enter the 'Bcc' email address: ");
        String bcc = scanner.nextLine();

        System.out.print("Enter the subject: ");
        String subject = scanner.nextLine();

        System.out.print("Enter the email body: ");
        String body = scanner.nextLine();

        Email email = new Email(from, to, cc, bcc, subject, body);

        boolean validFrom = email.isValidEmail(email.getFrom());
        boolean validTo = email.isValidEmail(email.getTo());
        boolean validCc = email.isValidEmail(email.getCc());
        boolean validBcc = email.isValidEmail(email.getBcc());

        if (validFrom && validTo && validCc && validBcc) {
            System.out.println("\nValid Email Addresses");
            email.displayEmail();
        } else {
            System.out.println("\nInvalid Email Addresses, No @");
        }

        scanner.close();
    }
}
