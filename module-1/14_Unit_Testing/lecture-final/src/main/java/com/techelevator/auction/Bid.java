package com.techelevator.auction;

import java.util.Objects;

public class Bid {

	private String bidder;
	private int bidAmount;

	public Bid(String bidder, int bidAmount) {
		this.bidder = bidder;
		this.bidAmount = bidAmount;
	}

	public String getBidder() {
		return bidder;
	}

	public int getBidAmount() {
		return bidAmount;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Bid bid = (Bid) o;
		return bidAmount == bid.bidAmount && Objects.equals(bidder, bid.bidder);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bidder, bidAmount);
	}
}
