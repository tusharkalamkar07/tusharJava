package com.hn;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int mobId;
	private String brandName;
	private int mobCost;

	public Mobile() {
		super();
	}

	public Mobile(int mobId, String brandName, int mobCost) {
		super();
		this.mobId = mobId;
		this.brandName = brandName;
		this.mobCost = mobCost;
	}

	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId) {
		this.mobId = mobId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getMobCost() {
		return mobCost;
	}

	public void setMobCost(int mobCost) {
		this.mobCost = mobCost;
	}

	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", brandName=" + brandName + ", mobCost=" + mobCost + "]";
	}

}
