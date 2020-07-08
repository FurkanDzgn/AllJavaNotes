package Day44_ThrowAndThrows.Enums;

public class DatabaseConnection {
	
	public static void main(String[] args) {
		
		dbConnect();
	}

	public static void dbConnect() {
		Database db = Database.ORACLESQL;
	
		switch (db) {
		case ORACLESQL: 
			System.out.println("Connection to Oracle SQL...");
			break;
		case MYSQL:
			System.out.println("Connection to MYSQL...");
			break;
		case MONGODB:
			System.out.println("Connection to MONGODB...");
	
		}
	}
}
