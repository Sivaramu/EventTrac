package com.opensource.tools.event.model;

public class Location {

	private double latitude;
	private double longitude;
	private String name;
	private LocationType type;

	public static final double RADIUS = 3963.1676;

	public Location(String name, double latitude, double longitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getName() {
		return name;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public double distanceFrom(Location other) {
		return Math.acos(Math.sin(Math.toRadians(latitude)) * Math.sin(Math.toRadians(other.latitude))
				+ Math.cos(Math.toRadians(latitude)) * Math.cos(Math.toRadians(other.latitude))
						* Math.cos(Math.toRadians(longitude) - Math.toRadians(other.longitude)))
				* RADIUS;
	}

	public LocationType getType() {
		return type;
	}

	public void setType(LocationType type) {
		this.type = type;
	}

}