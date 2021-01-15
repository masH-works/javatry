package org.docksidestage.bizfw.basic.buyticket;

/**
 * @author masH
 */
public class DaysTicket implements ITicket {
    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final int displayPrice;
    private final int insideLimit;
    private final String ticketType;
    private boolean alreadyIn;
    private int insideTimes = 0;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DaysTicket(int displayPrice, int insideLimit) {
        this.displayPrice = displayPrice;
        this.insideLimit = insideLimit;
        this.ticketType = generateTicketType(insideLimit);
    }

    private String generateTicketType(int insideLimit) {
        return insideLimit + "Day";
    }

    // ===================================================================================
    //                                                                             In Park
    //                                                                             =======
    @Override
    public void doInPark() {
        if (isAlreadyIn()) {
            throw new IllegalStateException("Already in park by this ticket: displayedPrice=" + displayPrice);
        }
        this.insideTimes += 1;
        if (insideTimes > insideLimit) {
            throw new IllegalStateException("Use this ticket over the limit:insideLimit=" + insideLimit);
        }
        alreadyIn = true;
    }

    public void doOutPark() {
        if (!isAlreadyIn()) {
            throw new IllegalStateException("Already out park.");
        }
        this.alreadyIn = false;
    }

    public boolean isAlreadyIn() {
        return alreadyIn;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    @Override
    public int getDisplayPrice() {
        return this.displayPrice;
    }

    public String getTicketType() {
        return this.ticketType;
    }
}
