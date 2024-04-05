import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WalletDetail {

    public static void main(String[] args) {
       
        writeWalletDetailToFile("walletdetail.csv", "John Doe", 30, "1234567890", "john@example.com", "password123");
        writeExpenseDetailToFile("expensedetail.csv", 100, 20, 30, 40, 50, 60, 70, 80, 90);
    }

    private static void writeWalletDetailToFile(String filename, String name, int age, String phoneNum,
                                    String email, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(name + "," + age + "," + phoneNum + "," + email + "," + password + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeExpenseDetailToFile(String filename, int sport, int entertainment, int shopping,
                                                 int housing, int study, int food, int clothing, int transportation) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(sport + "," + entertainment + "," + shopping + "," + housing + "," +
                    study + "," + food + "," + clothing + "," + transportation + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
