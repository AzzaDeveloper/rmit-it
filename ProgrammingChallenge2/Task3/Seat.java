package Task3;
public abstract class Seat {

	private String row;
	private String number;
	private String material;
	private String position;
	//
	private boolean booked;

	/** CONSTRUCTORS */
	public Seat() {
		/**
		 * IMPLEMENT YOUR CODE HERE.
		 */
	}

	public Seat(String row, int number, String material, String position) {
		this.material = material;
		this.position = position;
		// Validates row
		if (Character.isLetter(row.charAt(0))) {
			this.row = row.toUpperCase();
		} else {
			this.row = "ERROR";	
		}
		// Validates number
		if (number > 0 && number <= 32) {
			this.number = String.format("%02d", number);
		} else {
			this.number = "-1";
		}
	}

	public String getSeatIdentifier() {
		return row + number;
	}

	public boolean isBooked() {
		return this.booked;
	}

	public boolean bookSeat() {
		if (!this.booked) {
			this.booked = true;
			return true;
		} else {
			return false;
		}
	}

	public boolean cancelBooking() {
		if (this.booked) {
			this.booked = false;
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(Seat other) {
		if (toString().equals(other.toString())) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return String.format("%s:%s:%s:%s", this.row + this.number, this.material, this.position, String.valueOf(this.booked));
	}

	public String getNumber() {
		return this.number;
	}

	public String getRow() {
		return this.row;
	}
}