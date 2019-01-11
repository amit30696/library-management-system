/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author AMIT TIWARI
 */
@Entity
@Table(name = "ADD_BOOK", catalog = "", schema = "AMIT")
@NamedQueries({
    @NamedQuery(name = "AddBook_1.findAll", query = "SELECT a FROM AddBook_1 a")
    , @NamedQuery(name = "AddBook_1.findByBookId", query = "SELECT a FROM AddBook_1 a WHERE a.bookId = :bookId")
    , @NamedQuery(name = "AddBook_1.findByBookname", query = "SELECT a FROM AddBook_1 a WHERE a.bookname = :bookname")
    , @NamedQuery(name = "AddBook_1.findByAuthorname", query = "SELECT a FROM AddBook_1 a WHERE a.authorname = :authorname")
    , @NamedQuery(name = "AddBook_1.findByBranch", query = "SELECT a FROM AddBook_1 a WHERE a.branch = :branch")
    , @NamedQuery(name = "AddBook_1.findByAlmirah", query = "SELECT a FROM AddBook_1 a WHERE a.almirah = :almirah")})
public class AddBook_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "BOOK_ID")
    private BigDecimal bookId;
    @Basic(optional = false)
    @Column(name = "BOOKNAME")
    private String bookname;
    @Basic(optional = false)
    @Column(name = "AUTHORNAME")
    private String authorname;
    @Basic(optional = false)
    @Column(name = "BRANCH")
    private String branch;
    @Basic(optional = false)
    @Column(name = "ALMIRAH")
    private String almirah;

    public AddBook_1() {
    }

    public AddBook_1(BigDecimal bookId) {
        this.bookId = bookId;
    }

    public AddBook_1(BigDecimal bookId, String bookname, String authorname, String branch, String almirah) {
        this.bookId = bookId;
        this.bookname = bookname;
        this.authorname = authorname;
        this.branch = branch;
        this.almirah = almirah;
    }

    public BigDecimal getBookId() {
        return bookId;
    }

    public void setBookId(BigDecimal bookId) {
        BigDecimal oldBookId = this.bookId;
        this.bookId = bookId;
        changeSupport.firePropertyChange("bookId", oldBookId, bookId);
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        String oldBookname = this.bookname;
        this.bookname = bookname;
        changeSupport.firePropertyChange("bookname", oldBookname, bookname);
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        String oldAuthorname = this.authorname;
        this.authorname = authorname;
        changeSupport.firePropertyChange("authorname", oldAuthorname, authorname);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        String oldBranch = this.branch;
        this.branch = branch;
        changeSupport.firePropertyChange("branch", oldBranch, branch);
    }

    public String getAlmirah() {
        return almirah;
    }

    public void setAlmirah(String almirah) {
        String oldAlmirah = this.almirah;
        this.almirah = almirah;
        changeSupport.firePropertyChange("almirah", oldAlmirah, almirah);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookId != null ? bookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AddBook_1)) {
            return false;
        }
        AddBook_1 other = (AddBook_1) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "library.AddBook_1[ bookId=" + bookId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
