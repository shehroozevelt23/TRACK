package com.codingwithmitch.googlemaps2018.models;

import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class UserLocation {
    private GeoPoint geo_Point;
    private @ServerTimestamp Date timestamp;
    private  User user;

    public UserLocation(GeoPoint geo_Point, Date timestamp, User user) {
        this.geo_Point = geo_Point;
        this.timestamp = timestamp;
        this.user = user;
    }
    public UserLocation() {
        }

    }
