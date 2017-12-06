package task2;

public class GSMDemo {

	public static void main(String[] args) {
				
		GSM myPhone = new GSM();
		myPhone.model = "Samsung";
		myPhone.insertSimCard("0887888888");
		System.out.println(myPhone.simMobileNumber + " " + myPhone.hasSimCard);
		
		GSM yourPhone = new GSM();
		yourPhone.model = "iPhone";
		yourPhone.insertSimCard("0887888666");
		System.out.println(yourPhone.simMobileNumber + " " + yourPhone.hasSimCard);
	
		myPhone.call(yourPhone, 5);

		myPhone.printInfoForTheLastOutgoingCall();
		yourPhone.printInfoForTheLastIncomingCall();
		System.out.println(myPhone.getSumForCall());
		
		
	}

}
