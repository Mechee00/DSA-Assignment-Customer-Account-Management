package client;

import adt.*;
import entity.*;
import utility.*;

public class TestDriver {
	static Input in = new Input();
	static Output out = new Output();
	static ArrayList<Customer> custAcc = new ArrayList<>();

	public static void main(String[] args) {
		init(custAcc); // Initialize the program with some preset data and fill the list with 20
		do {
			displayMenu(Menu.MAIN); // Run Main Menu
			switch (in.getUserInput()) {
			case "1": // Create
				displayMenu(Menu.SUB_CREATEUSER); // Run Sub Menu - Create User Account
				break;
			case "2": // Read
				displayMenu(Menu.SUB_READUSER); // Run Sub Menu - Read User Account
				break;
			case "3": // Update
				displayMenu(Menu.SUB_UPDATEUSER); // Run Sub Menu - Update User Account
				break;
			case "4": // Delete
				displayMenu(Menu.SUB_DELETEUSER); // Run Sub Menu - Delete User Account
				break;
			}
		} while (true);
	}

	public static void init(ArrayList<Customer> array) {

		array.add(new Customer("bgraal0", "PXC7lP", "bgraal0@bizjournals.com", "Belicia Graal", 'M', 37, "+62 612 459 4084", new Address("0", "Onsgard Trail", "Sacramento", "California", 95833)));
		array.add(new Customer("sheintzsch1", "HUTWyYW", "sheintzsch1@biglobe.ne.jp", "Schuyler Heintzsch", 'M', 21, "+358 808 412 8474", new Address("1094", "Pankratz Avenue", "Aurora", "Illinois", 60505)));
		array.add(new Customer("sjozsika2", "KNmpfeHNV", "sjozsika2@ycombinator.com", "Stu Jozsika", 'M', 26, "+62 308 935 8378", new Address("06", "Morningstar Hill", "Roanoke", "Virginia", 24034)));
		array.add(new Customer("acolls3", "2SpsVLKAF9e", "acolls3@discuz.net", "Alexis Colls", 'F', 15, "+86 407 180 0762", new Address("37", "Dorton Parkway", "Seattle", "Washington", 98140)));
		array.add(new Customer("blarcombe4", "cYKbapvc", "blarcombe4@clickbank.net", "Bartel Larcombe", 'M', 49, "+86 451 208 8950", new Address("949", "Scofield Road", "Evansville", "Indiana", 47712)));
		array.add(new Customer("mlongdon5", "tUJIDd0U", "mlongdon5@livejournal.com", "Maitilde Longdon", 'F', 18, "+86 943 230 2650", new Address("01", "Eagan Center", "Harrisburg", "Pennsylvania", 17121)));
		array.add(new Customer("rskule6", "28aGcPV", "rskule6@foxnews.com", "Rab Skule", 'M', 20, "+420 162 891 4954", new Address("452", "Kings Avenue", "Oklahoma City", "Oklahoma", 73142)));
		array.add(new Customer("dpods7", "b5VBMSWc", "dpods7@a8.net", "Devonne Pods", 'M', 37, "+51 903 956 6538", new Address("53162", "Golf View Avenue", "Fort Wayne", "Indiana", 46814)));
		array.add(new Customer("jwattisham8", "lhnPbg0TGS", "jwattisham8@admin.ch", "Jacqueline Wattisham", 'M', 27, "+81 743 599 7171", new Address("7187", "Quincy Parkway", "Anaheim", "California", 92812)));
		array.add(new Customer("ngoodwins9", "AEJdpkK", "ngoodwins9@salon.com", "Nicola Goodwins", 'F', 50, "+386 170 188 9532", new Address("83391", "Di Loreto Drive", "Lancaster", "Pennsylvania", 17622)));
		array.add(new Customer("mgirka", "oH30hZGt", "mgirka@mac.com", "Merissa Girk", 'M', 42, "+48 464 882 9981", new Address("4", "Duke Parkway", "Richmond", "Virginia", 23289)));
		array.add(new Customer("rheinemannb", "Ys8W3iaC", "rheinemannb@artisteer.com", "Raffarty Heinemann", 'M', 15, "+62 340 877 1947", new Address("021", "Lotheville Street", "Sacramento", "California", 95818)));
		array.add(new Customer("bbuttonc", "8fP77dCAQhR", "bbuttonc@printfriendly.com", "Berton Button", 'F', 27, "+86 502 544 1249", new Address("97", "Mandrake Park", "Springfield", "Missouri", 65810)));
		array.add(new Customer("oingled", "ZpyAM8Np53Zz", "oingled@nymag.com", "Ola Ingle", 'F', 20, "+47 283 224 8001", new Address("97", "Mandrake Park", "Springfield", "Missouri", 65810)));
		array.add(new Customer("lgethene", "jBI2K0Ah8vL", "lgethene@ox.ac.uk", "Lusa Gethen", 'F', 33, "+62 244 866 5556", new Address("58994", "Holy Cross Junction", "Syracuse", "New York", 13224)));
		array.add(new Customer("gbeetonf", "9kxGIU", "gbeetonf@printfriendly.com", "Gustavo Beeton", 'F', 23, "+93 282 901 3987", new Address("9", "Tomscot Pass", "Cincinnati", "Ohio", 45238)));
		array.add(new Customer("gtanslyg", "IIN0waL0bP", "gtanslyg@blogtalkradio.com", "Granger Tansly", 'M', 37, "+48 468 489 4543", new Address("03664", "Di Loreto Junction", "Detroit", "Michigan", 48217)));
		array.add(new Customer("yclemensonh", "nzOc4ArJtWNw", "yclemensonh@yandex.ru", "Yorgo Clemenson", 'F', 27, "+7 333 332 8402", new Address("007", "Oxford Trail", "Atlanta", "Georgia", 31196)));
		array.add(new Customer("bormondei", "kGS1wZuV1", "bormondei@dyndns.org", "Brenda Ormonde", 'F', 26, "+351 993 243 4282", new Address("1", "Lillian Court", "York", "Pennsylvania", 17405)));
		array.add(new Customer("cingilsonj", "b4vR2tmAihe", "cingilsonj@nytimes.com", "Christen Ingilson", 'F', 23, "+48 591 524 9534", new Address("35170", "Monica Place", "Charlotte", "North Carolina", 28284)));
	}

