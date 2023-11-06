import java.util.Scanner;

public class WebserverTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<WebServer> webServers = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            System.out.println("Web Server Menu:");
            System.out.println("1. Compare Web Pages");
            System.out.println("2. Add Web Page");
            System.out.println("3. Update Web Page");
            System.out.println("4. Exit");

            System.out.print("Select an option 1,2,3,4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter the URL to compare: ");
                    String compareUrl = scanner.nextLine();
                    for (WebServer URL : webServers) {
                        if (URL.webPageEquals(compareUrl)) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter the URL to add: ");
                    String addUrl = scanner.nextLine();
                    System.out.print("Enter the contents: ");
                    String addContents = scanner.nextLine();
                    WebServer newWebPage = new WebServer("", "", "");
                    newWebPage.webPageAdd(addUrl, addContents);
                    webServers.add(newWebPage);
                    break;

                case 3:
                    System.out.print("Enter the URL to update: ");
                    String updateUrl = scanner.nextLine();
                    System.out.print("Enter the new contents: ");
                    String newContents = scanner.nextLine();
                    for (WebServer server : webServers) {
                        if (server.webPageUpdate(updateUrl, newContents)) {
                            break;
                        }
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        scanner.close();
    }
}
