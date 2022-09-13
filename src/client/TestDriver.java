package client;

import adt.*;
import entity.*;
import utility.*;

public class TestDriver {
	static Input in = new Input();
	static Output out = new Output();
	static ArrayList<Customer> custArr = new ArrayList<>();

	public static void main(String[] args) {
		init(custArr); // Initialize the program with some preset data and fill the list with 20
		do {
			do {
				displayMenu_Main();
				in.readIn();
			} while (!in.isMatchRegEx("[1234]{1}"));

			switch (in.getUserInput()) {
			case "1": // Create
				displayMenu_Sub("1");
				break;
			case "2": // Read
				do {
					displayMenu_Sub("2");
					in.readIn();
					if (in.isMatchRegEx("[0-9]{1,}")) {
						out.echo(custArr.getItemOf((Integer.parseInt(in.getUserInput()))).toString());
						in.continuePrompt();
					} else if (in.isMatchRegEx("[Q]{3}")) { // Type is quit
						break;
					}
				} while (true);
				break;
			case "3": // Update
				Boolean exit = false;
				do {
					do {
						displayMenu_Sub("3");
						in.readIn();
					} while (Integer.parseInt(in.getUserInput()) > custArr.getNumberOfEntries() && Integer.parseInt(in.getUserInput()) <= 0);
					exit = in.isMatchRegEx("QQQ");
					int userID = Integer.parseInt(in.getUserInput());
					// Customer selectedAcc = new Customer();
					do {
						do {
							out.echoln("==========================Customer Account Management==========================");
							out.echoln("1. User Name       : " + custArr.getItemOf(userID).getUserName());
							out.echoln("2. Password        : " + custArr.getItemOf(userID).getPassword());
							out.echoln("3. Email           : " + custArr.getItemOf(userID).getEmail());
							out.echoln("4. Full Name       : " + custArr.getItemOf(userID).getName());
							out.echoln("5. Gender (F/M)    : " + custArr.getItemOf(userID).getGender());
							out.echoln("6. Age             : " + custArr.getItemOf(userID).getAge());
							out.echoln("7. Phone Number    : " + custArr.getItemOf(userID).getPhoneNumber());
							out.echoln("8. Address         : " + custArr.getItemOf(userID).getAddress());
							out.echoln("==========================Customer Account Management==========================");
							out.echo("Select the number to change; Type {QQQ} to exit: ");
							in.readIn();
							exit = in.isMatchRegEx("QQQ");
						} while (!in.isMatchRegEx("[12345678]{1}|QQQ"));

						switch (in.getUserInput()) {
						case "1":
							out.echo("Enter New User Name: ");
							custArr.getItemOf(userID).setUserName(in.readIn());
							break;
						case "2":
							out.echo("Enter New User Password: ");
							custArr.getItemOf(userID).setPassword(in.readIn());
							break;
						case "3":
							out.echo("Enter New User Email: ");
							custArr.getItemOf(userID).setEmail(in.readIn());
							break;
						case "4":
							out.echo("Enter New User Full Name: ");
							custArr.getItemOf(userID).setName(in.readIn());
							break;
						case "5":
							out.echo("Enter New User Gender (F/M): ");
							custArr.getItemOf(userID).setGender(in.readIn().charAt(0));
							break;
						case "6":
							out.echo("Enter New User Age: ");
							custArr.getItemOf(userID).setAge(Integer.parseInt(in.readIn()));
							break;
						case "7":
							out.echo("Enter New User Phone Number: ");
							custArr.getItemOf(userID).setPhoneNumber(in.readIn());
							break;
						case "8":
							out.echo("Enter New User Address: ");
							custArr.getItemOf(userID).setAddress(in.readIn());
							break;
						default:
							break;
						}
					} while (!exit);

				} while (!exit);
				// break;
			case "4": // Delete
				do {
					displayMenu_Sub("4");
					in.readIn();
					if (in.isMatchRegEx("[0-9]{1,}")) {
						custArr.remove(Integer.parseInt(in.getUserInput()));
					} else if (in.isMatchRegEx("[Q]{3}")) {
						break;
					}
				} while (true);
				break;
			default:
				break;

			}

		} while (true);
	}

