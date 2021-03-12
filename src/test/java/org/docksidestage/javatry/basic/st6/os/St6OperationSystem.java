package org.docksidestage.javatry.basic.st6.os;

/**
 * @author jflute
 * @author masH
 */
public abstract class St6OperationSystem {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final String loginId;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public St6OperationSystem(String loginId) {
        this.loginId = loginId;
    }

    // ===================================================================================
    //                                                                      User Directory
    //                                                                      ==============
    public String buildUserResourcePath(String relativePath) {
        String fileSeparator = getFileSeparator();
        String userDirectory = getUserDirectory();
        String resourcePath = userDirectory + fileSeparator + relativePath;
        return resourcePath.replace("/", fileSeparator);
    }

    protected abstract String getFileSeparator();

    protected abstract String getUserDirectory();

}
