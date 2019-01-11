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
@Table(name = "ADMINREG", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Adminreg.findAll", query = "SELECT a FROM Adminreg a")
    , @NamedQuery(name = "Adminreg.findByName", query = "SELECT a FROM Adminreg a WHERE a.name = :name")
    , @NamedQuery(name = "Adminreg.findByUsername", query = "SELECT a FROM Adminreg a WHERE a.username = :username")
    , @NamedQuery(name = "Adminreg.findByAns", query = "SELECT a FROM Adminreg a WHERE a.ans = :ans")
    , @NamedQuery(name = "Adminreg.findByPassword", query = "SELECT a FROM Adminreg a WHERE a.password = :password")
    , @NamedQuery(name = "Adminreg.findBySecqure", query = "SELECT a FROM Adminreg a WHERE a.secqure = :secqure")
    , @NamedQuery(name = "Adminreg.findByLibid", query = "SELECT a FROM Adminreg a WHERE a.libid = :libid")
    , @NamedQuery(name = "Adminreg.findByMobile", query = "SELECT a FROM Adminreg a WHERE a.mobile = :mobile")})
public class Adminreg implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "NAME")
    private String name;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "ANS")
    private String ans;
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @Column(name = "SECQURE")
    private BigInteger secqure;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "LIBID")
    private BigDecimal libid;
    @Column(name = "MOBILE")
    private Long mobile;

    public Adminreg() {
    }

    public Adminreg(BigDecimal libid) {
        this.libid = libid;
    }

    public Adminreg(BigDecimal libid, BigInteger secqure) {
        this.libid = libid;
        this.secqure = secqure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        String oldAns = this.ans;
        this.ans = ans;
        changeSupport.firePropertyChange("ans", oldAns, ans);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public BigInteger getSecqure() {
        return secqure;
    }

    public void setSecqure(BigInteger secqure) {
        BigInteger oldSecqure = this.secqure;
        this.secqure = secqure;
        changeSupport.firePropertyChange("secqure", oldSecqure, secqure);
    }

    public BigDecimal getLibid() {
        return libid;
    }

    public void setLibid(BigDecimal libid) {
        BigDecimal oldLibid = this.libid;
        this.libid = libid;
        changeSupport.firePropertyChange("libid", oldLibid, libid);
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        Long oldMobile = this.mobile;
        this.mobile = mobile;
        changeSupport.firePropertyChange("mobile", oldMobile, mobile);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (libid != null ? libid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adminreg)) {
            return false;
        }
        Adminreg other = (Adminreg) object;
        if ((this.libid == null && other.libid != null) || (this.libid != null && !this.libid.equals(other.libid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "library.Adminreg[ libid=" + libid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
