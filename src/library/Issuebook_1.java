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
import java.math.BigInteger;
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
@Table(name = "ISSUEBOOK", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Issuebook_1.findAll", query = "SELECT i FROM Issuebook_1 i")
    , @NamedQuery(name = "Issuebook_1.findByBookname", query = "SELECT i FROM Issuebook_1 i WHERE i.bookname = :bookname")
    , @NamedQuery(name = "Issuebook_1.findByAuthorname", query = "SELECT i FROM Issuebook_1 i WHERE i.authorname = :authorname")
    , @NamedQuery(name = "Issuebook_1.findByStuname", query = "SELECT i FROM Issuebook_1 i WHERE i.stuname = :stuname")
    , @NamedQuery(name = "Issuebook_1.findByFname", query = "SELECT i FROM Issuebook_1 i WHERE i.fname = :fname")
    , @NamedQuery(name = "Issuebook_1.findByBranch", query = "SELECT i FROM Issuebook_1 i WHERE i.branch = :branch")
    , @NamedQuery(name = "Issuebook_1.findByYear", query = "SELECT i FROM Issuebook_1 i WHERE i.year = :year")
    , @NamedQuery(name = "Issuebook_1.findByIod", query = "SELECT i FROM Issuebook_1 i WHERE i.iod = :iod")
    , @NamedQuery(name = "Issuebook_1.findByImage", query = "SELECT i FROM Issuebook_1 i WHERE i.image = :image")
    , @NamedQuery(name = "Issuebook_1.findByStuid", query = "SELECT i FROM Issuebook_1 i WHERE i.stuid = :stuid")
    , @NamedQuery(name = "Issuebook_1.findByMobile", query = "SELECT i FROM Issuebook_1 i WHERE i.mobile = :mobile")
    , @NamedQuery(name = "Issuebook_1.findByBookid", query = "SELECT i FROM Issuebook_1 i WHERE i.bookid = :bookid")})
public class Issuebook_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "BOOKNAME")
    private String bookname;
    @Basic(optional = false)
    @Column(name = "AUTHORNAME")
    private String authorname;
    @Basic(optional = false)
    @Column(name = "STUNAME")
    private String stuname;
    @Basic(optional = false)
    @Column(name = "FNAME")
    private String fname;
    @Basic(optional = false)
    @Column(name = "BRANCH")
    private String branch;
    @Basic(optional = false)
    @Column(name = "YEAR")
    private String year;
    @Basic(optional = false)
    @Column(name = "IOD")
    private String iod;
    @Basic(optional = false)
    @Column(name = "IMAGE")
    private String image;
    @Basic(optional = false)
    @Column(name = "STUID")
    private BigInteger stuid;
    @Basic(optional = false)
    @Column(name = "MOBILE")
    private long mobile;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "BOOKID")
    private BigDecimal bookid;

    public Issuebook_1() {
    }

    public Issuebook_1(BigDecimal bookid) {
        this.bookid = bookid;
    }

    public Issuebook_1(BigDecimal bookid, String bookname, String authorname, String stuname, String fname, String branch, String year, String iod, String image, BigInteger stuid, long mobile) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.authorname = authorname;
        this.stuname = stuname;
        this.fname = fname;
        this.branch = branch;
        this.year = year;
        this.iod = iod;
        this.image = image;
        this.stuid = stuid;
        this.mobile = mobile;
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

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        String oldStuname = this.stuname;
        this.stuname = stuname;
        changeSupport.firePropertyChange("stuname", oldStuname, stuname);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        String oldFname = this.fname;
        this.fname = fname;
        changeSupport.firePropertyChange("fname", oldFname, fname);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        String oldBranch = this.branch;
        this.branch = branch;
        changeSupport.firePropertyChange("branch", oldBranch, branch);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        String oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    public String getIod() {
        return iod;
    }

    public void setIod(String iod) {
        String oldIod = this.iod;
        this.iod = iod;
        changeSupport.firePropertyChange("iod", oldIod, iod);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        String oldImage = this.image;
        this.image = image;
        changeSupport.firePropertyChange("image", oldImage, image);
    }

    public BigInteger getStuid() {
        return stuid;
    }

    public void setStuid(BigInteger stuid) {
        BigInteger oldStuid = this.stuid;
        this.stuid = stuid;
        changeSupport.firePropertyChange("stuid", oldStuid, stuid);
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        long oldMobile = this.mobile;
        this.mobile = mobile;
        changeSupport.firePropertyChange("mobile", oldMobile, mobile);
    }

    public BigDecimal getBookid() {
        return bookid;
    }

    public void setBookid(BigDecimal bookid) {
        BigDecimal oldBookid = this.bookid;
        this.bookid = bookid;
        changeSupport.firePropertyChange("bookid", oldBookid, bookid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookid != null ? bookid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Issuebook_1)) {
            return false;
        }
        Issuebook_1 other = (Issuebook_1) object;
        if ((this.bookid == null && other.bookid != null) || (this.bookid != null && !this.bookid.equals(other.bookid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "library.Issuebook_1[ bookid=" + bookid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
