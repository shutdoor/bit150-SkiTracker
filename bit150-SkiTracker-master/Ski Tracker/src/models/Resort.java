package models;

public class Resort {
	private int distanceFromLodging;
	private double snowDepth;
	private double rentalPricing;
	private int openLifts;

	public Resort(int distanceFromLodging, double snowDepth, double rentalPricing, int openLifts) {
		super();
		this.setDistanceFromLodging(distanceFromLodging);
		this.setSnowDepth(snowDepth);
		this.setRentalPricing(rentalPricing);
		this.setOpenLifts(openLifts);
	}

	public int getDistanceFromLodging() {
		return distanceFromLodging;
	}

	public void setDistanceFromLodging(int distanceFromLodging) {
		this.distanceFromLodging = distanceFromLodging;
	}

	public double getSnowDepth() {
		return snowDepth;
	}

	public void setSnowDepth(double snowDepth) {
		this.snowDepth = snowDepth;
	}

	public double getRentalPricing() {
		return rentalPricing;
	}

	public void setRentalPricing(double rentalPricing) {
		this.rentalPricing = rentalPricing;
	}

	public int getOpenLifts() {
		return openLifts;
	}

	public void setOpenLifts(int openLifts) {
		this.openLifts = openLifts;
	}

}
