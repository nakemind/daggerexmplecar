package com.dagger2.example.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    @Inject
    Engine engine;
    @Inject
    Seat seat;
    @Inject
    Wheel wheel;
    //    private Engine engine;
    //    private Seat seat;
    //    private Wheel wheel;

    public Car() {
        //        engine = new Engine();
        //        seat = new Seat();
        //        wheel = new Wheel();

        //DaggerCarComponent
//                .builder()
//                .carModule(new CarModule())
//                .build()
//                .inject(this);
        //        DaggerCarComponent
//                .builder()
//                .carModule(new CarModule())
//                .build()
//                .inject(this);
        Log.d(Config.TAG, "new Car()");

    }

}
