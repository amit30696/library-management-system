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
@Table(name = "GPSREG", catalog = "", schema = "AMIT")
@NamedQueries({
    @NamedQuery(name = "Gpsreg.findAll", query = "SELECT g FROM Gpsreg g")
    , @NamedQuery(name = "Gpsreg.findByStuname", query = "SELECT g FROM Gpsreg g WHERE g.stuname = :stuname")
    , @NamedQuery(name = "Gpsreg.findByFname", query = "SELECT g FROM Gpsreg g WHERE g.fname = :fname")
    , @NamedQuery(name = "Gpsreg.findByMname", query = "SELECT g FROM Gpsreg g WHERE g.mname = :mname")
    , @NamedQuery(name = "Gpsreg.findByBranch", query = "SELECT g FROM Gpsreg g WHERE g.branch = :branch")
    , @NamedQuery(name = "Gpsreg.findByYear", query = "SELECT g FROM Gpsreg g WHERE g.year = :year")
    , @NamedQuery(name = "Gpsreg.findByMono", query = "SELECT g FROM Gpsreg g WHERE g.mono = :mono")
    , @NamedQuery(name = "Gpsreg.findByDob", query = "SELECT g FROM Gpsreg g WHERE g.dob = :dob")
    , @NamedQuery(name = "Gpsreg.findByGender", query = "SELECT g FROM Gpsreg g WHERE g.gender = :gender")
    , @NamedQuery(name = "Gpsreg.findByEmail", query = "SELECT g FROM Gpsreg g WHERE g.email = :email")
    , @NamedQuery(name = "Gpsreg.findByAddress", query = "SELECT g FROM Gpsreg g WHERE g.address = :address")
    , @NamedQuery(name = "Gpsreg.findById", query = "SELECT g FROM Gpsreg g WHERE g.id = :id")
    , @NamedQuery(name = "Gpsreg.findByPath", query = "SELECT g FROM Gpsreg g WHERE g.path = :path")})
public class Gpsreg implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "STUNAME")
    private String stuname;
    @Basic(optional = false)
    @Column(name = "FNAME")
    private String fname;
    @Basic(optional = false)
    @Column(name = "MNAME")
    private String mname;
    @Basic(optional = false)
    @Column(name = "BRANCH")
    private String branch;
    @Basic(optional = false)
    @Column(name = "YEAR")
    private String year;
    @Basic(optional = false)
    @Column(name = "MONO")
    private String mono;
    @Basic(optional = false)
    @Column(name = "DOB")
    private String dob;
    @Basic(optional = false)
    @Column(name = "GENDER")
    private String gender;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "ADDRESS")
    private String address;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "PATH")
    private String path;

    public Gpsreg() {
    }

    public Gpsreg(BigDecimal id) {
        this.id = id;
    }

    public Gpsreg(BigDecimal id, String stuname, String fname, String mname, String branch, String year, String mono, String dob, String gender, String email, String address, String path) {
        this.id = id;
        this.stuname = stuname;
        this.fname = fname;
        this.mname = mname;
        this.branch = branch;
        this.year = year;
        this.mono = mono;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.path = path;
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

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        String oldMname = this.mname;
        this.mname = mname;
        changeSupport.firePropertyChange("mname", oldMname, mname);
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

    public String getMono() {
        return mono;
    }

    public void setMono(String mono) {
        String oldMono = this.mono;
        this.mono = mono;
        changeSupport.firePropertyChange("mono", oldMono, mono);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        BigDecimal oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        String oldPath = this.path;
        this.path = path;
        changeSupport.firePropertyChange("path", oldPath, path);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gpsreg)) {
            return false;
        }
        Gpsreg other = (Gpsreg) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "library.Gpsreg[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
