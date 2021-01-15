package org.docksidestage.bizfw.basic.buyticket;

/**
 * @author masH
 */
public class TicketBuyResult {
    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final ITicket ticket;
    private final int change;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * 
     * @param ticket チケット
     * @param change おつり
     */
    public TicketBuyResult(ITicket ticket, int change) {
        this.ticket = ticket;
        this.change = change;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public int getChange() {
        return change;
    }

    public ITicket getTicket() {
        return ticket;
    }
}
