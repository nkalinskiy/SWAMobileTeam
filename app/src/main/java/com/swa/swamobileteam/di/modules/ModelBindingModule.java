package com.swa.swamobileteam.di.modules;

import com.swa.swamobileteam.di.ActivityScope;
import com.swa.swamobileteam.ui.deliveryGroups.DeliveryGroupsContract;
import com.swa.swamobileteam.ui.deliveryGroups.DeliveryGroupsModel;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ModelBindingModule {

    @Binds
    @ActivityScope
    public abstract DeliveryGroupsContract.Model bindDelireGroupsModel(DeliveryGroupsModel model);

}