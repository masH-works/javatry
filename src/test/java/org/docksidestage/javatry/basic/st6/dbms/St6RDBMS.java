/**
 * 
 */
package org.docksidestage.javatry.basic.st6.dbms;

/**
 * @author masH
 */
public abstract class St6RDBMS {

    public St6RDBMS() {
    }

    public String buildPagingQuery(int pageSize, int pageNumber) {
        int offset = getOffset(pageSize, pageNumber);
        String query = doBuildingPagingQuery(offset, pageSize);
        return query;
    }

    private int getOffset(int pageSize, int pageNumber) {
        return pageSize * (pageNumber - 1);
    }

    protected abstract String doBuildingPagingQuery(int offset, int pageSize);

}
