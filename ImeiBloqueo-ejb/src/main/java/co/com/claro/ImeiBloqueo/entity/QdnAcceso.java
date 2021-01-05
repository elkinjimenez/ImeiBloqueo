/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.ImeiBloqueo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author omarMad
 */
@Entity
@Table(name = "QDN_ACCESO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QdnAcceso.findAll", query = "SELECT q FROM QdnAcceso q")
    , @NamedQuery(name = "QdnAcceso.findByIdAcceso", query = "SELECT q FROM QdnAcceso q WHERE q.idAcceso = :idAcceso")
    , @NamedQuery(name = "QdnAcceso.findByTokenAcceso", query = "SELECT q FROM QdnAcceso q WHERE q.tokenAcceso = :tokenAcceso")
    , @NamedQuery(name = "QdnAcceso.findByMsisdn", query = "SELECT q FROM QdnAcceso q WHERE q.msisdn = :msisdn")
    , @NamedQuery(name = "QdnAcceso.findByImsi", query = "SELECT q FROM QdnAcceso q WHERE q.imsi = :imsi")
    , @NamedQuery(name = "QdnAcceso.findByIccid", query = "SELECT q FROM QdnAcceso q WHERE q.iccid = :iccid")
    , @NamedQuery(name = "QdnAcceso.findByImei", query = "SELECT q FROM QdnAcceso q WHERE q.imei = :imei")
    , @NamedQuery(name = "QdnAcceso.findByRequestDate", query = "SELECT q FROM QdnAcceso q WHERE q.requestDate = :requestDate")
    , @NamedQuery(name = "QdnAcceso.findByTransactionId", query = "SELECT q FROM QdnAcceso q WHERE q.transactionId = :transactionId")
    , @NamedQuery(name = "QdnAcceso.findByCustomerName", query = "SELECT q FROM QdnAcceso q WHERE q.customerName = :customerName")
    , @NamedQuery(name = "QdnAcceso.findByCustomerEmail", query = "SELECT q FROM QdnAcceso q WHERE q.customerEmail = :customerEmail")
    , @NamedQuery(name = "QdnAcceso.findByCustomerId", query = "SELECT q FROM QdnAcceso q WHERE q.customerId = :customerId")
    , @NamedQuery(name = "QdnAcceso.findByOriginId", query = "SELECT q FROM QdnAcceso q WHERE q.originId = :originId")
    , @NamedQuery(name = "QdnAcceso.findByEstadoToken", query = "SELECT q FROM QdnAcceso q WHERE q.estadoToken = :estadoToken")
    , @NamedQuery(name = "QdnAcceso.findByUsuarioCreacion", query = "SELECT q FROM QdnAcceso q WHERE q.usuarioCreacion = :usuarioCreacion")
    , @NamedQuery(name = "QdnAcceso.findByFechaCreacion", query = "SELECT q FROM QdnAcceso q WHERE q.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "QdnAcceso.findByUsuarioModificacion", query = "SELECT q FROM QdnAcceso q WHERE q.usuarioModificacion = :usuarioModificacion")
    , @NamedQuery(name = "QdnAcceso.findByFechaModificacion", query = "SELECT q FROM QdnAcceso q WHERE q.fechaModificacion = :fechaModificacion")})
public class QdnAcceso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ACCESO")
    @SequenceGenerator(name = "QDN_ACCESO_SEQ",
            sequenceName = "QDN_ACCESO_SEQ",
            initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "QDN_ACCESO_SEQ")
    private Long idAcceso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TOKEN_ACCESO")
    private String tokenAcceso;
    @Column(name = "MSISDN")
    private Long msisdn;
    @Column(name = "IMSI")
    private Long imsi;
    @Column(name = "ICCID")
    private Long iccid;
    @Column(name = "IMEI")
    private Long imei;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REQUEST_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TRANSACTION_ID")
    private String transactionId;
    @Size(max = 50)
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Size(max = 50)
    @Column(name = "CUSTOMER_EMAIL")
    private String customerEmail;
    @Size(max = 50)
    @Column(name = "CUSTOMER_ID")
    private String customerId;
    @Size(max = 50)
    @Column(name = "ORIGIN_ID")
    private String originId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ESTADO_TOKEN")
    private String estadoToken;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "USUARIO_CREACION")
    private String usuarioCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Size(max = 50)
    @Column(name = "USUARIO_MODIFICACION")
    private String usuarioModificacion;
    
    @Column(name = "FECHA_MODIFICACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    public QdnAcceso() {
    }

    public QdnAcceso(Long idAcceso) {
        this.idAcceso = idAcceso;
    }

    public QdnAcceso(Long idAcceso, String tokenAcceso, Date requestDate, String transactionId, String estadoToken, String usuarioCreacion, Date fechaCreacion) {
        this.idAcceso = idAcceso;
        this.tokenAcceso = tokenAcceso;
        this.requestDate = requestDate;
        this.transactionId = transactionId;
        this.estadoToken = estadoToken;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(Long idAcceso) {
        this.idAcceso = idAcceso;
    }

    public String getTokenAcceso() {
        return tokenAcceso;
    }

    public void setTokenAcceso(String tokenAcceso) {
        this.tokenAcceso = tokenAcceso;
    }

    public Long getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(Long msisdn) {
        this.msisdn = msisdn;
    }

    public Long getImsi() {
        return imsi;
    }

    public void setImsi(Long imsi) {
        this.imsi = imsi;
    }

    public Long getIccid() {
        return iccid;
    }

    public void setIccid(Long iccid) {
        this.iccid = iccid;
    }

    public Long getImei() {
        return imei;
    }

    public void setImei(Long imei) {
        this.imei = imei;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public String getEstadoToken() {
        return estadoToken;
    }

    public void setEstadoToken(String estadoToken) {
        this.estadoToken = estadoToken;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcceso != null ? idAcceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QdnAcceso)) {
            return false;
        }
        QdnAcceso other = (QdnAcceso) object;
        if ((this.idAcceso == null && other.idAcceso != null) || (this.idAcceso != null && !this.idAcceso.equals(other.idAcceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.ImeiBloqueo.entity.QdnAcceso[ idAcceso=" + idAcceso + " ]";
    }
    
}
