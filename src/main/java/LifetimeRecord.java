package sharkzilla;

public class LifetimeRecord extends RecordModel {
	
	private float distance;
	private int floors;
	
	//constructor which populates fields with data from API call
	//currently we are using fake sample data instead of an API call
	LifetimeRecord() {
		distance = FakeAPI.getLtDistance();
		floors = FakeAPI.getLtFloors();
	}
	
	//access methods
	public float getDistance() {
		return distance;
	}
	public int getFloors() {
		return floors;
	}
}
