/**
 * 
 */
package org.docksidestage.javatry.basic.st6.os;

/**
 * @author masH
 *
 */
public class St6OldWomdowsOS extends St6OperationSystem {

    /**
     * @param loginId
     */
    public St6OldWomdowsOS(String loginId) {
        super(loginId);
        // TODO Auto-generated constructor stub
    }

    protected String getFileSeparator() {
        return "\\";
    }

    protected String getUserDirectory() {
        return "/Documents and Settigs/" + loginId;
    }
}
