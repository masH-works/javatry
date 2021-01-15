package org.docksidestage.bizfw.basic.buyticket;

/**
 * @author masH
 */
public interface ITicket {
    //    I○○の形はJavaだと少数
    //    interfaceであるかを意識しているかという考えで変わる

    void doInPark();

    int getDisplayPrice();

    String getTicketType();

    boolean isAlreadyIn();
}
