package org.docksidestage.javatry.basic.st6.os;

/**
 * @author masH
 *
 */
public class St6OldWindowsOS extends St6OperationSystem {
    public St6OldWindowsOS(String loginId) {
        super(loginId);
    }

    protected String getFileSeparator() {
        return "\\";
    }

    protected String getUserDirectory() {
        return "/Documents and Settings/" + loginId;
    }
}
