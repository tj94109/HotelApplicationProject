package hotelapp;

public class Room{

	private int roomNumber;
	private String bedType, occupantName;
	private char smoking;
	private double rate;
	private boolean occupied;
	
	public Room() {
		this.roomNumber = 0;
		this.bedType = "default";
		this.occupantName = "guest";
		this.smoking = 'n';
		this.rate =0;
		this.occupied = false;

	}
	
	public Room(int roomNum, String bed, char smoking, double rate ){
	
		this.roomNumber = roomNum;
		this.bedType = bed;
		this.smoking = smoking;
		this.rate = rate;
		
	}
	public String getBedType() {
		return this.bedType;
	}
	
	public char getSmoking() {
		return this.smoking;
	}
	
	public int getRoomNumber() {
		return this.roomNumber;
	}
	
	public String getOccupant() {
		return this.occupantName;
	}
	
	public void setOccupied(boolean occupied){
		this.occupied = occupied;
	}

	public void setOccupant(String name) {
		this.occupantName =name;
	}
	
	public void setRoomNumber(int room) {
		this.roomNumber=room;
	}
	
	public void setBedType(String bed) {
		this.bedType = bed;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public void setSmoking(char smoking) {
		this.smoking = smoking;
	}
	
	public boolean isOccupied() {
		return this.occupied;
	}
	
	public String toString() {
		return "\nRoom Number: " + this.roomNumber +
				"\nOccupant: " + this.getOccupant() +
				"\nSmoking: " + this.smoking +
				"\nBed Type: " + this.bedType +
				"\nRate: " + this.rate;
		
	}
	
}
