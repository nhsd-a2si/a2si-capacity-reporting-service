package com.nhsd.a2si.capacity.reportingservice.data.model.log;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * CREATE TABLE log_header (
 *   id BIGSERIAL PRIMARY KEY,
 *   action VARCHAR(4),
 *   component VARCHAR(25),
 *   user_id VARCHAR(25),
 *   endpoint VARCHAR(255),
 *   req_res_hashcode VARCHAR(10),
 *   timestamp TIMESTAMP DEFAULT NOW()
 * );
 */
@Entity
@Table(name="log_header")
public class Header {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "action")
    private String action;

    @Column(name = "component")
    private String component;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "endpoint")
    private String endpoint;

    @Column(name = "req_res_hashcode")
    private String hashcode;

    @Column(name = "timestamp")
    private Date timestamp;

    @OneToMany(mappedBy = "header", cascade = CascadeType.ALL)
    private List<Detail> details = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }
}
