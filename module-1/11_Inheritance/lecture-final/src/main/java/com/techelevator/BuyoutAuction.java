package com.techelevator;

public class BuyoutAuction extends Auction {

    private int buyoutAmount;

//    private String  itemForSale;
    public BuyoutAuction(String item, int buyoutAmount) {
        super(item);
//        this.itemForSale = item;
        this.buyoutAmount = buyoutAmount;
    }


    @Override
    public boolean placeBid(Bid offeredBid) {
        boolean isCurrentWinningBid = false;

        if (getHighBid().getBidAmount() < buyoutAmount) {

            // check if the bid is higher than the buytoutAmount
            if (offeredBid.getBidAmount() > buyoutAmount) {
                // if it is, update the amount of the offeredBid so it is the
                // actual buyoutAmount
                offeredBid = new Bid(offeredBid.getBidder(), buyoutAmount);
            }
            // at this point offeredBid will have the correct amount even
            // if the offeredBig was above the buyout amount
            isCurrentWinningBid = super.placeBid(offeredBid);
        }

        return isCurrentWinningBid;
    }


    @Override
    public String whatAmI() {
        return "Buyout Auction";
    }
}
