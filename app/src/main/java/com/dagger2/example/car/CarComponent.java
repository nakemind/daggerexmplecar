package com.dagger2.example.car;


import dagger.Component;

@Component(modules = CarModule.class)
public interface CarComponent {
    void inject(Car car);
}
