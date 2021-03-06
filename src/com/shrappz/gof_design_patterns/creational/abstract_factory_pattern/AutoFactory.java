package com.shrappz.gof_design_patterns.creational.abstract_factory_pattern;

/**
 * Created by Shangeeth on 26/07/18.
 */
public class AutoFactory implements VehicleAbstractFactory {

    private String mManufacturerName, mVehicleModel;
    private int mYearOfMake;

    public AutoFactory(String mManufacturerName, String mVehicleModel, int mYearOfMake) {
        this.mManufacturerName = mManufacturerName;
        this.mVehicleModel = mVehicleModel;
        this.mYearOfMake = mYearOfMake;
    }

    @Override
    public Vehicle createVehicle() {
        return new Auto(mManufacturerName,mVehicleModel,mYearOfMake);
    }
}
