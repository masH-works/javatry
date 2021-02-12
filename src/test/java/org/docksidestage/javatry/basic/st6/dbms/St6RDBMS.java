/**
 * 
 */
package org.docksidestage.javatry.basic.st6.dbms;

/**
 * @author masH
 */
abstract public class St6RDBMS {

    public St6RDBMS() {
    }

    public int getOffset(int pageSize, int pageNumber) {
        return pageSize * (pageNumber - 1);
    }

    abstract String createPagingQuery(int offset, int pageSize);

    public String buildPagingQuery(int pageSize, int pageNumber) {
        int offset = getOffset(pageSize, pageNumber);
        String query = createPagingQuery(offset, pageSize);
        return query;
    }

}
