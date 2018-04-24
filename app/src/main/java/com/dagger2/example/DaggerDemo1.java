package com.dagger2.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.dagger2.example.car.Car;
import com.dagger2.example.car.CarModule;
import com.dagger2.example.car.Config;
import com.dagger2.example.car.Engine;
import com.dagger2.example.car.Seat;
import com.dagger2.example.car.Wheel;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

public class DaggerDemo1 extends AppCompatActivity {


//    @Singleton
//    @Component(modules = { DripCoffeeModule.class })
//    public interface CoffeeShop {
//        CoffeeMaker maker();
//    }
    @Inject
    Car test1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("akui",test1.toString());



//        CoffeeShop coffeeShop = DaggerDaggerDemo1_CoffeeShop.builder().build();
//        coffeeShop.maker().brew();
        //CoffeeShop coffeeShop = Dagger_CoffeeShop.builder().build();
        //coffeeShop.maker().brew();


//        DaggerCarComponent
//                .builder()
//                .carModule(new CarModule())
//                .build()
//                .inject(this);
//        Log.d(Config.TAG, "new Car()");

    }

}
