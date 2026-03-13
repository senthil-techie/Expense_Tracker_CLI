package E;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Expense_Tracker {
	
	List<Expense> ExpenseList = new ArrayList<>();
	int totalAmount = 0;
	
	void addExpense(int id, LocalDate date, String desc, int amount) {
		Expense e = new Expense(id, date, desc, amount);
		ExpenseList.add(e);
		ExpenseFileManager.saveExpense(e);
		totalAmount += e.getAmount();
	}
	
	void DisplayExpense() {
		System.out.println("expense-tracker list: ");
		for(Expense e : ExpenseList) {
			System.out.println(e);
		}
	}
	void displayAmount() {
		System.out.println("expense-tracker summary (Total Amount): $" + totalAmount);
	}
	
	void deleteExpense(int id) {
		for(Expense e : ExpenseList) {
			if(id == e.getId()) {
				totalAmount -= e.getAmount();
				ExpenseList.remove(e);
				System.out.println("expense-tracker deleted");
				return;
			}
		}
		System.out.print("Can`t find ID");
	}
	
	
	void getSpecificMonth(int month) {
		
		int total = 0;
		
		switch(month) {
		case 1:	
			for(Expense e :ExpenseList) {
				if(e.getDate().getMonthValue() == month) {
					total += e.getAmount();
				}
			}
			System.out.println("Total expenses for January: $" + total);
			break;
		case 2:
			for(Expense e :ExpenseList) {
				if(e.getDate().getMonthValue() == month) {
					total += e.getAmount();
				}
			}
			System.out.println("Total expenses for Feburary: $" + total);
			break;
		case 3:
			for(Expense e :ExpenseList) {
				if(e.getDate().getMonthValue() == month) {
					total += e.getAmount();
				}
			}
			System.out.println("Total expenses for March: $" + total);
			break;
		case 4:
			for(Expense e :ExpenseList) {
				if(e.getDate().getMonthValue() == month) {
					total += e.getAmount();
				}
			}
			System.out.println("Total expenses for April: $" + total);
			break;
		case 5:
			for(Expense e :ExpenseList) {
				if(e.getDate().getMonthValue() == month) {
					total += e.getAmount();
				}
			}
			System.out.println("Total expenses for May: $" + total);
			break;
		case 6:
			for(Expense e :ExpenseList) {
				if(e.getDate().getMonthValue() == month) {
					total += e.getAmount();
				}
			}
			System.out.println("Total expenses for June: $" + total);
			break;
		case 7:
			for(Expense e :ExpenseList) {
				if(e.getDate().getMonthValue() == month) {
					total += e.getAmount();
				}
			}
			System.out.println("Total expenses for July: $" + total);
			break;
		case 8:
			for(Expense e :ExpenseList) {
				if(e.getDate().getMonthValue() == month) {
					total += e.getAmount();
				}
			}
			System.out.println("Total expenses for August: $" + total);
			break;
		case 9:
			for(Expense e :ExpenseList) {
				if(e.getDate().getMonthValue() == month) {
					total += e.getAmount();
				}
			}
			System.out.println("Total expenses for September: $" + total);
			break;
		case 10:
			for(Expense e :ExpenseList) {
				if(e.getDate().getMonthValue() == month) {
					total += e.getAmount();
				}
			}
			System.out.println("Total expenses for October: $" + total);
			break;
		case 11:
			for(Expense e :ExpenseList) {
				if(e.getDate().getMonthValue() == month) {
					total += e.getAmount();
				}
			}
			System.out.println("Total expenses for  November: $" + total);
			break;
		case 12:
			for(Expense e :ExpenseList) {
				if(e.getDate().getMonthValue() == month) {
					total += e.getAmount();
				}
			}
			System.out.println("Total expenses for December: $" + total);
			break;
		default:
			System.out.println("Invalid Number");
			
		}
		
	}
	
	

}
