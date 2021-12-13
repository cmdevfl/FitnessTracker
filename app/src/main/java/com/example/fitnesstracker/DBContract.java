package com.example.fitnesstracker;

import android.provider.BaseColumns;

public final class DBContract {

    public static abstract class Exercise implements BaseColumns {
        public static final String TABLE_NAME       = "MuscleGroup";
        public static final String COLUMN_ID = "ID";
        public static final String COLUMN_ExerciseTemplateID = "ExerciseTemplateID";
        public static final String COLUMN_Date = "Date";
    }

    public static abstract class ExerciseTemplate implements BaseColumns {
        public static final String TABLE_NAME       = "ExerciseTemplate";
        public static final String COLUMN_ID = "ID";
        public static final String COLUMN_Name= "Name";
        public static final String COLUMN_MuscleGroupID = "MuscleGroupID";
        public static final String COLUMN_UnitID = "UnitID";
    }

    public static abstract class MuscleGroup implements BaseColumns {
        public static final String TABLE_NAME       = "MuscleGroup";
        public static final String COLUMN_ID = "ID";
        public static final String COLUMN_Name= "Name";
    }

    public static abstract class Set implements BaseColumns {
        public static final String TABLE_NAME       = "Set";
        public static final String COLUMN_ID = "ID";
        public static final String COLUMN_ExerciseID = "ExerciseID";
        public static final String COLUMN_Qty = "Qty";
    }

    public static abstract class Unit implements BaseColumns {
        public static final String TABLE_NAME       = "Unit";
        public static final String COLUMN_ID = "ID";
        public static final String COLUMN_Name = "Name";
        public static final String COLUMN_System = "System";
    }

}
