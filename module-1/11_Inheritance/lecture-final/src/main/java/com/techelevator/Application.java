package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids


        /*
        Bid winningBid = generalAuction.getHighBid();
        String winner = winningBid.getBidder();
        System.out.println("Winner of general auction: " + winner);

         */

        if (generalAuction != null && generalAuction.getHighBid() != null) {
            System.out.println("Winner of general auction: " + generalAuction.getHighBid() // Bid
                    .getBidder()); // calling a method on the returned Bid
        }

        /*

        ReserveAuction reserveAuction = new ReserveAuction("Cool Cup", 10);
        System.out.println();
        reserveAuction.printItemForSale();

        System.out.println(reserveAuction.getReserveAmount());
        System.out.println(reserveAuction.getItemForSale());

        System.out.println(reserveAuction.toString());

         */

//        ReserveAuction reserveAuction = new ReserveAuction("Cool Cup", 100);

        // We are assigning the more specific version (ReserveAuction) to the more general Auction
        // type
        Auction reserveAuction = new ReserveAuction("Cool Cup", 100);

        /*
            This will not work because reserveAuction is seen as an Auction, which does
            not have this method
         */
        //        reserveAuction.printItemForSale();

//        reserveAuction.printItemForSale();

        // A copy of the reserveAuction but cast as a ReserveAuction
        // this allows it so see the methods in ReserveAuction
        ReserveAuction auctionAsReserve = (ReserveAuction)reserveAuction;
        auctionAsReserve.printItemForSale();

        // Before we cast toa more specific type, we should use instanceof to confirm
        // it is actually an instance of the type we will be casting to
        if (reserveAuction instanceof ReserveAuction) {

            ((ReserveAuction)reserveAuction).printItemForSale();
        }


        reserveAuction.placeBid(new Bid("Yoav", 50));
        reserveAuction.placeBid(new Bid("Linda", 150));
        reserveAuction.placeBid(new Bid("Lisa", 125));

        if (reserveAuction != null && reserveAuction.getHighBid() != null) {
            System.out.println("Winner of reserve auction: " + reserveAuction.getHighBid() // Bid
                    .getBidder()); // calling a method on the returned Bid
        }

        // A List of auctions
        List<Auction> auctionList = new ArrayList<>();

        // Can add Auction OR ReserveAuction objects to it because
        // ReserveAuction IS-A(n) Auction
        auctionList.add(generalAuction);
        auctionList.add(reserveAuction);

        System.out.println();



        BuyoutAuction buyoutAuction = new BuyoutAuction("TE Backpack", 25);
        buyoutAuction.placeBid(new Bid("Yoav", 10));
        buyoutAuction.placeBid(new Bid("John", 15));
        buyoutAuction.placeBid(new Bid("Rachael", 34));
        buyoutAuction.placeBid(new Bid("LisA", 30));

        auctionList.add(buyoutAuction);

        // Iterate through List and print all auction info
        for (Auction curAuction : auctionList) {
            System.out.println("I am " + curAuction.whatAmI() + " Item for sale: " + curAuction.getItemForSale() + " Winning Bid: $"
                + curAuction.getHighBid().getBidAmount());
        }


//        generalAuction.placeBid(new Bid("Fonz", 23));





    }
}
