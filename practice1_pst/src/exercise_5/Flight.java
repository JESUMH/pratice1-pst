package exercise_5;

public class Flight {
	
	private String lineName;
	private int flightId; 
	
	public Flight(String lineName, int flightId) {
		this.lineName = lineName;
		this.setFlightId(flightId);
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	@Override
	public String toString() {
		return "Flight [lineName=" + lineName + ", flightId=" + flightId + "]";
	}

}
