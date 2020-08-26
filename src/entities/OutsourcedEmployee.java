package entities;

public class OutsourcedEmployee extends Employee {
	private Double additonalCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additonalCharge) {
		super(name, hours, valuePerHour);
		this.additonalCharge = additonalCharge;
	}

	public Double getAdditonalCharge() {
		return additonalCharge;
	}

	public void setAdditonalCharge(Double additonalCharge) {
		this.additonalCharge = additonalCharge;
	}
	
	@Override
	public final Double payment(){
		return super.payment() + additonalCharge * 1.1;

	}
	
	public String toString() {
		return " $" + payment();
	}
	
}