	public static void init(ArrayList<Customer> array) {
		Customer account1 = new Customer("bgraal0", "PXC7lP", "bgraal0@bizjournals.com", "Belicia Graal", 'M', 37, "+62 612 459 4084", "8524 Bay Court");
		Customer account2 = new Customer("sheintzsch1", "HUTWyYW", "sheintzsch1@biglobe.ne.jp", "Schuyler Heintzsch", 'M', 21, "+358 808 412 8474", "50121 Derek Trail");
		Customer account3 = new Customer("sjozsika2", "KNmpfeHNV", "sjozsika2@ycombinator.com", "Stu Jozsika", 'M', 26, "+62 308 935 8378", "75845 Shopko Avenue");
		Customer account4 = new Customer("acolls3", "2SpsVLKAF9e", "acolls3@discuz.net", "Alexis Colls", 'F', 15, "+86 407 180 0762", "841 Fieldstone Terrace");
		Customer account5 = new Customer("blarcombe4", "cYKbapvc", "blarcombe4@clickbank.net", "Bartel Larcombe", 'M', 49, "+86 451 208 8950", "1 Independence Point");
		Customer account6 = new Customer("mlongdon5", "tUJIDd0U", "mlongdon5@livejournal.com", "Maitilde Longdon", 'F', 18, "+86 943 230 2650", "50478 Cascade Hill");
		Customer account7 = new Customer("rskule6", "28aGcPV", "rskule6@foxnews.com", "Rab Skule", 'M', 20, "+420 162 891 4954", "958 Sugar Center");
		Customer account8 = new Customer("dpods7", "b5VBMSWc", "dpods7@a8.net", "Devonne Pods", 'M', 37, "+51 903 956 6538", "486 Northview Trail");
		Customer account9 = new Customer("jwattisham8", "lhnPbg0TGS", "jwattisham8@admin.ch", "Jacqueline Wattisham", 'M', 27, "+81 743 599 7171", "44884 Hoepker Alley");
		Customer account10 = new Customer("ngoodwins9", "AEJdpkK", "ngoodwins9@salon.com", "Nicola Goodwins", 'F', 50, "+386 170 188 9532", "601 Steensland Crossing");
		Customer account11 = new Customer("mgirka", "oH30hZGt", "mgirka@mac.com", "Merissa Girk", 'M', 42, "+48 464 882 9981", "88536 Moose Drive");
		Customer account12 = new Customer("rheinemannb", "Ys8W3iaC", "rheinemannb@artisteer.com", "Raffarty Heinemann", 'M', 15, "+62 340 877 1947", "9993 Rowland Road");
		Customer account13 = new Customer("bbuttonc", "8fP77dCAQhR", "bbuttonc@printfriendly.com", "Berton Button", 'F', 27, "+86 502 544 1249", "6 Russell Lane");
		Customer account14 = new Customer("oingled", "ZpyAM8Np53Zz", "oingled@nymag.com", "Ola Ingle", 'F', 20, "+47 283 224 8001", "046 Florence Drive");
		Customer account15 = new Customer("lgethene", "jBI2K0Ah8vL", "lgethene@ox.ac.uk", "Lusa Gethen", 'F', 33, "+62 244 866 5556", "51 Logan Hill");
		Customer account16 = new Customer("gbeetonf", "9kxGIU", "gbeetonf@printfriendly.com", "Gustavo Beeton", 'F', 23, "+93 282 901 3987", "80 Melby Street");
		Customer account17 = new Customer("gtanslyg", "IIN0waL0bP", "gtanslyg@blogtalkradio.com", "Granger Tansly", 'M', 37, "+48 468 489 4543", "20 Logan Junction");
		Customer account18 = new Customer("yclemensonh", "nzOc4ArJtWNw", "yclemensonh@yandex.ru", "Yorgo Clemenson", 'F', 27, "+7 333 332 8402", "48 Summit Court");
		Customer account19 = new Customer("bormondei", "kGS1wZuV1", "bormondei@dyndns.org", "Brenda Ormonde", 'F', 26, "+351 993 243 4282", "97 Superior Crossing");
		Customer account20 = new Customer("cingilsonj", "b4vR2tmAihe", "cingilsonj@nytimes.com", "Christen Ingilson", 'F', 23, "+48 591 524 9534", "67 Grim Street");

		array.add(account1);
		array.add(account2);
		array.add(account3);
		array.add(account4);
		array.add(account5);
		array.add(account6);
		array.add(account7);
		array.add(account8);
		array.add(account9);
		array.add(account10);
		array.add(account11);
		array.add(account12);
		array.add(account13);
		array.add(account14);
		array.add(account15);
		array.add(account16);
		array.add(account17);
		array.add(account18);
		array.add(account19);
		array.add(account20);
	}

	public static void displayMenu_Main() {
		out.echoln("==========================Customer Account Management==========================");
		out.echoln("1. Create User Account");
		out.echoln("2. Read User Account");
		out.echoln("3. Update User Account");
		out.echoln("4. Delete User Account");
		out.echoln("==========================Customer Account Management==========================");
		out.echo("Enter the menu ID: ");
	}

	public static void displayMenu_Sub(String level) {
		switch (level) {
		case "1":
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
			out.echo("8. Enter Address         : ");
			String address = in.readIn();
			out.echoln("==========================Customer Account Management==========================");
			Customer newCust = new Customer(userName, password, email, name, gender, age, phoneNumber, address);
			custArr.add(newCust);
			break;
		case "2":
			out.echoln("================ { List of Account } ================");
			for (int i = 0; i < custArr.getNumberOfEntries(); i++) {
				String str = (i + 1) + ". " + custArr.getItemOf(i + 1).getName();
				out.echoln(str);
			}
			out.echo("Type the {Number} to see the details; Type {QQQ} to exit:");
			break;
		case "3":
			out.echoln("================ { List of Account } ================");
			for (int i = 0; i < custArr.getNumberOfEntries(); i++) {
				String str = (i + 1) + ". " + custArr.getItemOf(i + 1).getName();
				out.echoln(str);
			}
			out.echo("Type the {Number} to select the account for edit; Type {QQQ} to exit:");
			break;

		case "4":
			out.echoln("================ { List of Account } ================");
			for (int i = 0; i < custArr.getNumberOfEntries(); i++) {
				String str = (i + 1) + ". " + custArr.getItemOf(i + 1).getName();
				out.echoln(str);
			}
			out.echo("Type the {Number} to delete; Type {QQQ} to exit:");
			break;
		default:
			break;
		}

	}

}
