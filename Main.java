package E;

import java.time.LocalDate;
import java.util.List;

public class Main {
	public static void main (String[] args) {
		Expense_Tracker et = new Expense_Tracker();
//		ExpenseFileManager efm = new ExpenseFileManager();
		et.addExpense(1, LocalDate.of(2025, 5, 8), "chocolate", 80);
		et.addExpense(2, LocalDate.of(2024, 5, 2), "bread", 90);
		et.addExpense(3, LocalDate.of(2025, 4, 9), "broom stick", 110);
		et.addExpense(4, LocalDate.of(2025, 4, 7), "brush", 20);
		et.addExpense(5, LocalDate.of(2025, 3, 1), "notebook", 40);
		
		
		et.displayAmount();
		
		et.deleteExpense(2);
		
		et.displayAmount();
		
		
		
		et.DisplayExpense();
		
		List<Expense> list = ExpenseFileManager.loadExpenses();

		for (Expense e : list) {
		    System.out.println(e);
		}
		
		
		
		
	}

}
