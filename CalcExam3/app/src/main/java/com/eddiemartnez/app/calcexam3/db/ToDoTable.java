package com.eddiemartnez.app.calcexam3.db;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by Eddie Martínez on 5/2/2018.
 */
@Table(database = ToDoDatabase.class)
public class ToDoTable extends BaseModel{
    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    public double numerofinal;


    @Column
    public int estado;


}
