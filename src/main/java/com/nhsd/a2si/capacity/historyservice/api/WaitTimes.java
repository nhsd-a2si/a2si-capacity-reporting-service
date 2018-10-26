package com.nhsd.a2si.capacity.historyservice.api;

import com.nhsd.a2si.capacity.historyservice.data.model.WaitTime;
import com.nhsd.a2si.capacity.historyservice.services.WaitTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Component
@Path("/wait-times")
public class WaitTimes {

    @Autowired
    private WaitTimeService waitTimeService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addWaitTime(@Valid com.nhsd.a2si.capacity.historyservice.api.model.WaitTime waitTime) {
        WaitTime wt = waitTimeService.store(waitTime);
        return Response.created(URI.create("/wait-times/" + wt.getId())).build();
    }

}