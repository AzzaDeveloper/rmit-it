package Task3;
public class PremiumSeat extends Seat {

    private boolean pillowed = true;    
    private boolean legRest = false;
    private String position;

    public PremiumSeat(String row, int number, String position) {
        super(row, number, "Leather", position);
        this.position = position;
        if (row == "A") {
            this.legRest = true;
        }
    }

    public String toString() {
		return String.format("%s:%s:%s:%s:%s:%s", this.getSeatIdentifier(), "Leather", this.position, this.isBooked(), String.valueOf(this.pillowed), String.valueOf(this.legRest));
	}
}
