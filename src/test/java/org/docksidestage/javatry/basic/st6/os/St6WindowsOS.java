package org.docksidestage.javatry.basic.st6.os;

/**
 * @author masH
 *
 */
public class St6WindowsOS extends St6OperationSystem {
    public St6WindowsOS(String loginId) {
        super(loginId);
    }

    protected String getFileSeparator() {
        return "\\";
    }

    protected String getUserDirectory() {
        return "/Users/" + loginId;
    }
}