	public static void displayMenu(Menu level) {
		switch (level) {
		case MAIN:
			do {
				out.echoln("==========================Customer Account Management==========================");
				out.echoln("1. Create User Account");
				out.echoln("2. Read User Account");
				out.echoln("3. Update User Account");
				out.echoln("4. Delete User Account");
				out.echoln("==========================Customer Account Management==========================");
				out.echo("Enter the menu ID: ");
				in.readIn();
			} while (!in.isMatchRegEx("[1234]{1}"));
			break;
		case SUB_CREATEUSER:
			out.echoln("==========================Customer Account Management==========================");
			out.echo("1. Enter User Name       : ");
			String userName = in.readIn();
			out.echo("2. Enter password        : ");
			String password = in.readIn();
			out.echo("3. Enter Email           : ");
			String email = in.readIn();
			out.echo("4. Enter Full Name       : ");
			String name = in.readIn();
			out.echo("5. Enter Gender (F/M)    : ");
			char gender = in.readIn().charAt(0);
			out.echo("6. Enter Age             : ");
			int age = Integer.parseInt(in.readIn());
			out.echo("7. Enter Phone Number    : ");
			String phoneNumber = in.readIn();
			out.echo("8. Enter Address Line 1  : ");
			String addrLine1 = in.readIn();
			out.echo("8. Enter Address Line 2  : ");
			String addrLine2 = in.readIn();
			out.echo("8. Enter City  : ");
			String city = in.readIn();
			out.echo("8. Enter State  : ");
			String state = in.readIn();
			out.echo("8. Enter Zipcode  : ");
			int zipCode = Integer.parseInt(in.readIn());
			out.echoln("==========================Customer Account Management==========================");
			Customer newCust = new Customer(userName, password, email, name, gender, age, phoneNumber, new Address(addrLine1, addrLine2, city, state, zipCode));
			custAcc.add(newCust);
			break;
		case SUB_READUSER:
			do {
				out.echoln("================ { List of Account } ================");
				for (int i = 0; i < custAcc.getNumberOfEntries(); i++) {
					String str = (i + 1) + ". " + custAcc.getItemOf(i + 1).getName();
					out.echoln(str);
				}
				out.echo("Type the {Number} to see the details; Type {QQQ} to exit:");
				in.readIn();
				if (in.isMatchRegEx("[0-9]{1,}")) {
					out.echo(custAcc.getItemOf((Integer.parseInt(in.getUserInput()))).toString());
					in.continuePrompt();
				} else if (in.isMatchRegEx("[Q]{3}")) { // Type is quit
					break;
				}
			} while (true);
			break;
		case SUB_UPDATEUSER:
			Boolean exit = false;
			do {
				do {
					out.echoln("================ { List of Account } ================");
					for (int i = 0; i < custAcc.getNumberOfEntries(); i++) {
						String str = (i + 1) + ". " + custAcc.getItemOf(i + 1).getName();
						out.echoln(str);
					}
					out.echo("Type the {Number} to select the account for edit; Type {QQQ} to exit:");
					in.readIn();
				} while (Integer.parseInt(in.getUserInput()) > custAcc.getNumberOfEntries() && Integer.parseInt(in.getUserInput()) <= 0);
				exit = in.isMatchRegEx("QQQ");
				int userID = Integer.parseInt(in.getUserInput());
				// Customer selectedAcc = new Customer();
				do {
					do {
						out.echoln("==========================Customer Account Management==========================");
						out.echoln("1. User Name           : " + custAcc.getItemOf(userID).getUserName());
						out.echoln("2. Password            : " + custAcc.getItemOf(userID).getPassword());
						out.echoln("3. Email               : " + custAcc.getItemOf(userID).getEmail());
						out.echoln("4. Full Name           : " + custAcc.getItemOf(userID).getName());
						out.echoln("5. Gender (F/M)        : " + custAcc.getItemOf(userID).getGender());
						out.echoln("6. Age                 : " + custAcc.getItemOf(userID).getAge());
						out.echoln("7. Phone Number        : " + custAcc.getItemOf(userID).getPhoneNumber());
						out.echoln("8. Address Line 1      : " + custAcc.getItemOf(userID).getAddress().getAddrLine1());
						out.echoln("9. Address Line 1      : " + custAcc.getItemOf(userID).getAddress().getAddrLine2());
						out.echoln("10. Address City       : " + custAcc.getItemOf(userID).getAddress().getCity());
						out.echoln("11. Address State      : " + custAcc.getItemOf(userID).getAddress().getState());
						out.echoln("12. Address Zip Code   : " + custAcc.getItemOf(userID).getAddress().getZipCode());
						out.echoln("==========================Customer Account Management==========================");
						out.echo("Select the number to change; Type {QQQ} to exit: ");
						in.readIn();
						exit = in.isMatchRegEx("QQQ");
					} while ((in.isMatchRegEx("[0-9]")) && (Integer.parseInt(in.getUserInput()) >= 1) && (Integer.parseInt(in.getUserInput()) <= 12));

					switch (in.getUserInput()) {
					case "1":
						out.echo("Enter New User Name: ");
						custAcc.getItemOf(userID).setUserName(in.readIn());
						break;
					case "2":
						out.echo("Enter New User Password: ");
						custAcc.getItemOf(userID).setPassword(in.readIn());
						break;
					case "3":
						out.echo("Enter New User Email: ");
						custAcc.getItemOf(userID).setEmail(in.readIn());
						break;
					case "4":
						out.echo("Enter New User Full Name: ");
						custAcc.getItemOf(userID).setName(in.readIn());
						break;
					case "5":
						out.echo("Enter New User Gender (F/M): ");
						custAcc.getItemOf(userID).setGender(in.readIn().charAt(0));
						break;
					case "6":
						out.echo("Enter New User Age: ");
						custAcc.getItemOf(userID).setAge(Integer.parseInt(in.readIn()));
						break;
					case "7":
						out.echo("Enter New User Phone Number: ");
						custAcc.getItemOf(userID).setPhoneNumber(in.readIn());
						break;
					case "8":
						out.echo("Enter New User Address Line 1: ");
						custAcc.getItemOf(userID).getAddress().setAddrLine1(in.readIn());
						break;
					case "9":
						out.echo("Enter New User Address Line 2: ");
						custAcc.getItemOf(userID).getAddress().setAddrLine2(in.readIn());
						break;
					case "10":
						out.echo("Enter New User City: ");
						custAcc.getItemOf(userID).getAddress().setCity(in.readIn());
						break;
					case "11":
						out.echo("Enter New User State: ");
						custAcc.getItemOf(userID).getAddress().setState(in.readIn());
						break;
					case "12":
						out.echo("Enter New User Zip Code: ");
						custAcc.getItemOf(userID).getAddress().setZipCode(Integer.parseInt(in.readIn()));
						break;
					default:
						break;
					}
				} while (!exit);
			} while (!exit);
			break;

		case SUB_DELETEUSER:
			do {
				out.echoln("================ { List of Account } ================");
				for (int i = 0; i < custAcc.getNumberOfEntries(); i++) {
					String str = (i + 1) + ". " + custAcc.getItemOf(i + 1).getName();
					out.echoln(str);
				}
				out.echo("Type the {Number} to delete; Type {QQQ} to exit:");
				in.readIn();
				if (in.isMatchRegEx("[0-9]{1,}")) {
					custAcc.remove(Integer.parseInt(in.getUserInput()));
					out.msgBox("User account has been deleted", "User Account Deleted", -1);
				} else if (in.isMatchRegEx("QQQ")) {
					break;
				}
			} while (true);
			break;
		default:
			break;
		}
	}

	enum Menu {
		MAIN, SUB_CREATEUSER, SUB_READUSER, SUB_UPDATEUSER, SUB_DELETEUSER
	}
}
