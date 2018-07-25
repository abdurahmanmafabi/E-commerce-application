package com.example.abdurahman.ecommerseapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by abdurahman on 16/07/2018.
 */
@Dao
public interface BusinessDao {
    @Query("SELECT * FROM business ")
    List<Business> selectAllBusiness();

    @Query("SELECT * FROM Business WHERE businessId = :businessId")
    Business getSingleBusinessById(int businessId);

    @Insert
    void insertSingleBusiness(Business business);

    @Delete
    void delletBusiness(Business business);



    @Update
    void UpdateBusiness(Business business);



}
