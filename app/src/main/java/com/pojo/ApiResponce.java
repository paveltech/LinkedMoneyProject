package com.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lolipop on 3/9/2018.
 */

public class ApiResponce {

    @SerializedName("errors")
    @Expose
    private List<Status> errors = null;

    public List<Status> getErrors() {
        return errors;
    }

    public void setErrors(List<Status> errors) {
        this.errors = errors;
    }
}
