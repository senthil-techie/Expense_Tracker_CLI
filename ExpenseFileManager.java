package E;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseFileManager {
	
	public static void saveExpense(Expense expense) {
        try {
            FileWriter writer = new FileWriter("expenses.csv", true);

            writer.write(expense.toCSV() + "\n");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static List<Expense> loadExpenses() {

        List<Expense> expenses = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("expenses.csv"));

            String line;

            while ((line = reader.readLine()) != null) {
                expenses.add(Expense.fromCSV(line));
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return expenses;
    }
	
	
	

}
