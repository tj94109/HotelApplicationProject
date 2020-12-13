package hotelapp;

public class Hotel {

	Room[] theRooms = new Room[10];
	
	private static final int NOT_FOUND = -1; 
	
	static int numberOfRooms = 0;
	static int occupiedRooms = 0;
	private String name;
	private String location;
	
	
	public Hotel(String name, String location){
		this.name = name;
		this.location = location;
				
	}
	
	
	public boolean isFull() {

		return numberOfRooms == occupiedRooms;		
	}
	public boolean isEmpty() {
		return numberOfRooms == 0;
	}
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	
	public void addRoom(int roomNumber,String bedType, char smoking, double rate) {
		
		for(int i = 0; i < theRooms.length; i++ ) {
			if(theRooms[i] == null) {
				theRooms[i] = new Room(roomNumber,bedType, smoking, rate);
				break;
			}
		}
		numberOfRooms++;
	}
	
	public void addReservation(String name, char smoking, String bedType) {
		
		for(Room r: this.theRooms) {
			if(!(r==null)) {
				if(r.isOccupied()==false) {
					if(bedType==r.getBedType() && r.getSmoking()==smoking) {
						r.setOccupant(name);
						r.setOccupied(true);
						System.out.println("Reservation made for: " + r.getOccupant());
						occupiedRooms++;
						break;
					}else {
						System.out.println("Reservation not made.");
						break;
					}
				}
			}	
			
		}
		
	}
	
	public void cancelReservation(String name) {
	
		int roomIndex = findReservation(name);		
		if(roomIndex == NOT_FOUND) {
			System.out.println("Sorry, reservation was not found");
		}else {
			System.out.println("Reservation cancelled for: " + this.theRooms[roomIndex].getOccupant());
			this.theRooms[roomIndex].setOccupied(false);
			this.theRooms[roomIndex].setOccupant("Not Occupied");
			occupiedRooms--;
	
		}
		
	}
	
	private int findReservation(String name) {
		int roomIndex = 0;
		int i;
		for(i=0 ;i<this.theRooms.length-1; i++) {
			if(!(this.theRooms[i]==null) && this.theRooms[i].getOccupant().equalsIgnoreCase(name)) {
				roomIndex = i;
				break;
			}else {
				roomIndex = NOT_FOUND;
			}
		}
		
		return roomIndex;
	}
	
	public void printReservationList() {
		for(Room r: this.theRooms) {
			if(!(r==null)) {
				if(r.isOccupied()==true) {
					System.out.println(r);
				}
			}
	
		}
	}
	
	public double getDailySales() {
	
		double totalSales =0;
		
		for(Room r: this.theRooms) {
			if(!(r==null)) {
				if(r.isOccupied()==true) {
					totalSales = totalSales + r.getRate();
				}
			}
	
		}
		return totalSales;
	}
	
	public double occupancyPercentage() {
		return (double)(occupiedRooms)/(double)(this.getNumberOfRooms());
	}
	
	public String toString() {
		String hotelInfo = "\nName: " + name + ", " + location +
				"\nNumber of Rooms: " + numberOfRooms +
				"\nNumber of Occupied Rooms: " + occupiedRooms + 
				"\n\nHotel Details Are: \n";

		StringBuilder myString = new StringBuilder();
		
		
		for(Room r: this.theRooms) {
			if(!(r==null)) {
				myString.append(r + "\n ");
			}
			
		}
		
		String result = hotelInfo + myString.toString();
		
		return result;
	
	}

	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}

}

