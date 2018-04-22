package com.json.json;

public class CsGoAPI {
    private String volume;

    private String lowest_price;

    private String median_price;

    private String success;

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getLowest_price() {
        return lowest_price;
    }

    public void setLowest_price(String lowest_price) {
        this.lowest_price = lowest_price;
    }

    public String getMedian_price() {
        return median_price;
    }

    public void setMedian_price(String median_price) {
        this.median_price = median_price;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "ClassPojo [volume = " + volume + ", lowest_price = " + lowest_price + ", median_price = " + median_price + ", success = " + success + "]";
    }
}
