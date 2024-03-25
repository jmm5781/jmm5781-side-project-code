package com.techelevator;

public class ReserveAuction extends Auction {

    private int reserveAmount;

    public ReserveAuction(String itemForSale, int reserveAmount) {
        super(itemForSale);
        this.reserveAmount = reserveAmount;
    }

    public int getReserveAmount() {
        return reserveAmount;
    }

    public void setReserveAmount(int reserveAmount) {
        this.reserveAmount = reserveAmount;
    }

    @Override
    public boolean placeBid(Bid offeredBid) {
        boolean isCurrentWinningBid = false;

        if (offeredBid.getBidAmount() >= reserveAmount) {
            isCurrentWinningBid = super.placeBid(offeredBid);
        }


        return isCurrentWinningBid;
    }

    public void printItemForSale() {
        // must use getter because ReserveAUction does not have access
        // ti private properties of Auction
        //
        // Note that we don't call this on an instance
//        System.out.println(getItemForSale());
        System.out.println(getItemForSale());

    }

    @Override
    public String toString() {
//        System.out.println(super.toString());
        return "ReserveAuction{" +
                "reserveAmount=" + reserveAmount +
                '}';
    }

    @Override
    public String whatAmI() {
        return "Reserve Auction";
    }
}
