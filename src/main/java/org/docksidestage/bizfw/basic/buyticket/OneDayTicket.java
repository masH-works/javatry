/*
 * Copyright 2019-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.bizfw.basic.buyticket;

/**
 * @author jflute
 * @author masH
 */
public class OneDayTicket implements ITicket {
    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private final int displayPrice;
    private final int INSIDE_LIMIT = 1;
    private final String ticketType;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private boolean alreadyIn;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public OneDayTicket(int displayPrice) {
        this.displayPrice = displayPrice;
        this.ticketType = generateTicketType(INSIDE_LIMIT);
    }

    private String generateTicketType(int insideLimit) {
        return insideLimit + "Day";
    }

    // ===================================================================================
    //                                                                             In Park
    //                                                                             =======
    public void doInPark() {
        if (alreadyIn) {
            throw new IllegalStateException("Already in park by this ticket: displayedPrice=" + displayPrice);
        }
        alreadyIn = true;
    }

    public boolean isAlreadyIn() {
        return alreadyIn;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public int getDisplayPrice() {
        return displayPrice;
    }

    public String getTicketType() {
        return ticketType;
    }
}