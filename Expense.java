package E;

import java.time.LocalDate;


public class Expense {
	private int Id;
	private LocalDate Date;
	private String Desc;
	private int Amount;
	
	public int getId() {
		return Id;
	}

	public LocalDate getDate() {
		return Date;
	}

	public String getDesc() {
		return Desc;
	}
	
	public String toCSV() {
        return "Expense [Id: " + Id + ", Date: " + Date + ", Item: " + Desc + ", Amount:" + " $"  + Amount + "]";
    }
	
	public static Expense fromCSV(String line) {
        String[] data = line.split(",");
        return new Expense(Integer.parseInt(data[0]), LocalDate.parse(data[1]), data[2],  Integer.parseInt(data[4]));
    }


	public int getAmount() {
		return Amount;
	}

	public Expense(int id, LocalDate date, String desc, int amount) {
		this.Id = id;
		Date = date;
		Desc = desc;
		Amount = amount;
	}
	@Override
	public String toString() {
		return "Expense [Id: " + Id + ", Date: " + Date + ", Item: " + Desc + ", Amount:" + " $"  + Amount + "]";
	}
}
