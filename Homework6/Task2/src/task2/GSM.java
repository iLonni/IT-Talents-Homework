package task2;

public class GSM {
	
	String model = " ";
	boolean hasSimCard  = false;
	String simMobileNumber = " ";
	long outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	
	Call call = new Call();
	
	void insertSimCard(String simMobileNumber) {
		 if (simMobileNumber.substring(0,2).equals("08") && simMobileNumber.length() == 10) { 
			 hasSimCard = true;
			 this.simMobileNumber = simMobileNumber;
		 }
	}
	
	void removeSimCard() {
		hasSimCard = false;
		simMobileNumber = " ";
	}
	
	void call(GSM newReceiver, int duration) {
		if (duration < 0 || duration > Integer.MAX_VALUE) {
			System.out.println("The duration of the conversation is NOT valid.");
		}
		if (this.equals(newReceiver)) {
			System.out.println("Sorry, but you can't call yourself! Try calling someone else.");
		}
		if (!(this.hasSimCard && newReceiver.hasSimCard)) {
			System.out.println("One of the phones doesn't have a SIM card.");
		}	
		
		call.caller = this;
		call.receiver = newReceiver;
		call.duration = duration;
		lastOutgoingCall = call;
		newReceiver.lastIncomingCall = call;		
		outgoingCallsDuration += duration;		
	}
	
	double getSumForCall() {
		Call call = new Call();
		double sum = 0;
		if (this.outgoingCallsDuration > 0 && this.outgoingCallsDuration <= Integer.MAX_VALUE) {
			sum += outgoingCallsDuration * call.priceForAMinute;
		}
		else {
			System.out.println("The duration is not valid.");
		}
		return sum;			
	}
	
	void printInfoForTheLastOutgoingCall() {
		GSM otherGSM = new GSM();
		otherGSM = call.receiver;
		if (lastOutgoingCall != null && otherGSM != null) {
			System.out.println("Caller: " + this.simMobileNumber);
			System.out.println("Receiver: " + otherGSM.simMobileNumber);
			System.out.println("Duration: " + lastOutgoingCall.duration);
		}
		else {
			System.out.println("The last outgoing call does NOT exist.");
		}
	}
	
	void printInfoForTheLastIncomingCall() {
		GSM otherGSM = new GSM();
		otherGSM = call.caller;
		if (lastIncomingCall != null && otherGSM != null) {
			System.out.println("Caller: " + otherGSM.simMobileNumber);
			System.out.println("Receiver: " + this.simMobileNumber);
			System.out.println("Duration: " + lastIncomingCall.duration);
		}
		else {
			System.out.println("The last incoming call does NOT exist.");
		}
	}
	
}