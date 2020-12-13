package hotelapp;

public class HotelTest {

	public static void main(String[] args) {

		//Create Hotel 
		Hotel motel6 = new Hotel("Motel6 LAX Century Blvd.", "Los Angeles,CA");		
		
		System.out.println("\nDemo IsEmpty method...");
		System.out.println("IsEmpty: " + motel6.isEmpty()+ "\n");
		
		//Add Rooms
		motel6.addRoom(1, "king", 'n', 50.00);
		motel6.addRoom(2, "king", 'n', 50.00);
		motel6.addRoom(3, "Queen", 'n', 40.00);
		motel6.addRoom(4, "Queen", 's', 40.00);
		motel6.addRoom(5, "twin", 's', 20.00);	
		motel6.addRoom(6, "twin", 's', 20.00);
		
		//Add Reservations
		motel6.addReservation("Bob", 'n', "king");
		motel6.addReservation("Bill", 'n', "king");
		motel6.addReservation("Jenny", 'n', "Queen");
		motel6.addReservation("Sam", 's', "Queen");
		motel6.addReservation("Ron", 's', "twin");
		motel6.addReservation("Jack", 's', "twin");

		System.out.println("\nDemo isFull method...");
		System.out.println("Full: " + motel6.isFull() + "\n");
		
		//Print Rooms
		System.out.println(motel6);
		
		System.out.println("\nDemo Cancel method...");
		motel6.cancelReservation("sam");
		
	
		System.out.println("\nDemo isFull method...");
		System.out.println("Full: " + motel6.isFull());
		
		System.out.println("\nDemo PrintReservationList method...");
		motel6.printReservationList();

		System.out.println("\nDemo Daily Sales and Occupancy Percentage...");
		System.out.println("\nDaily Sales: $" + motel6.getDailySales());
		System.out.println("Get occupency percentage: " + 100 * motel6.occupancyPercentage()+"%");
		
		System.out.println("\nShowing final results of hotal data...");
		System.out.println(motel6);
		
	}

}  // sample output below

/*
Demo IsEmpty method...
IsEmpty: true

Reservation made for: Bob
Reservation made for: Bill
Reservation made for: Jenny
Reservation made for: Sam
Reservation made for: Ron
Reservation made for: Jack

Demo isFull method...
Full: true


Name: Motel6 LAX Century Blvd., Los Angeles,CA
Number of Rooms: 6
Number of Occupied Rooms: 6

Hotel Details Are: 

Room Number: 1
Occupant: Bob
Smoking: n
Bed Type: king
Rate: 50.0
 
Room Number: 2
Occupant: Bill
Smoking: n
Bed Type: king
Rate: 50.0
 
Room Number: 3
Occupant: Jenny
Smoking: n
Bed Type: Queen
Rate: 40.0
 
Room Number: 4
Occupant: Sam
Smoking: s
Bed Type: Queen
Rate: 40.0
 
Room Number: 5
Occupant: Ron
Smoking: s
Bed Type: twin
Rate: 20.0
 
Room Number: 6
Occupant: Jack
Smoking: s
Bed Type: twin
Rate: 20.0
 

Demo Cancel method...
Reservation cancelled for: Sam

Demo isFull method...
Full: false

Demo PrintReservationList method...

Room Number: 1
Occupant: Bob
Smoking: n
Bed Type: king
Rate: 50.0

Room Number: 2
Occupant: Bill
Smoking: n
Bed Type: king
Rate: 50.0

Room Number: 3
Occupant: Jenny
Smoking: n
Bed Type: Queen
Rate: 40.0

Room Number: 5
Occupant: Ron
Smoking: s
Bed Type: twin
Rate: 20.0

Room Number: 6
Occupant: Jack
Smoking: s
Bed Type: twin
Rate: 20.0

Demo Daily Sales and Occupancy Percentage...

Daily Sales: $180.0
Get occupency percentage: 83.33333333333334%

Showing final results of hotal data...

Name: Motel6 LAX Century Blvd., Los Angeles,CA
Number of Rooms: 6
Number of Occupied Rooms: 5

Hotel Details Are: 

Room Number: 1
Occupant: Bob
Smoking: n
Bed Type: king
Rate: 50.0
 
Room Number: 2
Occupant: Bill
Smoking: n
Bed Type: king
Rate: 50.0
 
Room Number: 3
Occupant: Jenny
Smoking: n
Bed Type: Queen
Rate: 40.0
 
Room Number: 4
Occupant: Not Occupied
Smoking: s
Bed Type: Queen
Rate: 40.0
 
Room Number: 5
Occupant: Ron
Smoking: s
Bed Type: twin
Rate: 20.0
 
Room Number: 6
Occupant: Jack
Smoking: s
Bed Type: twin
Rate: 20.0

 * */
