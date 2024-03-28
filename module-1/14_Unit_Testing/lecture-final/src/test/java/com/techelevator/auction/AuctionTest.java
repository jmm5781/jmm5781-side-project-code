package com.techelevator.auction;

import com.techelevator.auction.Auction;
import com.techelevator.auction.Bid;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//import static org.junit.Assert.assertNotNull;

public class AuctionTest {

    private Auction auction;

    @Before
    public void setUp() {
        auction = new Auction("balloon");
    }

    @Test
    public void constructor_validData_createsCorrectData() {
        // Arrange
        String expectedItem = "balloon";
        Bid expectedBid = new Bid("", 0);

        // Act
        Auction result = new Auction("balloon");

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(expectedItem, result.getItemForSale());
        Assert.assertEquals("", result.getHighBid().getBidder());
        Assert.assertEquals(0, result.getHighBid().getBidAmount());
        Assert.assertNotNull(result.getAllBids());
        Assert.assertEquals(0, result.getAllBids().size());


    }

    @Test
    public void placeBid_isHighestBid_handlesCorrectly() {
        // Arrange
//        Auction auction = new Auction("balloon");
        Bid firstBid = new Bid("Yoav", 50);
        Bid secondBid = new Bid("Lisa", 75);
        Bid thirdBid = new Bid("Rachael", 25);


        Bid exptecedHighBid = new Bid("Lisa", 75);
        // Act
        boolean bid1Result = auction.placeBid(firstBid);
        boolean bid2Result = auction.placeBid(secondBid);
        boolean bid3Result = auction.placeBid(thirdBid);

        // Assert

        Assert.assertTrue("firstBid expected to be highest", bid1Result);
        Assert.assertTrue("secondBid expected to be highest", bid2Result);
        Assert.assertFalse("thirdBid expected to not be highest", bid3Result);

        Assert.assertEquals(secondBid, auction.getHighBid());

        Assert.assertEquals(3, auction.getAllBids().size());
        Assert.assertTrue(auction.getAllBids().contains(firstBid));
        Assert.assertTrue(auction.getAllBids().contains(secondBid));
        Assert.assertTrue(auction.getAllBids().contains(thirdBid));

        // Another way

        // Arrange
        List<Bid> expectedBids = new ArrayList<>();
        expectedBids.add(firstBid);
        expectedBids.add(secondBid);
        expectedBids.add(thirdBid);

        // Assert
        Assert.assertEquals(expectedBids, auction.getAllBids());



    }

    @Test
    public void placeBid_nullBid_returnsFalse() {
//        Auction auction = new Auction("balloon");

        boolean result = auction.placeBid(null);

        Assert.assertFalse(result);
    }

}
