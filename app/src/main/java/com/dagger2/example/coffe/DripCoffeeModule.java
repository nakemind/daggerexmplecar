package com.dagger2.example.coffe;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = PumpModule.class)
public class DripCoffeeModule {

    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }

}
