package com.nhsd.a2si.capacity.reportingservice.api.model.waittime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nhsd.a2si.capacity.reportingservice.data.model.waittime.Service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.Date;

/**
 * A JSON entity of Service Wait Times used by the REST API.
 */
public class WaitTime {

    @NotNull
    private Service service;

    @PositiveOrZero
    private long waitTimeInMinutes;

    @JsonFormat(locale = "en", shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "GMT")
    private Date updated;

    @NotNull
    private Provider provider;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public long getWaitTimeInMinutes() {
        return waitTimeInMinutes;
    }

    public void setWaitTimeInMinutes(long waitTimeInMinutes) {
        this.waitTimeInMinutes = waitTimeInMinutes;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}